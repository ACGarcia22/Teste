
public class TipoLogico {
	
	public static void main(String[] args) {
	
		
		System.out.println("-----------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira");
			
		}else {
			System.out.println("Não! Ele(a) não pode tirar carteira");
		}
		
		
	}

}
