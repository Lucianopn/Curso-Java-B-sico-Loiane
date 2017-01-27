package luciano.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");

		double media = 0;
		double soma = 0;
		int count = 0;
		boolean loop = true;
		double maxTemp = 0;
		double mimTemp = 0;

		do {
			count++;

			System.out.println("Digite uma temperatura " + count + ":");
			double temp = value.nextDouble();

			soma += temp;
			media = soma / count;

			if (count == 1) {
				maxTemp = temp;
				mimTemp = temp;
			} else {

				if (maxTemp <= temp) {
					maxTemp = temp;
				} else if (mimTemp >= temp) {
					mimTemp = temp;
				}
			}
			System.out.println("Máxima temperatura registrada: " + maxTemp);
			System.out.println("Mínima temperatura registrada: " + mimTemp);
			System.out.println("Sua média: " + df.format(media) + "\n");

		} while (loop);

	}

}
