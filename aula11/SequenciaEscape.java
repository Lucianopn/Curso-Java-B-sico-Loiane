package luciano.cursojava.aula11;

public class SequenciaEscape {
			public static void main(String[] args) {
				
				//"\" habilita caracteres de sistema, "\n" pula linha e "\r" cursor linha de baixo 
				System.out.print("\"Hello, World!\"\n\r");
				// 1\4
				System.out.println("1\\4");
			}
}
