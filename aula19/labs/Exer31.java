package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int countPar =0;
		int countImpar =0;
		int j=0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um n�mero para a posi��o " + i + " do Vetor A");
			vetorA[i]= scan.nextInt();	
			
			if (vetorA[i]%2==0) {
				countPar++;
			}else {
				countImpar++;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i]%2==0) {
				vetorB[j]=vetorA[i];
				j++;
			}		
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i]%2!=0) {
				vetorB[j]=vetorA[i];
				j++;
			}		
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A posi��o " + vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B posi��o " + vetorB[i]);
		}
		
	
		
		}

	}
