package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[10];
		int count0 = 0;
		int count1 = 0;

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = (int) Math.round (Math.random() * 1);
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				count0++;
			} else if (vetor[i] == 1) {
				count1++;
			} else {
				System.out.println("numero invalido");
			}		

		}
		
		double media0 = (count0*100)/vetor.length;
		double media1 = (count1*100)/vetor.length;
		
		System.out.println("Média numeros 0, igual a % de " + media0 );
		
		System.out.println("Média numeros 1, igual a % de " + media1);

	}

}
