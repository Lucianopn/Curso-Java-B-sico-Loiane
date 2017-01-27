package luciano.cursojava.aula17.Labs;

import java.text.DecimalFormat;

public class Exer23 {

	public static void main(String[] args) {
		
		double valor= 01.99;
		double constante = 01.99;

		for (int i =1; i <= 50; i++) {
					
			DecimalFormat df =new DecimalFormat("#,###.##");
			System.out.println(i + " - R$" + df.format(valor));
			
			valor = valor + constante;
			
		}
		
	}

}
