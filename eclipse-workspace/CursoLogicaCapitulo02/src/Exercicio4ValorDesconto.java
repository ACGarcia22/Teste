import java.util.Scanner;

public class Exercicio4ValorDesconto {


	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		Double quantidadeProduto = scanner.nextDouble();
		
		Double resultado = valorProduto * quantidadeProduto;
				
		System.out.println("Valor total: " + resultado);
		
		Double desconto = 0.0;
		
		Boolean grandequantidade = quantidadeProduto >=10;
		
		if (grandequantidade) {desconto = 10.0;
		} else {
		}
		Double valordesconto = (resultado * desconto) / 100;
		
		Double valorTotal = resultado - valordesconto;
		System.out.println("Valor com desconto: " + valorTotal);
	}
}
		
	


