import java.util.Scanner;

public class NomeSobrenome {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite Nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite Sobrenome: ");
		String Sobrenome = scanner.nextLine();
		
	System.out.println("Nome Completo: " + nome + " "+ Sobrenome + ", Seja Bem Vindo!");
		
	}

}
