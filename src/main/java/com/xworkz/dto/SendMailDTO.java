package com.xworkz.dto;

import java.util.logging.Logger;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SendMailDTO {

	private static final Logger logger = Logger.getLogger(SendMailDTO.class.getName());

	private Integer msgType;
	private String subName;
	private String listName;
	private String imageURL;
	private String dynamicNews;
	private String courseName;
	private String batchCode;
	private String dateYear;
	private String birthdayQuotes;
	private String startDate;
	private String trainerName;
	private String fees;
	private String fileName;
	private String time;

	public SendMailDTO() {
		logger.info("{} Is Created..........."+ this.getClass().getSimpleName());
	}

}