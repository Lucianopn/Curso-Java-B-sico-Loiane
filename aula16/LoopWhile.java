package luciano.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 0; //count ou cont
		int max =10;
		
		System.out.println("Contando at� " + max);
		
		//while - 1� Avalia se expres�o � verdadeira e depois realiza o comando do bloco, fica em loop at� expres�o virar falsa.
		while (i<=max){
			System.out.println("Valor de i: " + i);
			++i; // i =i+1 ou i+=1			
		}
		
		System.out.println("Valor de i: " + i); //valor 11
		
		//do while - 1� Executa bloco do comando e depois avalia expres�o, fica em loop at� expres�o virar falsa.
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while(i<=11); //while(i<=15);		
	}

}
