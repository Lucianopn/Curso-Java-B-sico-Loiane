package luciano.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo.");
		String nomeCompleto = leitor.nextLine();
		System.out.println("Seu nome completo �:  " + nomeCompleto);

		System.out.println("Digite seu primeiro nome.");
		String primeiroNome = leitor.next();
		System.out.println("Seu nome completo �:  " + primeiroNome);
		
		System.out.println("Digite sua idade");
		int idade = leitor.nextInt();
		System.out.println("Sua idade �:  " + idade);
		
		System.out.println("Digite sua altura");
		double altura = leitor.nextDouble();
		System.out.println("Sua altura �:  " + altura); */
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estima��o:");
		String nome =  leitor.next();
		int idade = leitor.nextInt();
		byte filhos = leitor.nextByte();
		float altura = leitor.nextFloat();
		boolean temPet = leitor.nextBoolean();
		

		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + filhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estima��o? " + temPet);
		
	}

}
