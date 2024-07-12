package br.com.literalura.livro.service;

import java.util.List;

public record BookResultsDTO(
		int id, 
		String title, 
		List<String> subjects 
		//List<PessoDto> authors,
		//List<PessoDto> translators,
		//List<String> bookshelves,
		//List<String> languages,
		//boolean copyright,
		//String media_type,
		//String formats,
		//int download_count
		) {

}
