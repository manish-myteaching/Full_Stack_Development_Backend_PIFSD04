package com.professionalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmailRunner is started");
		if (args.length > 0) {
			for (String arg : args) {
				if (arg.contains("gmail.com")) {
					System.out.println("Mailing To: " + arg);
				}
			}
		}
	}
}
