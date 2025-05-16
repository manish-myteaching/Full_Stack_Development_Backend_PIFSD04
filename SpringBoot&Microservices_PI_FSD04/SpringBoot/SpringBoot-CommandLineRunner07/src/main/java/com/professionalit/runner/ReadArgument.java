package com.professionalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReadArgument implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("ReadArgument is started");
		if (args.length > 0) {
			for (String arg : args) {
				if ("A".equals(arg)) {
					System.out.println("Message to Manish");
				} else if ("B".equals(arg)) {
					System.out.println("Message to Lead");
				}
			}
		}
	}
}
