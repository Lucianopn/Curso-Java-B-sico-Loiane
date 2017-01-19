package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		if (letra.length() >1) {
			System.out.println("Não é uma letra válida");
		}else {		
		switch (letra) {
		case "a": System.out.println(letra +" é uma vogal");break;
		case "e": System.out.println(letra +" é uma vogal");break;
		case "i": System.out.println(letra +" é uma vogal");break;
		case "o": System.out.println(letra +" é uma vogal");break;
		case "u": System.out.println(letra +" é uma vogal");break;
		case "A": System.out.println(letra +" é uma vogal");break;
		case "E": System.out.println(letra +" é uma vogal");break;
		case "I": System.out.println(letra +" é uma vogal");break;
		case "O": System.out.println(letra +" é uma vogal");break;
		case "U": System.out.println(letra +" é uma vogal");break;
		default: System.out.println(letra +" é uma consoante");break;
		}
		}

	}

}
