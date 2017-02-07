package luciano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizes = new int[3][3];
		int countPar=0;
		int countImpar=0;
		
		for (int i = 0; i < matrizes.length; i++) {
			for (int j = 0; j < matrizes[i].length; j++) {
				System.out.println("Didite a posição"+ i +"/" +j);
				matrizes[i][j]=scan.nextInt();
				if(matrizes[i][j]%2==0) {
					countPar++;
				}else {
					countImpar++;
				}				
			}
		}
		
		for (int[] show : matrizes) {
			for (int show1 : show) {
				System.out.print(show1 + " - ");				
			}
			System.out.println();			
		}
		
		System.out.println("Qtd Par " + countPar);
		System.out.println("Qtd Impar " + countImpar);

	}

}
