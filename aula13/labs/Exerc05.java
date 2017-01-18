package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		System.out.println("Digite quantidades em metro(s): ");
		Scanner in = new Scanner(System.in);
		
		double metros = in.nextDouble();
		double centimetros= metros*100;
		
		System.out.println(metros + " m é igual a " + centimetros + " cm");
		//System.out.println("A conversão para centímetros é: " + centimetros + "cm");	

	}

}
