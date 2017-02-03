package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho da Array: ");
		int num = scan.nextInt();
		
		int[] vetorA = new int[num];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			}
		for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i]%2==0) {
					System.out.println("Números pares: " + vetorA[i]);
				}
		}


	}

}
