package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		System.out.println("Digitea a temperatura em  C° : ");
		Scanner in = new Scanner(System.in);
		double C= in.nextDouble();
		double F= (C * 1.8) + 32;
		System.out.println("A temperatura em Farenheit é: " + F );

	}

}
