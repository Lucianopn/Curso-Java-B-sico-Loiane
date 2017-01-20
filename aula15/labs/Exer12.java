package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Entre com o valor/hora:");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com as horas trabalhadas no mês:");
        double qtdHoras = scan.nextDouble();
        
        double salarioBruto = valorHora * qtdHoras;
        
        double FGTS=11;
        double IR=0;
        double INSS=10;
				
		if(salarioBruto<900) {
			IR=0;
		}else if(salarioBruto>=900&&salarioBruto<1500) {
			IR=5;
		}else if(salarioBruto>=1500&&salarioBruto<2500) {
			IR=10;
		}else if(salarioBruto>=2500) {
			IR=20;
		}
		
		double descontoIR=salarioBruto*(IR/100);
		double descontoINSS=salarioBruto*(INSS/100);
		double descontoFGTS=salarioBruto*(FGTS/100);
		double totalDesconto=descontoIR+descontoINSS;
		double salarioLiquido=salarioBruto-totalDesconto;
		
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("Desconto IR " +descontoIR + "%: R$" + descontoIR);
		System.out.println("Desconto INSS " +descontoINSS + "%: R$" + descontoINSS);
		System.out.println("Total FGTS " +descontoFGTS + "%: R$" + descontoFGTS);
		System.out.println("Total de descontos: R$" + totalDesconto);
		System.out.println("Salário Liquido: R$" + salarioLiquido);
		
	}

}
