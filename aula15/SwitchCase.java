package luciano.cursojava.aula15;
import java.util.Scanner; 

public class SwitchCase {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Entre com um dia da semana (1-7):");
				
				int diaSemana =  scan.nextInt();
				
				
				//If expres�o true ou false - booleana
				/*if (diaSemana == 1){
				System.out.println("Domingo");
			} else if (diaSemana == 2){
				System.out.println("Segunda");
			} else if (diaSemana == 3){
				System.out.println("Ter�a");
			} else if (diaSemana == 4){
				System.out.println("Quarta");
			} else if (diaSemana == 5){
				System.out.println("Quinta");
			} else if (diaSemana == 6){
				System.out.println("Sexta");
			} else if (diaSemana == 7){
				System.out.println("S�bado");
			} else {
				System.out.println("N�o � uma dia da semana v�lido");
			}
			
				switch(diaSemana){
				case 1: System.out.println("Domingo");
				case 2: System.out.println("Segunda");
				case 3: System.out.println("Ter�a"); 
				case 4: System.out.println("Quarta"); 
				case 5: System.out.println("Quinta"); 
				case 6: System.out.println("Sexta"); 
				case 7: System.out.println("S�bado"); break;
				default: System.out.println("N�o � uma dia da semana v�lido");
				}
			}*/
				
			switch(diaSemana){
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:System.out.println("Dia da Semana");break;
			case 1: 
			case 7: System.out.println("Final de Semana"); break;
			}
			
			switch(diaSemana){
			case 1: System.out.println("Domingo");break;
			case 2: System.out.println("Segunda-Feira");break;
			case 3: System.out.println("Ter�a-Feira"); break;
			case 4: System.out.println("Quarta-Feira"); break;
			case 5: System.out.println("Quinta-Feira"); break;
			case 6: System.out.println("Sexta-Feira"); break;
			case 7: System.out.println("S�bado"); break;
			default: System.out.println("N�o � uma dia da semana v�lido");
			}

			
		}

	}
