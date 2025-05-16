package com.professionalit.listerner;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicatonStartListerner {

	public ApplicatonStartListerner() {
		System.out.println("ApplicatonStartListerner Object Created");
	}

	@EventListener
	public void onApplicationStart(ApplicationStartedEvent applicationStartedEvent) {
		System.out.println("Application Start");
	}

}
