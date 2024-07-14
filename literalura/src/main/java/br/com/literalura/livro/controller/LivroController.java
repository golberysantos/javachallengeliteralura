package br.com.literalura.livro.controller;

import java.io.IOException;

import br.com.literalura.livro.service.ApiGutendexDto;
import br.com.literalura.livro.service.ApiGutendexService;

public class LivroController {

	public String buscarLivroPeloTituloOuAuthor(String textoDeConsulta) {
		String json = "\"Erro. Não foi possível realizar estra operação. Reinicie o sistema e tentenovamente.\"";
		try {
			ApiGutendexService ags = new ApiGutendexService();
			json = ags.buscar(textoDeConsulta);

			ApiGutendexDto agdto = ags.renderizarDto(json);
			System.out
					.println((agdto.results().length == 0) ? json = "Nenhum resultado encoontrado!" : agdto.results());
			if (agdto.results().length == 0) {
				json = "Nenhum resultado encoontrado!";
			} else {
				for (int i = 0; i < agdto.results().length; i++) {
					String  titulo = agdto.results()[i].title();
					System.out.println(titulo);
				}
			}
			return json;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return json;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return json;
		}

	}

}
