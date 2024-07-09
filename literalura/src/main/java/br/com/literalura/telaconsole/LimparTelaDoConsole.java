package br.com.literalura.telaconsole;

public class LimparTelaDoConsole {
	public static void limpar() {
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

	}
}
