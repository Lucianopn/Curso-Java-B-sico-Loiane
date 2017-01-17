package luciano.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		//Convenção Java
		int idade = 20;
		String nome = "Luciano";
		String nomeDoMeuCachorro="Totó";
		String ano2014="2014";
		
		//Descrição aceita mas não utilizada
		int _idade;
		int $idade;

		//Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String NomeDoMeucachorro;
		
		
		idade=32;
		
		System.out.println("idade " + idade);
		System.out.println("nome " + nome);
		
		//Má prática
		int a=10;
		String b = "Luciano";
	}

}
