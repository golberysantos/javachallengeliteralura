package br.com.literalura.livro.controller;

import java.io.IOException;

import br.com.literalura.livro.service.ApiGutendexService;

public class LivroController {
	
	public String buscarLivroPeloTituloOuAuthor(String textoDeConsulta) throws IOException, InterruptedException {		
		ApiGutendexService ags = new ApiGutendexService();
		return ags.procurar(textoDeConsulta);
	}	
	
}
