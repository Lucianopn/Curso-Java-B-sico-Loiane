package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Digite um n�mero inteiro:");
        
        int num = scan.nextInt();
        
        if (num % 2 == 0) {
			System.out.println("O numero � par");
		}else {
			System.out.println("O numero � impar");
		}
        

	}

}
