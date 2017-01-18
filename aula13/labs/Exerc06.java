package luciano.cursojava.aula13.labs;

import java.util.Scanner;
import java.math.*;

public class Exerc06 {

		public static void main(String[] args) {
			System.out.println("Digite o raio do circulo: ");
			Scanner in = new Scanner(System.in);
			double PI =  Math.PI;
			double raio = in.nextDouble();
			double area= PI * Math.pow(raio, 2);
			 			
			System.out.println(raio + "  de raio tem a area de circulo igual a " + area );

	}

}
