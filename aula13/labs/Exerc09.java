package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		System.out.println("Digitea a temperatura em Farenheit: ");
		Scanner in = new Scanner(System.in);
		double F= in.nextDouble();
		double C= (5*(F-32)/9);
		System.out.println("A temperatura em C° é: " + C );

	}

}
