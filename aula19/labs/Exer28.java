package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i]= scan.nextInt();
			 vetorB[vetorA.length - i - 1] = vetorA[i];
		}	

		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A posição " + vetorA[i]);
			System.out.println("Vetor B posição " + vetorB[i]);
		}
		
		}

	}
