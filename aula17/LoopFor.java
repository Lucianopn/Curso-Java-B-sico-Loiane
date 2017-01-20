package luciano.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		// Executa o bloco enquanto a condição é verdadeira.
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		//		System.out.println("valor de i: " =i); // gera error

		for(int i=5 ; i>=0 ; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.println("------------------------------------------");
		
		for (int i = 0, j = 10;  i <= j; i++, j--) {
			System.out.println("i= " + i + "; j= " + j);
		}
		
		System.out.println("------------------------------------------");
		
		int count = 0;
		
		for( ; count < 10 ; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		System.out.println("------------------------------------------");
		
		for( ; count <= 15 ;count += 1 ) {
			System.out.println("Valor de count: " + count);
		}
		
		System.out.println("------------------------------------------");
		
		int soma = 0;
		
		
		
		
	}

}
