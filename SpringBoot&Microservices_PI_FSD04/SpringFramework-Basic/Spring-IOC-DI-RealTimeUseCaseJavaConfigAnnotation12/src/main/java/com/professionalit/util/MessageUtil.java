package com.professionalit.util;

import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

	public MessageUtil() {
		System.out.println("MessageUtil Object is Created");
	}

	public void sendMessage() {
		System.out.println("Send Message");
	}
}
