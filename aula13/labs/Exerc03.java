package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		System.out.println("Digite 2 numeros: ");
		Scanner n1 = new Scanner(System.in);
		
		int i1 = n1.nextInt();
		int i2 = n1.nextInt();
		System.out.println("A soma do 2 numeros é: " + (i1+i2));		

	}

}
