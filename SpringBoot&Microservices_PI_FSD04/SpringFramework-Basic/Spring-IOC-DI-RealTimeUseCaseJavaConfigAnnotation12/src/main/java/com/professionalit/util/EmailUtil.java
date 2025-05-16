package com.professionalit.util;

import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	public EmailUtil() {
		System.out.println("Email Object is Created");
	}

	public void sendEmail() {
		System.out.println("Send Email");
	}

}
