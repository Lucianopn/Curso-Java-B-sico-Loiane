package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um n�mero para a posi��o " + i);
			vetorA[i]= scan.nextInt();
			
			if (vetorA[i]%2==0) {
				vetorB[i]=1;
			}else {
				vetorB[i]=0;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A posi��o " + vetorA[i]);
			System.out.println("Vetor B posi��o " + vetorB[i]);
		}

		
		
		
		}

	}
