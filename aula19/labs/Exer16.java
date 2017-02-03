package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho da Array: ");
		int num = scan.nextInt();
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int countIgual15 = 0;
		int countMedia = 0;
		int[] vetorA = new int[num];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				somaMenor15 +=vetorA[i] ;
			} if (vetorA[i] == 15) {
				countIgual15++;
			} if (vetorA[i] > 15) {
				somaMaior15 +=vetorA[i] ;
				countMedia++;
			}				
		}
		
		System.out.println("Soma de elementos armazenados no vetor que são inferiores a 15: " + somaMenor15);
		System.out.println("Quantidade de elementos armazenados no vetor que são iguais a 15: " + countIgual15);
		System.out.println("média dos elementos armazenados no vetor que são superiores a 15: " + (somaMaior15/countMedia));

	}

}
