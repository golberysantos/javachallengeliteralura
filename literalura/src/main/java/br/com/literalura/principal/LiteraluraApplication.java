package br.com.literalura.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import br.com.literalura.telaconsole.TelaMenu;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LiteraluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
		TelaMenu.exibir();
	}

}
