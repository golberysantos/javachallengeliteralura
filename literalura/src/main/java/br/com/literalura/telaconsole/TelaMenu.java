package br.com.literalura.telaconsole;

import org.springframework.stereotype.Controller;

@Controller
public class TelaMenu {

	public static void exibir() {		
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
	}

}
