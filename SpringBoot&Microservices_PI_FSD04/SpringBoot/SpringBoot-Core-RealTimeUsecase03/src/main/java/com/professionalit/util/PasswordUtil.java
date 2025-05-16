package com.professionalit.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.stereotype.Component;


@Component
public class PasswordUtil {

	public PasswordUtil() {
		System.out.println("PasswordUtil Object is Created");
	}

	public void passwordEncrypted() {
		System.out.println("password encrtpted");
	}

	public String encode(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes());
			return Base64.getEncoder().encodeToString(hash);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error encoding password", e);
		}
	}

	public boolean matches(String password, String encodedPassword) {
		String newEncodedPassword = encode(password);
		return newEncodedPassword.equals(encodedPassword);
	}

}
