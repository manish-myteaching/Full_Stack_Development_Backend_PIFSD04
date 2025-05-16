package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerateFactoryBean {

	@Autowired
	ApplicationContext applicationContext;

	public ReportGenerate createReportGenerator(String reportType) {
		switch (reportType.toLowerCase()) {
		case "pdf":
			return applicationContext.getBean(PdfReportGenerate.class);
		case "excel":
			return applicationContext.getBean(ExcelReportGenerate.class);
		case "text":
			return applicationContext.getBean(TextReportGenerate.class);
		default:
			throw new IllegalArgumentException("Unkonwn report Type: " + reportType);
		}
	}

}
