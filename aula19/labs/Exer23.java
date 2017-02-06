package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA= new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com um número para a posição " + i);
			vetorA[1]= scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			if (vetorA[i] %2 !=0) {
				System.out.println("Array impar");
				break;
			}else {
				System.out.println("Array par");
				break;
			}
		}

		
		}

	}
