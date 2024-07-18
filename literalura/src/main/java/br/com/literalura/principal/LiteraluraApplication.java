package br.com.literalura.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import br.com.literalura.livro.controller.LivroController;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan(basePackages = {
		"br.com.literalura.livro.service", 
		"br.com.literalura.livro.model.repository",
		"br.com.literalura.livro.controller"
		})
public class LiteraluraApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);	
		LivroController lctrl = new LivroController();
		lctrl.escolha();
		
	}
	
			
	
	
	
	
	

	


}
