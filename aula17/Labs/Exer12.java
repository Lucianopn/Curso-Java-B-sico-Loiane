package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		System.out.println("Digite o 1° numero para atabuada: ");
		int num1 = value.nextInt();
		
		for (int i = 1;i <=10; i++) {
			int num2=num1*i;
			System.out.println(num1 + " X " + i + " = " + num2);
		}

	}
}
