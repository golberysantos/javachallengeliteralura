package br.com.literalura.livro.service;

import java.util.List;

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
		int count,
		String next,
		String previous,
		List<BookResultsDTO> results
		) {

}
