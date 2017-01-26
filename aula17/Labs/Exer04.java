package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		double habitantesPaisA= 80000;
		double habitantesPaisB= 200000;
		int countAnos=0;
		
		while(habitantesPaisA<habitantesPaisB) {
			habitantesPaisA=habitantesPaisA*1.03;
			habitantesPaisB=habitantesPaisB*1.015;
			++countAnos;
		}
		System.out.println("Numeros de anos " + countAnos);


	}
}
