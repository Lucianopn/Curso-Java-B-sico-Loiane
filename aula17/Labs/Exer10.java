package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);

		System.out.println("Digite o 1° numero: ");
		int num1 = value.nextInt();

		System.out.println("Digite o 1° numero: ");
		int num2 = value.nextInt();

		if (num1 < num2) {

			for (; num1 <= num2; num1++) {
				System.out.print(num1 + " ");
			}

		} else {
			for (; num2 <= num1; num2++) {
				System.out.print(num2 + " ");
			}

		}
	}
}
