package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		int[] vetorC= new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um número para a posição " + i + " do Vetor A");
			vetorA[i]= scan.nextInt();
			System.out.println("Entre com um número para a posição " + i + " do Vetor B");
			vetorB[i]= scan.nextInt();
			
			if (vetorA[i] > vetorB[i]) {
				vetorC[i]=1;
			}if (vetorA[i] == vetorB[i]) {
				vetorC[i]=0;
			} if (vetorA[i] < vetorB[i]) {
				vetorC[i]=-1;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A posição " + vetorA[i]);
			System.out.println("Vetor B posição " + vetorB[i]);
			System.out.println("Vetor C posição " + vetorC[i]);
		}
		
		}

	}
