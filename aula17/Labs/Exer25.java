package luciano.cursojava.aula17.Labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		double valor = 1 ;
		while (0<1) {
			System.out.println("Lojas Tabajara\n");
			int count=0;
			double soma=0;
			do {
				++count;
				System.out.println("Valor Produto " + count);
				valor = value.nextDouble();
				soma += valor;
				
				if (valor==0) {
					System.out.println("Total: R$" + soma + "\n");
					break;
				}else {}
				
				
			} while (valor!=0);
		}

	}

}
