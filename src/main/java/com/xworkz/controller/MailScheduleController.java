package com.xworkz.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.service.MailSchedular;

@RestController
@RequestMapping("/corn")
public class MailScheduleController {
	
	private static final Logger logger = Logger.getLogger(MailScheduleController.class.getName());		
	
	@Autowired
	private MailSchedular mailSchedular;

	@RequestMapping(value = "/mailSchedule.do", method = RequestMethod.GET)
	public String sendScheduleMail() {
		logger.info("invoked onLogin()...");
		try {
			mailSchedular.birthadyMailSender();
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
			logger.severe("error="+e);
		}
		return "";
	}	
	
	
}
