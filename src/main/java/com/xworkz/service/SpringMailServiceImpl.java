package com.xworkz.service;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

@Service
public class SpringMailServiceImpl implements SpringMailService {

	private static final Logger logger = Logger.getLogger(SpringMailServiceImpl.class.getName());

	@Autowired
	private JavaMailSender mailSender;

	public SpringMailServiceImpl() {
		logger.info("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSendMailByMailId(MimeMessagePreparator messagePreparator) {
		logger.info("invoked validateAndSendMailByMailId of SpringMailServiceImpl...");

		try {
			mailSender.send(messagePreparator);
			logger.info("Mail sent successfully");
			return true;
		} catch (MailException e) {
			logger.info("Mail sent Faild!");
			logger.severe(e.getMessage());
		}
		return false;
	}

}
