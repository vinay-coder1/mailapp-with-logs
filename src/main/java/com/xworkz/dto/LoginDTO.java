package com.xworkz.dto;

import java.io.Serializable;

import java.util.logging.Logger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(LoginDTO.class.getName());
	private String userName;
	private String password;

	public LoginDTO() {
		logger.info("{} Is Created..........."+ this.getClass().getSimpleName());
	}

}
