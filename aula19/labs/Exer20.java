package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dólar (U$) em relação ao real (R$)");
		double cotacao = scan.nextDouble();
		double[] vetor = new double[20];
		
		for(int i=0; i< vetor.length; i++) {
			
			vetor[i]=cotacao*(i+1);
		}
		
		for (int i=0; i< vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		}

	}
