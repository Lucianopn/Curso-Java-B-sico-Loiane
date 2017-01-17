package luciano.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		char o ='o';
		char i = 'i';
		
		//Ascii
		char o_ascii =111;
		char i_ascii = 105;
		char interrogacao = 0X00E1; //valor "?"

		//Ascii
		System.out.println(o+i);
		System.out.println(o_ascii + i_ascii);
		
		//String
		System.out.println(""+o+i+interrogacao);
	}

}
