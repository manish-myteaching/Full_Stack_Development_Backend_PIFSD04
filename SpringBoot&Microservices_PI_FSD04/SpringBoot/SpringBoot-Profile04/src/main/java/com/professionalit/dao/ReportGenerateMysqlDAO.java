package com.professionalit.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public class ReportGenerateMysqlDAO implements ReportGenerateDAO {

	public ReportGenerateMysqlDAO() {
		System.out.println("ReportGenerateMysqlDAO");
	}

	@Override
	public void generateReport() {
		System.out.println("MySQL report Generated..!");
	}

}
