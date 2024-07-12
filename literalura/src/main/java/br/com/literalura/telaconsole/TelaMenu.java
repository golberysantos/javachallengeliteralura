package br.com.literalura.telaconsole;

import java.io.IOException;
import java.util.Scanner;

import br.com.literalura.livro.controller.LivroController;

public class TelaMenu {

	public static void exibir() {
		boolean continuar = true;
		String opcao = "";
		Scanner ler = new Scanner(System.in);
		LimparTelaDoConsole.limpar();
		System.out.println("\n");
		System.out.println("╔═══════════════════════════════════════════════╗");
		System.out.println("║ LiterAlura - Challenge Java. By Golbery       ║");
		System.out.println("╚═══════════════════════════════════════════════╝");
		System.out.println("╔═══════════════════════════════════════════════╗");
		System.out.println("║ Escolha o número de sua opção:                ║");
		System.out.println("║ 1- buscar livro pelo título                   ║");
		System.out.println("║ 2- listar livros registrados                  ║");
		System.out.println("║ 3- listar autores registrados                 ║");
		System.out.println("║ 4- listar autores vivos em um determinado ano ║");
		System.out.println("║ 5- listar livros em um determinado idioma     ║");
		System.out.println("║ 0- sair                                       ║");
		System.out.println("╚═══════════════════════════════════════════════╝");
		System.out.println("");

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

	private static void buscarLivroPeloTitulo() throws IOException, InterruptedException {
		String txtParaConsulta = "";
		Scanner ler = new Scanner(System.in);
		LivroController lc = new LivroController();
		System.out.println("Voçê escolheu a opção 1.");
		System.out.println("\n Dite o título do livro ou o nome do Autor: ");
		txtParaConsulta = ler.nextLine();
		System.out.println(lc.buscarLivroPeloTituloOuAuthor(txtParaConsulta));
		
	}
}
