package luciano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] tauleiro = new String[3][3];
		String letraTabela = " ";

		int ini = 1;
		int numTabela = 0;
		int x = 0;
		int y = 0;

		boolean validaNumero = true;
		boolean validaLetra = true;

		for (int i = 0; i < tauleiro.length; i++) {
			for (int j = 0; j < tauleiro[i].length; j++) {
				tauleiro[i][j] = "\"" + ini + "\"";
				ini++;
			}
		}

		System.out.println("Tabuleiro:");
		System.out.println("----------------------");

		for (String[] show : tauleiro) {
			for (String show1 : show) {
				System.out.print(" | " + show1 + " | ");
			}

			System.out.println();
			System.out.println("----------------------");
		}

		for (int i = 1; i <= 9; i++) {

			while (validaNumero) {

				System.out.println("Digite o numero da posição que deseja jogar: ");
				numTabela = scan.nextInt();

				if (numTabela >= 1 && numTabela <= 9) {
					// validaNumero = false;
					break;
				} else {
					System.out.println("Numero inválido, digite novamente");
				}

			}

			switch (numTabela) {
			case 1:
				x = 0;
				y = 0;
				break;
			case 2:
				x = 0;
				y = 1;
				break;
			case 3:
				x = 0;
				y = 2;
				break;
			case 4:
				x = 1;
				y = 0;
				break;
			case 5:
				x = 1;
				y = 1;
				break;
			case 6:
				x = 1;
				y = 2;
				break;
			case 7:
				x = 2;
				y = 0;
				break;
			case 8:
				x = 2;
				y = 1;
				break;
			case 9:
				x = 2;
				y = 2;
				break;
			}

			while (validaLetra) {

				System.out.println("Digite O ou X: ");
				letraTabela = scan.next().toUpperCase();

				if (letraTabela.equalsIgnoreCase("o") || letraTabela.equalsIgnoreCase("x")) {
					// validaLetra = false;
					break;
				} else {
					System.out.println("Letra inválida, digite novamente");
				}

			}

			tauleiro[x][y] = "\"" + letraTabela + "\"";

			System.out.println("Tabuleiro:");
			System.out.println("----------------------");

			for (String[] show : tauleiro) {
				for (String show1 : show) {
					System.out.print(" | " + show1 + " | ");
				}

				System.out.println();
				System.out.println("----------------------");
			}
			

			int  j = 0, k = 0, l = 1, m = 2;

				// vertical

				if (tauleiro[j][k].equals(tauleiro[j][l])  && tauleiro[j][k].equals(tauleiro[j][m])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][k] + " ganhou!");
					break;
				}
				j++;
				if (tauleiro[j][k].equals(tauleiro[j][l]) && tauleiro[j][k].equals(tauleiro[j][m])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][k] + " ganhou!");
					break;
				}
				j++;
				if (tauleiro[j][k].equals(tauleiro[j][l]) && tauleiro[j][k].equals(tauleiro[j][m])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][k] + " ganhou!");
					break;
				}

				j = 0;

				// horizontal
				if (tauleiro[j][k].equals(tauleiro[l][k]) && tauleiro[j][k].equals(tauleiro[m][k])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][k] + " ganhou!");
					break;
				}
				if (tauleiro[j][l].equals(tauleiro[l][l]) && tauleiro[j][l].equals(tauleiro[m][l])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][l] + " ganhou!");
					break;
				}
				if (tauleiro[j][m].equals(tauleiro[l][m]) && tauleiro[j][m].equals(tauleiro[m][m])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][m] + " ganhou!");
					break;
				}

				// diagonais
				if (tauleiro[j][k].equals(tauleiro[l][l]) && tauleiro[j][k].equals(tauleiro[m][m])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][k] + " ganhou!");
					break;
				}
				if (tauleiro[m][k].equals(tauleiro[l][l]) && tauleiro[m][k].equals(tauleiro[j][m])) {
					System.out.println("Fim de jogo letra " + tauleiro[j][m] + " ganhou!");
					break;
				}			

		}

	}

}
