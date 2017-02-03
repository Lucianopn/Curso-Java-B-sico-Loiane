package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de  pessoas: ");
		int num = scan.nextInt();
		int count = 0;
		
		int[] vetorIdade = new int[num];

		for (int i = 0; i < vetorIdade.length; i++) {

			System.out.println("Entre com a idade da pessoa " + i);
			vetorIdade[i] = scan.nextInt();
			}
		
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] >35) {
				count++;
			}
		}
		
		System.out.println("Quantidade de pessoas que possuem idade superior a 35 anos, igual a: " + count);

	}

}
