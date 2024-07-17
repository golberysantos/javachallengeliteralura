package br.com.literalura.livro.controller;

import java.io.IOException;
import java.util.Scanner;

import br.com.literalura.livro.model.Livro;
import br.com.literalura.livro.service.ApiGutendexDto;
import br.com.literalura.livro.service.ApiGutendexService;
import br.com.literalura.livro.service.LivroService;
import br.com.literalura.telaconsole.TelaMenu;


public class LivroController {	

	
	private String buscarLivroPeloTituloOuAuthor(String textoDeConsulta) {
		LivroService livroService;
		String json = "\"Erro. Não foi possível realizar estra operação. Reinicie o sistema e tentenovamente.\"";
		try {
			ApiGutendexService ags = new ApiGutendexService();
			json = ags.buscar(textoDeConsulta);

			ApiGutendexDto agdto = ags.renderizarDto(json);
			if (agdto.results().length == 0) {
				json = "Nenhum resultado encoontrado!";
			} else {
				for (int i = 0; i < agdto.results().length; i++) {
					String titulo = agdto.results()[i].title();
					Livro livro = new Livro();
					livro.setTitle(titulo);
					livroService = new LivroService();
					livroService.salvarLivro(livro);
				}
			}
			return json;
		} catch (IOException e) {
			e.printStackTrace();
			return json;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return json;
		}
	}	

	public void escolha() {
		boolean continuar = true;
		String opcao = "";
		Scanner ler = new Scanner(System.in);
		TelaMenu.exibir();
		opcao = ler.next();

		System.out.println(opcao);
		try {
			switch (opcao) {
			case "0":
				System.out.println("SISTEMA FINALIZADO.");
				continuar = false;
				break;
			case "1":
				buscarLivroPeloTitulo();
				break;

			default:
				System.out.println("Desculpe. A opção selecionada não existe.");
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (continuar)
			TelaMenu.exibir();

	}

	private void buscarLivroPeloTitulo() throws IOException, InterruptedException {
		String txtParaConsulta = "";
		Scanner ler = new Scanner(System.in);
		System.out.println("\nVoçê escolheu a opção 1.");
		System.out.println("\nDite o título do livro ou o nome do Autor: ");
		txtParaConsulta = ler.nextLine();
		String json = buscarLivroPeloTituloOuAuthor(txtParaConsulta);
		System.out.println("Resultado: " + json);

	}
	

	
	
}
