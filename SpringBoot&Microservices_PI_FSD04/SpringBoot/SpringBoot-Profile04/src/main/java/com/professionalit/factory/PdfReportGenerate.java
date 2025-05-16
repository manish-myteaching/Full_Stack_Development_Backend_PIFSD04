package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.professionalit.dao.ReportGenerateDAO;

@Component
@Scope("prototype")
public class PdfReportGenerate implements ReportGenerate {
	
	public PdfReportGenerate() {
		System.out.println("PdfReportGenerate");
	}

	@Autowired
	private ReportGenerateDAO reportGenerateDAO;

	@Override
	public void generateReport() {
		reportGenerateDAO.generateReport();
		// get the data from database
		// create input
		// writ itext logic
		System.out.println("Generate Pdf Report");
	}

}
