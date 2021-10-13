import java.util.Scanner;

public class Exercicio4Denovo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valordoproduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		Double quantidadedoproduto = scanner.nextDouble();
		
		Double resultado = valordoproduto * quantidadedoproduto;
		System.out.println("Total da compra: " + resultado);
		
		Double desconto = 0.0;
		
		Boolean grandequantidade = quantidadedoproduto >=10;
		if(grandequantidade){ desconto = 10.0;
				}else {}
		
		Double valordesconto = (resultado * desconto) / 100;
		Double valortotal = resultado - valordesconto;
		
		System.out.println("Total da compra com desconto: " + valortotal);
		
		
	}

}
