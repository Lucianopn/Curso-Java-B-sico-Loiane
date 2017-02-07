package luciano.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		Random random = new Random();

		int[][] numAleatorios = new int[10][10];
		int linha5=5;
		int linha7=7;		
		int maiorL5 = 0;
		int menorL5 = 1000;
		int maiorL7 = 0;
		int menorL7 = 1000;
		
		for (int i = 0; i < numAleatorios.length; i++) {
			for (int z = 0; z < numAleatorios[i].length; z++) {
				numAleatorios[i][z] = random.nextInt(50);
			}
		}
		
		for (int[] matriz : numAleatorios) {
			for (int matriz1 : matriz) {
				System.out.print(matriz1 + " - ");
			}
			System.out.println();		
		}		
	
			for (int l = 0; l < numAleatorios[linha5].length; l++) {
				if (numAleatorios[linha5][l] > maiorL5) {
					maiorL5 = numAleatorios[linha5][l];
				}else if (numAleatorios[linha5][l] < menorL5) {
					menorL5 = numAleatorios[linha5][l];
				}
			}
			
			System.out.println("\nLinha " + linha5 + "\nMenor valor: " + menorL5 + "\nMaior valor: " + maiorL5);		
			

			
			
			for (int l = 0; l < numAleatorios[linha7].length; l++) {
				if (numAleatorios[linha7][l] > maiorL7) {
					maiorL7 = numAleatorios[linha7][l];
				}else if (numAleatorios[linha7][l] < menorL7) {
					menorL7 = numAleatorios[linha7][l];
				}
			}
			
			
			System.out.println("\nLinha " + linha7 + "\nMenor valor: " + menorL7 + "\nMaior valor: " + maiorL7);		

	}

}
