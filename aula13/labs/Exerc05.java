package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		System.out.println("Digite quantidades em metro(s): ");
		Scanner in = new Scanner(System.in);
		
		double metros = in.nextDouble();
		double centimetros= metros*100;
		
		System.out.println(metros + " m � igual a " + centimetros + " cm");
		//System.out.println("A convers�o para cent�metros �: " + centimetros + "cm");	

	}

}
