package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Entre com o primeira lado do trin�gulo:");
        double lado1 = scan.nextDouble();
        
        System.out.println("\"Entre com o segundo lado do trin�gulo:");
        double lado2 = scan.nextDouble();
        
        System.out.println("\"Entre com o terceiro lado do trin�gulo:");
        double lado3 = scan.nextDouble();
        
        if (lado1==lado2&&lado1==lado3) {
			System.out.println("Triangulo Equil�tero");
		}else if (lado1==lado2||lado1==lado3||lado2==lado3) {
			System.out.println("Triangulo Is�sceles");
		}else if (lado1!=lado2&&lado1!=lado3&&lado2!=lado3) {
			System.out.println("Triangulo Escaceno");
		}
        

	}

}
