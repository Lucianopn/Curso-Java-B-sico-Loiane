package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        int soma=0;
        int max =5;
        
        for (int i=0; i<max; i++){
            
            System.out.println("Entre com um número:");
            num = scan.nextInt();
            
            soma +=num;

        }
        
        double media = soma / max;
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}