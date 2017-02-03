package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de  pessoas: ");
		int num = scan.nextInt();
		int menorIdade = 1000;
		int maiorIdade = -1;
		int posicaoMenorIdade=0;
		int posicaoMaiorIdade=0;
		
		int[] vetorIdade = new int[num];

		for (int i = 0; i < vetorIdade.length; i++) {

			System.out.println("Entre com a idade da pessoa " + i);
			vetorIdade[i] = scan.nextInt();
			}
		
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i]<menorIdade) {
				menorIdade=vetorIdade[i];
				posicaoMenorIdade= i;
			} if (vetorIdade[i]>maiorIdade) {
				maiorIdade = vetorIdade[i];
				posicaoMaiorIdade=i;
			}
		}
		
		System.out.println("Menor Idade: " + menorIdade + ",  posição: " + posicaoMenorIdade);
		System.out.println("Menor Idade: " + maiorIdade + ",  posição: " + posicaoMaiorIdade);
		

	}

}
