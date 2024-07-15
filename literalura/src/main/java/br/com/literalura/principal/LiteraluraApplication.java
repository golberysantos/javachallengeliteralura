package br.com.literalura.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.literalura.livro.service.LivroService;
import br.com.literalura.telaconsole.TelaMenu;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.literalura.livro.service", "br.com.literalura.livro.model.repository"})
public class LiteraluraApplication {
	
	private LivroService livroService;

	@Autowired
	public LiteraluraApplication(LivroService livroService) {
		this.livroService = livroService;
	}

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
		TelaMenu.exibir();
	}
	
	public void opcoes() {
		
	}

}
