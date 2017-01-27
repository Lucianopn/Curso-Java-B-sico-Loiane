package luciano.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Digite o sálario inicial: ");
		double salarioIni = value.nextDouble();
		
		double porcAumentIni = 1.5;
		int anoIni = 1996;
		int anoFinal=2017;
		double soma=porcAumentIni;
		
		for (;anoIni  <=  anoFinal;) {
			
			double salarioAtual = salarioIni+(salarioIni/100*soma);
			salarioIni = salarioAtual;
			
			System.out.println("Salario em " + anoIni );
			System.out.println(df.format(salarioAtual));
			
			 anoIni ++;
			
			soma+= porcAumentIni*2;
			
		}

	
	}
}
