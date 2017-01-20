package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite um número: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite um número: ");
		double n3 = scan.nextDouble();
		
		if (n1>=n2&n1>=n3) {
			System.out.println("O número " +n1 +" é o maior número.");
		}else if (n2>=n1&n1>=n3) {
			System.out.println("O número " +n2 +" é o maior número.");
		}else
			System.out.println("O número " +n3 +" é o maior número.");

	}

}
