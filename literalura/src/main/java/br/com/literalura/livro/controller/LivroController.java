package br.com.literalura.livro.controller;

import java.io.IOException;

import br.com.literalura.livro.service.ApiGutendexService;
import br.com.literalura.livro.service.BookDto;

public class LivroController {
	
	public String buscarLivroPeloTituloOuAuthor(String textoDeConsulta) throws IOException, InterruptedException {		
		ApiGutendexService ags = new ApiGutendexService();
		String json = ags.buscar(textoDeConsulta);
		
		BookDto bookDto = ags.renderizarDto(json);
		System.out.println(bookDto.results().getFirst());
		return "foiiii";
	}
	
}
