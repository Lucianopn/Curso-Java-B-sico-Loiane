package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digitea sua altura : ");
		double Alt= in.nextDouble();
		double pesoIdeal= (72.7*Alt)-58;
		System.out.println("Sua PESO IDEAL é: " + pesoIdeal );
		

	}

}
