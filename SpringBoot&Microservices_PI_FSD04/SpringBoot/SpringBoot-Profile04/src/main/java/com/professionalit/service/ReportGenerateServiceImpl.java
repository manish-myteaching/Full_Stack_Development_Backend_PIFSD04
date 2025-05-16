package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professionalit.factory.ReportGenerate;
import com.professionalit.factory.ReportGenerateFactoryBean;

@Service
public class ReportGenerateServiceImpl implements ReportGenerateService {

	@Autowired
	private ReportGenerateFactoryBean reportGenerateFactoryBean;

	public ReportGenerateServiceImpl() {
		System.out.println("ReportGenerateServiceImpl");
	}

	@Override
	public void generateReport(String type) {
		ReportGenerate reportGenerate = reportGenerateFactoryBean.createReportGenerator(type);
		reportGenerate.generateReport();
		System.out.println(type + " Report Generate Successfully..!");
	}

}
