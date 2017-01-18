package luciano.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso =false;
		//valida os 2 lados do AND
		boolean resultado1=falso & verdadeiro;
		//valida lado esquerdo se não atende o AND já passa para proxima linha
		boolean resultado2=falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		//precedencia
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}
