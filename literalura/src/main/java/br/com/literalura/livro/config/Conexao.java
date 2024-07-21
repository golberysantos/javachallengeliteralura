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

	private final Environment ENV;

	@Autowired
    public Conexao(Environment env) {
        this.ENV = env;
    }

	@Bean
	public Connection conectar() {
		String url = ENV.getProperty("spring.datasource.url");
		System.out.println("spring.datasource.url: " + url);
		String jdbcUrl = url;
		String username = "root";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			System.out.println("Conexão ao banco de dados bem-sucedida!");
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
