package luciano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] agendas = new String[30][23];

		int dia = 0;
		int hora = 0;

		String cadastro = "S";
		String consulta = "S";
		
		boolean validaDiaCad = false; 
		boolean validaHoraCad = false; 

		boolean cadastraAgenda = true;
		boolean consultaAgenda = true;
		boolean rodaPrograma = true;
		
		for (int i = 0; i < agendas.length; i++) {
			for (int j = 0; j < agendas[i].length; j++) {
					agendas[i][j] =" Vazio "; 				
			}
		}

		do {

			while (cadastraAgenda){
				
				System.out.println("Deseja cadastrar uma agenda? S ou N ");
				cadastro = scan.next();
				if (cadastro.equalsIgnoreCase("N")) {
					cadastraAgenda = true;
					break;
				}
				
	
				while(!validaDiaCad) {
					
				System.out.println("Digite o dia do compromisso: ");
				dia = scan.nextInt();
					if (dia >1 && dia <=31) {
						validaDiaCad=true;
					}else {
                        System.out.println("Dia inválido, digite novamente");
                    }
				}
				validaDiaCad=false;
				
				while(!validaHoraCad) {
					
				System.out.println("Digite o hora do compromisso: ");
				hora = scan.nextInt();
					if (hora > 0 && hora <=23) {
						validaHoraCad=true;
					}else {
                        System.out.println("Hora inválida, digite novamente");
                    }
				}
				validaHoraCad=false;
				
				System.out.println("Digite  seu compromisso: ");
				agendas[--dia][hora] = scan.next();

			} 

			do {
				
				System.out.println("Deseja consultar da agenda? S ou N ");
				consulta = scan.next();
				if (consulta.equalsIgnoreCase("N")) {
					consultaAgenda = false;
					break;
				}
				
				while(!validaDiaCad) {
					
				System.out.println("Digite o dia do compromisso: ");
				dia = scan.nextInt();
					if (dia >0 && dia <=31) {
						validaDiaCad=true;
					}else {
                        System.out.println("Dia inválido, digite novamente");
                    }
				}
				validaDiaCad=false;
				
				while(!validaHoraCad) {
					
				System.out.println("Digite o hora do compromisso: ");
				hora = scan.nextInt();
					if (hora >0 && hora <=23) {
						validaHoraCad=true;
					}else {
                        System.out.println("Hora inválida, digite novamente");
                    }
				}
				validaHoraCad=false;
				
				System.out.println("Compromisso: " + agendas[dia-1][hora]);

			} while (consultaAgenda);

		} while (rodaPrograma);

	}

}
