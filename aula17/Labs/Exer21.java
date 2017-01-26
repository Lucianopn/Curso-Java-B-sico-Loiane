package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
        System.out.println("Entre com o número de turmas:");
        int turmas = value.nextInt();        
		double media =0;
		double soma=0;
		int alunos=0;
		int count= 1;

		for (int i = 1; i<=turmas; i++) {
		
	    boolean validaAlunos=false;
			
		do {
			
	        System.out.println("Entre com o alunos da Turma " + count);
	         alunos = value.nextInt();
	        count++;
	        if (alunos<=40) {
	        	validaAlunos=true;				
			}else {
				System.out.println("Numero inválido, limite 40!");
				count--;
			}
			
		} while (!validaAlunos);
		
		soma +=alunos; 

		}
		
		media = soma/turmas;
		
		System.out.println("Média de idade: " + media);
		
	}
}
