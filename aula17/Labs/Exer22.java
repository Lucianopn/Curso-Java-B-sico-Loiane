package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
        System.out.println("Entre com a quantidade de CDs ");
        int cds = value.nextInt();        
		double media =0;
		double soma=0;
		double valor=0;
		int count = 1;

		for (int i = 1; i<=cds; i++) {
		
	    boolean validaCds=false;
			
		do {
			
	        System.out.println("Entre com o valor do CD " + count);
	         valor = value.nextDouble();
	         
	         count++;
	        
	        if (valor>=0) {
	        	validaCds=true;				
			}else {
				System.out.println("Valor invalido!");
				count--;
			}
			
		} while (!validaCds);
		
		soma +=valor; 

		}
		
		media = soma/cds;
		
		System.out.println("Média de valor: R$" + media);
		
	}
}
