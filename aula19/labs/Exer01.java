package luciano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

	/*	int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		vetorA[0]=1;
		vetorA[1]=2;
		vetorA[2]=3;
		vetorA[3]=4;
		vetorA[4]=5;
		
		vetorB=vetorA;
		
		for (int temp : vetorB) {
			System.out.println(temp);
		} */
		
        /*for (int i=0, j=1; i<vetorA.length; i++){
        vetorA[i] = j++;
        vetorB[i] = vetorA[i];
        System.out.println(vetorB[i]);
        } */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posi��o " + i);
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = vetorA[i];
        }
		
        /*for (int i=0; i<vetorA.length; i++){
        vetorB[i] = vetorA[i];
    }*/
    
    System.out.print("Vetor A = ");
    for (int i=0; i<vetorA.length; i++){
        System.out.print(vetorA[i] + " ");
    }
    System.out.println();
    
    System.out.print("Vetor B = ");
    for (int i=0; i<vetorB.length; i++){
        System.out.print(vetorB[i] + " ");
    }
    System.out.println();
		

	}

}
