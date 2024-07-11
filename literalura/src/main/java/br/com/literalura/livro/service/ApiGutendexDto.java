package br.com.literalura.livro.service;

import java.util.List;

/*
 "count": <number>,
  "next": <string or null>,
  "previous": <string or null>,
  "results": <array of Books>
 */
public record ApiGutendexDto( 
		int count,
		String next,
		 String previous,
		 List<BookDto> results) //": <array of Books> 
		 {

}
