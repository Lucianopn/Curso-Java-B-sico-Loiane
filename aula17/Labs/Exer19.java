package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
        System.out.println("Entre com o número de notas:");
        int notas = value.nextInt();
		double media =0;
		double soma=0;
		int count= 0;
		
		do {
			
			System.out.println("Digite uma nota: ");
			double nota = value.nextDouble();
			++count;
			soma+=nota;			
			media=soma/count;
			System.out.println("Sua média: " + media);
			
		} while (count!=notas);		
	
	}
}
