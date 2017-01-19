package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
			System.out.println("Digitea largura do quadrodo: ");
			Scanner in = new Scanner(System.in);
			double larg= in.nextDouble();
			
			System.out.println("Digitea autura do quadrodo: ");
			double aut= in.nextDouble();
			
			double quadrado = (aut*larg);
			System.out.println("Area do quadrado: "  + quadrado + "\nDobro da area do quadrado é: " + quadrado*2);
			
	}

}
