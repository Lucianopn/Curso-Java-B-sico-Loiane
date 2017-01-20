package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto1: ");
		double p1 = scan.nextDouble();
		
		System.out.println("Digite o preço do produto2: ");
		double p2 = scan.nextDouble();
		
		System.out.println("Digite o preço do produto3: ");
		double p3 = scan.nextDouble();
		
		if (p1<=p2&p1<=p3) {
			System.out.println("O produto " +p1 +" é o mais barato.");
		}else if (p2<=p1&p1<=p3) {
			System.out.println("O produto " +p2 +" é o mais barato.");
		}else
			System.out.println("O produto " +p3 +" é o mais barato.");

	}

}
