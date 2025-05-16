package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.professionalit.dao.ReportGenerateDAO;

@Component
@Scope("prototype")
public class TextReportGenerate implements ReportGenerate {

	public TextReportGenerate() {
		System.out.println("TextReportGenerate");
	}

	@Autowired
	private ReportGenerateDAO reportGenerateDAO;

	@Override
	public void generateReport() {
		reportGenerateDAO.generateReport();
		// get the data from database
		// create input
		// writ text logic
		System.out.println("Generate Text Report");
	}

}
