package luciano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		boolean loginValido =false;
		
		do {
			System.out.println("Digite sua usuário: ");
			String usuario =  value.nextLine();
			
			System.out.println("Digite sua senha: ");
			String senha =  value.nextLine();
			
			if (senha.equalsIgnoreCase(usuario)) {
				System.out.println("A senha não pode ser igual ao usuário");
				
			}else {
				loginValido =true;
				System.out.println("Cadastrado com sucesso");
			}			
						
		} while (!loginValido);

	}
}
