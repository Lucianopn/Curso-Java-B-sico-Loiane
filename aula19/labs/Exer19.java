package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Alunos");
		int num = scan.nextInt();
		
		int[] nota1 = new int[num];
		int[] nota2 = new int[num];
		double[] result = new double[num];
		
		for(int i=0; i< nota1.length; i++) {
			System.out.println("Digite a 1° nota do aluno " + (i+1));
			nota1[i]=scan.nextInt();
			System.out.println("Digite a 2° nota do aluno " + (i+1));
			nota2[i]=scan.nextInt();
		}
		
		for (int i=0; i< result.length; i++) {
			result[i]= (nota1[i]+nota2[i])/2;
		}
		
			System.out.println("Digite o numero do Aluno que deseja saber a nota ");
			num = (scan.nextInt())-1;
			
			System.out.println("Nota 1: " + nota1[num]);
			System.out.println("Nota 2: " + nota2[num]);
			System.out.println("Média: " + result[num]);
			
			if (result[num]>=7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
			

	}

}
