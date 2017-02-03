package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho da Array: ");
		int num = scan.nextInt();
		int soma = 0;
		int countImpar = 0;
		int countPar = 0;
		int[] vetorA = new int[num];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] %2 != 0) {
				countImpar++;
			} else {
				countPar++;
			}
		}
		
		double porcImpar = (countImpar*100) / vetorA.length;
		double porcPar = (countPar*100) / vetorA.length;
		
		System.out.println("Percentual de elementos pares: " + porcPar + "%");
		System.out.println("Percentual de elementos pares: " + porcImpar + "%");

	}

}
