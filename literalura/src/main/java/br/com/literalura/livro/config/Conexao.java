package br.com.literalura.livro.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class Conexao {

	private static Environment env;
	private static Connection connection;
	
	public Environment getEnv() {
		return env;
	}
	
	@Autowired
	public void setEnv(Environment env) {
		Conexao.env = env;
	}

	@Bean
	private static Connection conectar() {
		String url = env.getProperty("spring.datasource.url");		
		String jdbcUrl = url;
		String username = "root";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			setConnection(connection);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		Conexao.connection = connection;
	}



}
