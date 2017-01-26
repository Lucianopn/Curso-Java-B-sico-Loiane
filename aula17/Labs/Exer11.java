package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);

		System.out.println("Digite o 1° numero: ");
		int num1 = value.nextInt();

		System.out.println("Digite o 1° numero: ");
		int num2 = value.nextInt();

		int soma=0;

		if (num1 < num2) {

			for (; num1 <= num2; num1++) {
				System.out.print(num1 + " ");
				soma+=num1;

			}
			System.out.println("\nsoma: " + soma);

		} else {
			for (; num2 <= num1; num2++) {
				System.out.print(num2 + " ");
				soma+=num2;

			}
			System.out.println("\nsoma: " + soma);

		}
	}
}
