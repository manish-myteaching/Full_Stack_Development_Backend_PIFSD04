package com.professionalit.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:foo.properties")
@PropertySource(value = "classpath:bar.properties")
public class DataBaseConfig {

	@Value(value = "${spring.datasource.url}")
	private String jdbcUrl;
	@Value(value = "${spring.datasource.username}")
	private String jdbcUserName;
	@Value(value = "${spring.datasource.password}")
	private String jdbcPassword;

	@Value(value = "${bar.custom.property}")
	private String fooProperty;

	@Value(value = "${foo.custom.property}")
	private String barProperty;

	@Value(value = "${myapp.env.list}")
	private List<String> envList;

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getJdbcUserName() {
		return jdbcUserName;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public String getFooProperty() {
		return fooProperty;
	}

	public String getBarProperty() {
		return barProperty;
	}

	public List<String> getEnvList() {
		return envList;
	}
   
}
