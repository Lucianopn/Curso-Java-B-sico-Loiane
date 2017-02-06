package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		String[] vetorB = new String[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 7) {
				vetorB[i] = "a";
			}
			if (vetorA[i] == 7) {
				vetorB[i] = "b";
			}
			if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = "c";
			}
			if (vetorA[i] == 10) {
				vetorB[i] = "d";
			}
			if (vetorA[i] > 10) {
				vetorB[i] = "e";
			}
		}

		for (int j = 0; j < vetorA.length; j++) {
			System.out.println("Vetor A posição " + vetorA[j]);
			System.out.println("Vetor B posição " + vetorB[j]);
		}

	}

}
