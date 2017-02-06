package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int countPar =0;
		int countImpar =0;
		int j=0;
		int h=0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i + " do Vetor A");
			vetorA[i]= scan.nextInt();	
			
			if (vetorA[i]%2==0) {
				countPar++;
			}else {
				countImpar++;
			}
		}
		
		int[] vetorB = new int[countPar];
		int[] vetorC = new int[countImpar];

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i]%2==0) {
				vetorB[j]=vetorA[i];
				j++;
			}else {
				vetorC[h]=vetorA[i];
				h++;
			}
			
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B posição " + vetorB[i]);
		}
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("Vetor C posição " + vetorC[i]);
		}
	
		
		}

	}
