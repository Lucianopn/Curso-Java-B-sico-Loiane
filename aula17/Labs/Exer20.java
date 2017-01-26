package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
        System.out.println("Entre com o número de idades:");
        int idades = value.nextInt();
		double media =0;
		double soma=0;
		int count= 0;
		
		do {
			
			System.out.println("Digite uma idade: ");
			double idade = value.nextDouble();
			++count;
			soma+=idade;			
			media=soma/count;
			
		} while (count!=idades);
		
		System.out.println("Média de idade: " + media);
		
		if (media<=25) {
			System.out.println("Turma Jovem!");			
		}else if (media>=26 && media < 60) {
			System.out.println("Turma Adulta!");			
		}else if (media >= 60) {
			System.out.println("Turma Idosa!");			
		}
	
	}
}
