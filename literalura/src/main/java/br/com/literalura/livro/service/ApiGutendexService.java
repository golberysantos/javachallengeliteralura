package br.com.literalura.livro.service;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class ApiGutendexService {
	
	private final static String BASE = "https://gutendex.com/books/";
	
	/**
	 * Use this to search author names and book titles with given words
	 * @throws InterruptedException 
	 * @throws IOException 
	 * **/
	public String buscar(String search) throws IOException, InterruptedException {
		String url = BASE+"?search="+search.replace(" ", "%20");
		System.out.println("Procurando por Título ou nome do Autor: "+search+" ...\n");
		ReqHttpClient qhc = new ReqHttpClient(url);
		return qhc.getJson();
	}
	
	public ApiGutendexDto renderizarDto(String json) {
			Gson gson = new Gson();
			// returna o objeto Endereco
			try {
				return gson.fromJson(json, ApiGutendexDto.class);
			} catch (JsonSyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}
}
