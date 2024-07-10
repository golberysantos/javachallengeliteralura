package br.com.literalura.livro.service;

import java.io.IOException;

public class ApiGutendexService {
	
	private final static String BASE = "http://www.gutendex.com/books";
	
	/**
	 * Use this to search author names and book titles with given words
	 * @throws InterruptedException 
	 * @throws IOException 
	 * **/
	public String procurar(String search) throws IOException, InterruptedException {
		String url = BASE+"?search="+search.replace(" ", "%20");
		System.out.println("url:"+url);
		ReqHttpClient qhc = new ReqHttpClient(url);
		return qhc.getJson();

	}
}
