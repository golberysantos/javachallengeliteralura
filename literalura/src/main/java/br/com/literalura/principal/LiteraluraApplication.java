package br.com.literalura.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.literalura.livro.controller.LivroController;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.literalura.livro.service", 
		"br.com.literalura.livro.model.repository",
		"br.com.literalura.livro.controller",
		"br.com.literalura.livro.config",
		"br.com.literalura.livro.model"
		})
public class LiteraluraApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(LiteraluraApplication.class, args);	
		System.out.println("heloo");
		LivroController lctrl = new LivroController();		
		lctrl.escolha();
		
	}	
	
	
	

	


}
