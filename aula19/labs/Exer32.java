package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int num2 = 0;
		int j = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do Vetor A");
			vetorA[i] = scan.nextInt();
		}

		do {
			for (int i = 0; i <= 10; i++) {
				num2 = vetorA[j] * i;
				System.out.println(vetorA[j] + " X " + i + " = " + num2);
			}
			j++;
		} while (j < vetorA.length);

	}

}
