import java.util.Scanner;

public class Constantes {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer idademinimaparatirarcarteira = 18;
		
		System.out.println("Digite a Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTiraraCarteira = idade >= idademinimaparatirarcarteira;
				if(podeTiraraCarteira) {
					System.out.println("Sim, ele(a) pode tirar a carteira.");
				}else {
					System.out.println("Não, ele(a) não pode tirar a carteira.");
				}
						scanner.close();
	}

}
