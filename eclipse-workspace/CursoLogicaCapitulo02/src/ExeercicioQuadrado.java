import java.util.Scanner;

public class ExeercicioQuadrado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
	System.out.println("Digite o numero para calcular quadrado: ");
	Integer numeroInteiro = scanner.nextInt();
	
	Integer quadradoInteiro = numeroInteiro + numeroInteiro;
	
	System.out.println("O quadrado de: " + numeroInteiro + " é " + quadradoInteiro);
	
		
	}

}
