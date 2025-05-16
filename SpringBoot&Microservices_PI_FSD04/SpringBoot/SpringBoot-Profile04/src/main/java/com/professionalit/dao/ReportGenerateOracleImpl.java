package com.professionalit.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile({ "uat", "prod" })
public class ReportGenerateOracleImpl implements ReportGenerateDAO {

	public ReportGenerateOracleImpl() {
		System.out.println("ReportGenerateOracleImpl");
	}

	@Override
	public void generateReport() {
		System.out.println("Oracle report Generated..!");

	}

}
