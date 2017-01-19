package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int n1 = scan.nextInt();
		
		if(n1<0) {
			System.out.println("Número Negativo.");
		}else {
			System.out.println("Número Positivo.");
		}

	}

}
