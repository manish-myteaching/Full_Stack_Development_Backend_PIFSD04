package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.professionalit.dao.ReportGenerateDAO;

@Component
@Scope("prototype")
public class ExcelReportGenerate implements ReportGenerate {
	
	public ExcelReportGenerate() {
		System.out.println("ExcelReportGenerate");
	}

	@Autowired
	private ReportGenerateDAO reportGenerateDAO;

	@Override
	public void generateReport() {
		// get the data from database
		reportGenerateDAO.generateReport();
		// prepare input for excel api
		// writ poi logic
		System.out.println("Generate Excel Report");

	}

}
