package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do produto1: ");
		double p1 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do produto2: ");
		double p2 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do produto3: ");
		double p3 = scan.nextDouble();
		
		if (p1<=p2&p1<=p3) {
			System.out.println("O produto " +p1 +" � o mais barato.");
		}else if (p2<=p1&p1<=p3) {
			System.out.println("O produto " +p2 +" � o mais barato.");
		}else
			System.out.println("O produto " +p3 +" � o mais barato.");

	}

}
