package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite um n�mero: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite um n�mero: ");
		double n3 = scan.nextDouble();
		
		if (n1>=n2&n1>=n3) {
			System.out.println("O n�mero " +n1 +" � o maior n�mero.");
		}else if (n2>=n1&n1>=n3) {
			System.out.println("O n�mero " +n2 +" � o maior n�mero.");
		}else
			System.out.println("O n�mero " +n3 +" � o maior n�mero.");

	}

}
