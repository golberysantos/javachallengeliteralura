package br.com.literalura.livro.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configuration //** habilitar caso queira configurar o banco via class em vez do arquivo 'application.properties'.
//@ComponentScan("com.baeldung.jdbc") //** habilitar caso queira configurar o banco via class em vez do arquivo 'application.properties'.
public class SpringJdbcConfig {
	//@Bean //** habilitar caso queira configurar o banco via class em vez do arquivo 'application.properties'.
	public DataSource mysqlDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/literalura");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	return dataSource;
	}
}
