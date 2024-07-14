package br.com.literalura.livro.service;

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
		BookDto[] results) // ": <array of Books>
{

}
