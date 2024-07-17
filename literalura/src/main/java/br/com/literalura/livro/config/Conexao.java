package br.com.literalura.livro.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class Conexao {
	
	private final Environment env;

    public Conexao(Environment env) {
        this.env = env;
    }
	public void conectar(String[] args) {
		String url = env.getProperty("spring.datasource.url");
        System.out.println("spring.datasource.url: " + url);
		String jdbcUrl = url;
		String username = "root";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			System.out.println("Conexão ao banco de dados bem-sucedida!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
