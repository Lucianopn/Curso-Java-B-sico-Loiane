package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		System.out.println("Digite o 1° numero para atabuada: ");
		int num1 = value.nextInt();
		
		System.out.println("Iniciar em: ");
		int inic = value.nextInt();
		
		System.out.println("Parar em: ");
		int fim = value.nextInt();
		
		for (int i = inic;i <=fim; i++) {
			int num2=num1*i;
			System.out.println(num1 + " X " + i + " = " + num2);
		}

	
	}
}
