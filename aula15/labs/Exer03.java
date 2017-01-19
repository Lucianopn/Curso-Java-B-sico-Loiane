package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite F ou M");
		
		String letra= in.next();
		
		if (letra.length()==1){
			switch(letra) {
				case "M": System.out.println("M-Masculino");break;
				case "m": System.out.println("M-Masculino");break;
				case "F": System.out.println("F-Feminino");break;
				case "f": System.out.println("F-Feminino");break;	
				default: System.out.println("Letra invalida");break;	
			}
		}else {
			System.out.println("Letra invalida");
		}
		

	}

}
