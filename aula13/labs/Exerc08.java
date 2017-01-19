package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		System.out.println("Digitea o valor de sua hora de traalho: ");
		Scanner in = new Scanner(System.in);
		double hora= in.nextDouble();
		
		System.out.println("Digitea as horas trabalhadas no mês: ");
		double horaMes= in.nextDouble();
		
		System.out.println("Seu salário será: R$" + hora*horaMes );		
		

	}

}
