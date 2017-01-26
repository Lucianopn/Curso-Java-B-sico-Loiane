package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		boolean validaNome= false;
		boolean validaIdade= false;
		boolean validaSalario= false;
		boolean validaSexo= false;
		boolean validaEstadoCivil= false;
		
		do {
			System.out.println("Digite seu nome");
			String nome = value.nextLine();
		    
					if (nome.length()>3) {
						validaNome= true;
					}else {
						System.out.println("Nome inválido digite novamente");
					}			
			
		} while (!validaNome);
		
		do {
			System.out.println("Digite sua idade");
			int idade = value.nextInt();
		    
					if (idade>=0 && idade <=150) {
						validaIdade= true;
					}else {
						System.out.println("Idade inválida digite novamente");
					}			
			
		} while (!validaIdade);

		do {
			System.out.println("Digite seu salario");
			double salario = value.nextDouble();
		    
					if (salario>0) {
						validaSalario= true;
					}else {
						System.out.println("Sálario inválido digite novamente");
					}			
			
		} while (!validaSalario);
		
		do {
			System.out.println("Digite seu sexo - F ou M");
			String sexo = value.next();
		    
					if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
						validaSexo= true;
					}else {
						System.out.println("Sexo inválido digite novamente");
					}			
			
		} while (!validaSexo);
		
		do {
			System.out.println("Digite seu estado civil - s, c, v, d");
			String estadoCivil = value.next();
		    
					if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ) {
						validaEstadoCivil= true;
					}else {
						System.out.println("Sexo inválido digite novamente");
					}			
			
		} while (!validaEstadoCivil);

	}
}
