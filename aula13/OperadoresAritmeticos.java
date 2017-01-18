package luciano.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5 - imprime depois soma
		System.out.println(resultado++);
		//mesma coisa que
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);
		//mesma coisa que
		//resultado += 1;
		//System.out.println(resultad

		resultado--;
		System.out.println(resultado);
		
		//imprime depois retira
		System.out.println(resultado--);
		
		//retira depois imprime
		System.out.println(--resultado);
		
	}

}
