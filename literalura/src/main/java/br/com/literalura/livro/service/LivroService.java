package br.com.literalura.livro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.literalura.livro.config.Conexao;

@Service
public class LivroService {
	
	//private final ApplicationContext context = new AnnotationConfigApplicationContext(Conexao.class);
	
 
    
	public void salvarLivro() {

		/*
		 * @Query("INSERT INTO livro (id, titulo, autor) VALUES (:id, :titulo, :autor) ON DUPLICATE KEY UPDATE titulo = :titulo, autor = :autor"
		 * ) public void salvarLivro(Livro livro) {
		 * 
		 * }
		 */

		// Inicializa a aplicação Spring e obtém o ApplicationContext
		
		System.out.println(Conexao.getConnection()); 

		// Obtém o bean UserController do contexto
		
	}

}
