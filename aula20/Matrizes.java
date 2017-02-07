package luciano.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		// For dentro de For
		for (int i=0; i<notasAlunos.length; i++){			
			//System.out.print(notasAlunos[i] + " "); //s� mostra endere�o na mem�ria
			for (int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		

		notasAlunos[1][3] = 8;
		
		System.out.println();
		
		for (int i=0; i<notasAlunos.length; i++){
			for (int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a m�dia de cada aluno");
		
		double soma;
		for (int i=0; i<notasAlunos.length; i++){
			
			soma = 0;
			for (int j=0; j<notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
			}
			System.out.println("M�dia do aluno " + i + " � = " + (soma/4));
		}
		
		// inicializa��o rapida matriz { , }
		double[] notasAluno1 = {7, 8, 9, 10}; 
		
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		
		System.out.println("Output da matriz notasAlunos2");
		System.out.println();
		
/*		for (int i=0; i<notasAlunos2.length; i++){
			for (int j=0; j<notasAlunos2[i].length; j++){
				System.out.print(notasAlunos2[i][j] + " - ");
			}*/
		
		for (double nota : notasAluno1) {
			System.out.println(nota);
		}
			System.out.println();
			
			for (double[] vetor1 : notasAlunos2) {
				for(double vetor: vetor1) {
					System.out.println(vetor);
				}
			}
			
			System.out.println();
		}
	}