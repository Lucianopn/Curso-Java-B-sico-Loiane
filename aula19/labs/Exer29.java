package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		int[] vetorC= new int[vetorA.length+vetorB.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um número para a posição " + i + " do Vetor A");
			vetorA[i]= scan.nextInt();
			System.out.println("Entre com um número para a posição " + i + " do Vetor B");
			vetorB[i]= scan.nextInt();
		}	
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];
		}
		
		for (int i=0; i<vetorB.length; i++) {
			 vetorC[vetorA.length + i] = vetorB[i];
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A posição " + vetorA[i]);
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B posição " + vetorB[i]);
		}
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("Vetor C posição " + vetorC[i]);
		}
	
		
		}

	}
