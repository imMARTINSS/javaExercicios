package listaExEstruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o codigo do produto:");
		int codeProduct = entrada.nextInt();
		System.out.println("Informe a quantidade que você deseja:");
		int unitProduct = entrada.nextInt();
		System.out.println("Informe o valor do produto:");
		float valueProduct = entrada.nextFloat();
		
		System.out.println("\nInforme o codigo do produto2:");
		int codeProduct2 = entrada.nextInt();
		System.out.println("Informe a quantidade que você deseja:");
		int unitProduct2 = entrada.nextInt();
		System.out.println("Informe o valor do produto2:");
		float valueProduct2 = entrada.nextFloat();
		
		float valorTotalProducts = (unitProduct * valueProduct) + (unitProduct2 * valueProduct2) ;
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f\n", valorTotalProducts);
		
		entrada.close();
		
	}

}
