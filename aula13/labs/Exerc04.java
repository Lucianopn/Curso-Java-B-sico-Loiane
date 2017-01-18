package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		System.out.println("Digite 4 notas bimestrais: ");
		Scanner in= new Scanner(System.in);
		
		double nota1 = in.nextDouble();
		double nota2 = in.nextDouble();
		double nota3 = in.nextDouble();
		double nota4 = in.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua média é: " + media);
		

	}

}
