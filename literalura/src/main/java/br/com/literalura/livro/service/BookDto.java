package br.com.literalura.livro.service;

/*
 "id": <number of Project Gutenberg ID>,
  "title": <string>,
  "subjects": <array of strings>,
  "authors": <array of Persons>,
  "translators": <array of Persons>,
  "bookshelves": <array of strings>,
  "languages": <array of strings>,
  "copyright": <boolean or null>,
  "media_type": <string>,
  "formats": <Format>,
  "download_count": <number> 
 */
public record BookDto(
		int id, 
		String title, 
		String[] subjects 
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
