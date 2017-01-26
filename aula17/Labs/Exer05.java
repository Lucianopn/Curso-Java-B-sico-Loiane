package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		boolean validaHabPaisA= false;
		boolean validaHabPaisB= false;		
		boolean validaPorcPaisA= false;
		boolean validaPorcPaisB= false;
		
		double habitantesPaisA;
		double habitantesPaisB;
		double porcentagemPaisA;
		double porcentagemPaisB;
		
		int countAnos=0;
		
		
		do {
			System.out.println("Digite a quantidade de habitantes do país A");
			habitantesPaisA = value.nextDouble();
		    
					if (habitantesPaisA>0) {
						validaHabPaisA= true;
					}else {
						System.out.println("Inválida digite novamente");
					}			
			
		} while (!validaHabPaisA);

		do {
			System.out.println("Digite a quantidade de habitantes do país B");
			habitantesPaisB = value.nextDouble();
		    
					if (habitantesPaisB>0) {
						validaHabPaisB= true;
					}else {
						System.out.println("Inválida digite novamente");
					}			
			
		} while (!validaHabPaisB);
		
		do {
			System.out.println("Digite a porcentagem de crescimento do país A");
			porcentagemPaisA = value.nextDouble();
		    
					if (porcentagemPaisA>0) {
						validaPorcPaisA= true;
					}else {
						System.out.println("Inválida digite novamente");
					}			
			
		} while (!validaPorcPaisA);
		
		do {
			System.out.println("Digite a porcentagem de crescimento do país B");
			porcentagemPaisB = value.nextDouble();
		    
					if (porcentagemPaisB>0) {
						validaPorcPaisB= true;
					}else {
						System.out.println("Inválida digite novamente");
					}			
			
		} while (!validaPorcPaisB);
		

		
		while(habitantesPaisA<habitantesPaisB) {
			habitantesPaisA=habitantesPaisA + ((habitantesPaisA*porcentagemPaisA)/100);
			habitantesPaisB=habitantesPaisB + ((habitantesPaisB*porcentagemPaisB)/100);
			++countAnos;
		}
		System.out.println("Numeros de anos " + countAnos);

	}
}
