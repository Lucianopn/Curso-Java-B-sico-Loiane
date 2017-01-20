package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sálario para analize de aumento:");
		double salario = scan.nextDouble();
		String percentual;
		double aumento;
		double salarioAjustado;
				
		if(salario<280){
			salarioAjustado=salario*1.2;
			percentual="20%";
			aumento=salario*0.2;
		}else if(salario>=280&&salario<700){
			salarioAjustado=salario*1.15;
			percentual="15%";
			aumento=salario*0.15;
		}else if(salario>=700&&salario<1500){
			salarioAjustado=salario*1.1;
			percentual="10%";
			aumento=salario*0.10;
		}else if(salario>=700&&salario<1500){
			salarioAjustado=salario*1.1;
			percentual="10%";
			aumento=salario*0.10;
		}else {
			salarioAjustado=salario*1.05;
			percentual="05%";
			aumento=salario*0.05;
		}
		
		System.out.println("Salário: R$" + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: R$" + aumento);
        System.out.println("Salário ajustado: R$" + salarioAjustado);

	}

}
