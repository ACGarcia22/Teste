import java.util.Scanner;

public class testenota {
	static final Double NOTA_MINIMA_PARA_PASSAR = (double) 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		
		System.out.println("Olá, Seja Bem Vindo, Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println();
	
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean passoudeano = nota >= NOTA_MINIMA_PARA_PASSAR;
		
		if(passoudeano) {
			System.out.println("Você está aprovado");}
			else {
			System.out.println("Você está reprovado");
			}
			
		}
	
	
		
		
		
		
		
	}

