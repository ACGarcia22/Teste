import java.util.Scanner;

public class NotaAlunoEstatico {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ol�, Seja Bem Vindo, Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println();
	
		System.out.println("Digite sua nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean passoudeano = nota >=70;
		
		if(passoudeano) {
			System.out.println("Voc� est� aprovado");}
			else {
			System.out.println("Voc� est� reprovado");
			}
			
		}
	
	
		
		
		
		
		
	}

