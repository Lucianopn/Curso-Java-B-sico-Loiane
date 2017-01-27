package luciano.cursojava.aula17.Labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		System.out.println("Digite o preço do pão:");
		double valor= value.nextDouble();
		double constante = valor;

		for (int i = 1; i <= 50; i++) {
					
			DecimalFormat df =new DecimalFormat("#,###.##");
			System.out.println(i + " - R$" + df.format(valor));
			
			valor = valor + constante;
			
		}
		

	}

}
