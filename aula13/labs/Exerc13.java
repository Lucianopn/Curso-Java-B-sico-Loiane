package luciano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Digitea o valor de sua hora de traalho: ");
		double hora= in.nextDouble();
		
		System.out.println("Digitea as horas trabalhadas no mês: ");
		double horaMes= in.nextDouble();
		
		double salarioBruto= hora*horaMes;
		double IR = salarioBruto * 0.11;
		double INSS = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido=salarioBruto-IR-INSS-sindicato;
		
		System.out.println("Seu salário será: \nSalario Bruto- R$" + salarioBruto + 
										"\nIR - R$" + IR +
										"\nINSS - R$" + INSS +
										"\nSindicato - R$" + sindicato +
										"\nSalario Liquido - R$" + salarioLiquido);		
		

	}

}
