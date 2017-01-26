package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		/*		double nota = -1;

		do {
			System.out.println("Digite uma nota válida entre 0 e 10: ");
			nota = value.nextDouble();

		} while (nota < 0 || nota > 10);*/

		boolean notaInvalida = true;

		do {
			System.out.println("Digite uma nota válida entre 0 e 10: ");
			double nota = value.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaInvalida = false;
				System.out.println("Voce digitou a nota: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente");
			}

		} while (notaInvalida);

	}
}
