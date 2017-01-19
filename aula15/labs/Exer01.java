package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = scan.nextInt();
		
		/*int resultado= Math.max(n1, n2);
		System.out.println("O maior numero é: " + resultado);*/
		
		if (n1>n2) {
			System.out.println("O maior numero é: " + n1);
		}else {
			System.out.println("O maior numero é: " + n2);
		}

	}

}
