package com.demo.dashboard.utility.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesExternos {
	/************************
	 * BD INSIDETESTDB *
	 ************************/

	//@Value("${spring.datasource.url}")
	//public String url_insidetest;

	//@Value("${spring.datasource.username}")
	//public String username_insidetest;

	//@Value("${spring.datasource.password}")
	//public String pass_insidetest;


	/************************
	 * IDT E IDF *
	 ************************/

	@Value("${dashboard.utilities.idf1.codigo}")
	public String dashboard_utilities_Idf1_Codigo;
	@Value("${dashboard.utilities.idf1.mensaje}")
	public String dashboard_utilities_Idf1_Mensaje;

	@Value("${dashboard.utilities.idf2.codigo}")
	public String dashboard_utilities_Idf2_Codigo;
	@Value("${dashboard.utilities.idf2.mensaje}")
	public String dashboard_utilities_Idf2_Mensaje;

	@Value("${dashboard.utilities.idf3.codigo}")
	public String dashboard_utilities_Idf3_Codigo;
	@Value("${dashboard.utilities.idf3.mensaje}")
	public String dashboard_utilities_Idf3_Mensaje;

	@Value("${dashboard.utilities.idt1.codigo}")
	public String dashboard_utilities_Idt1_Codigo;
	@Value("${dashboard.utilities.idt1.mensaje}")
	public String dashboard_utilities_Idt1_Mensaje;

	@Value("${dashboard.utilities.idt2.codigo}")
	public String dashboard_utilities_Idt2_Codigo;
	@Value("${dashboard.utilities.idt2.mensaje}")
	public String dashboard_utilities_Idt2_Mensaje;

	@Value("${dashboard.utilities.idt3.codigo}")
	public String dashboard_utilities_Idt3_Codigo;
	@Value("${dashboard.utilities.idt3.mensaje}")
	public String dashboard_utilities_Idt3_Mensaje;

}