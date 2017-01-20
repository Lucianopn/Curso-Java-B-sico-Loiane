package luciano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//        System.out.println("Entre com o valor da 1° nota:");
//        int nota1 = scan.nextInt();
//        
//        System.out.println("Entre com o valor da 2° nota:");
//        int nota2 = scan.nextInt();
//        
//        int mediaNota = (nota1 +  nota2)/2;
//        
//		switch(mediaNota) {
//		case 10: System.out.println("Média A");break;
//		case 9: System.out.println("Média A");break;
//		case 8: System.out.println("Média B");break;
//		case 7: System.out.println("Média B");break;
//		case 6: System.out.println("Média C");break;
//		case 5: System.out.println("Média C");break;
//		case 4: System.out.println("Média D");break;
//		case 3: System.out.println("Média D");break;
//		case 2: System.out.println("Média E");break;
//		case 1: System.out.println("Média E");break;
//		default: System.out.println("Valor inválido") ;break;
//		}		

        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        String aproveitamento = "";
        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9){
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5){
            aproveitamento = "C";
        } else if (media >= 4 && media < 6){
            aproveitamento = "D";
        } else if (media >= 0 && media < 4){
            aproveitamento = "E";
        } 
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);
        
        switch(aproveitamento){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO"); break;
            case "D":
            case "E": System.out.println("REPROVADO"); break;  
        }
		
		
	}

}
