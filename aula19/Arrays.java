package luciano.cursojava.aula19;

public class Arrays {
	
	public static void main(String[] args) {
		
		// maneira trabalhosa de armazenar
		double tempDia001= 31.3;
		double tempDia002= 32;
		double tempDia003= 33.7;
		double tempDia004= 34;
		double tempDia005= 31.1;
		double tempDia006= 32.8;
		
		//declaração do array
		
		double[] temperaturas = new double[365];
		temperaturas[0]=31.3;
		temperaturas[1]=32;
		temperaturas[2]=33.7;
		temperaturas[3]=34;
		temperaturas[4]=33.1;
		
		System.out.println("O valor da temperatura 1 é " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		//leitura do array na memoria
		System.out.println("O valor da temperatura 1 é " + temperaturas);
		
		// leitura do array - mostra indice
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) +" é " + temperaturas[i]);
		}
		
		//for melhorado - somente valor
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
		
	}

}
