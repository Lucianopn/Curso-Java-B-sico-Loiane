package luciano.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		Random random = new Random();

		int[][] numAleatorios = new int[4][4];
		String posicao = "";
		int maiorNumero = 0;

		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = random.nextInt(10);
			}
		}

		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				if (numAleatorios[i][j] > maiorNumero) {
					maiorNumero = numAleatorios[i][j];
					posicao = "Linha: "+ i + " " + "Coluna: " + j;
				}
			}
		}

		System.out.println("Matriz Gerada");

		for (int[] matriz : numAleatorios) {
			for (int matriz1 : matriz) {
				System.out.print(matriz1 + " - ");
			}
			System.out.println();		
		}

		System.out.println("\nMaior numero: " + maiorNumero);
		System.out.println(posicao);

	}

}
