import java.util.Scanner;

public class IMC {
	
	private static final String IMC = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o Peso: ");
		Double Peso = scanner.nextDouble();
		
		System.out.println("Digite a ALtura: ");
		Double Altura = scanner.nextDouble();
		
		Double resultadoAltura = Altura * Altura;
		
		Double imc = Peso / (Altura);
		
		System.out.println("Seu imc: " + imc);
		
		scanner.close();

	}

}
