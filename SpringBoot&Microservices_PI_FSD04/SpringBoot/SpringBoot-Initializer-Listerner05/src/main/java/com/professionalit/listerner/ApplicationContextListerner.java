package com.professionalit.listerner;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextListerner {

	public ApplicationContextListerner() {
		System.out.println("ApplicationContextListerner Object Created");
	}

	@EventListener(ApplicationContextInitializedEvent.class)
	public void onApplicationPrepared(ApplicationContextInitializedEvent applicationPreparedEvent) {
		System.out.println("ApplicationContextInitializedEvent Start");
	}
}
