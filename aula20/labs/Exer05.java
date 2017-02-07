package luciano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] agendas = new String[12][30][23];

		int dia = 0;
		int hora = 0;
		int mes = 0;

		String cadastro = "S";
		String consulta = "S";

		boolean validaMesCad = false;
		boolean validaDiaCad = false;
		boolean validaHoraCad = false;

		boolean cadastraAgenda = true;
		boolean consultaAgenda = true;
		boolean rodaPrograma = true;

		for (int i = 0; i < agendas.length; i++) {
			for (int j = 0; j < agendas[i].length; j++) {
					for (int k = 0; k < agendas[i][j].length; k++) {
						agendas[i][j][k] =" Vazio "; 	
					}			
			}
		}

		do {

			while (cadastraAgenda) {

				System.out.println("Deseja cadastrar uma agenda? S ou N ");
				cadastro = scan.next();
				if (cadastro.equalsIgnoreCase("N")) {
					cadastraAgenda = true;
					break;
				}

				while (!validaMesCad) {

					System.out.println("Digite o mês do compromisso: ");
					mes = scan.nextInt();
					if (mes > 1 && mes <= 12) {
						validaMesCad = true;
					} else {
						System.out.println("Mês inválido, digite novamente");
					}
				}

				validaMesCad = false;

				while (!validaDiaCad) {

					System.out.println("Digite o dia do compromisso: ");
					dia = scan.nextInt();
					if (dia > 1 && dia <= 31) {
						validaDiaCad = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				validaDiaCad = false;

				while (!validaHoraCad) {

					System.out.println("Digite o hora do compromisso: ");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 8) {
						validaHoraCad = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				validaHoraCad = false;

				System.out.println("Digite  seu compromisso: ");
				agendas[--mes][--dia][hora] = scan.next();

			}

			do {

				System.out.println("Deseja consultar da agenda? S ou N ");
				consulta = scan.next();
				if (consulta.equalsIgnoreCase("N")) {
					consultaAgenda = false;
					break;
				}

				while (!validaMesCad) {

					System.out.println("Digite o mês do compromisso: ");
					mes = scan.nextInt();
					if (mes > 1 && mes <= 12) {
						validaMesCad = true;
					} else {
						System.out.println("Mês inválido, digite novamente");
					}
				}
				validaMesCad = false;

				while (!validaDiaCad) {

					System.out.println("Digite o dia do compromisso: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						validaDiaCad = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				validaDiaCad = false;

				while (!validaHoraCad) {

					System.out.println("Digite o hora do compromisso: ");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 8) {
						validaHoraCad = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				validaHoraCad = false;

				System.out.println("Compromisso: " + agendas[mes - 1][dia - 1][hora]);

			} while (consultaAgenda);

		} while (rodaPrograma);

	}

}