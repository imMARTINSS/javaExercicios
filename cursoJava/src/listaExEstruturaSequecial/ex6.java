package listaExEstruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		float A = entrada.nextFloat();
		System.out.println("Digite o valor de B:");
		float B = entrada.nextFloat();
		System.out.println("Digite o valor de C:");
		float C = entrada.nextFloat();
		
		float triangulo = A * C / 2;
		double circulo = 3.14159 * Math.pow(C, 2);
		float trapezio = (A + B) * C / 2;
		double quadrado = Math.pow(B, 2);
		float retangulo = A * B;
		
		System.out.printf("\nTRIANGULO %.3f\n", triangulo);
		System.out.printf("CIRCULO %.3f\n", circulo);
		System.out.printf("TRAPEZIO %.3f\n", trapezio);
		System.out.printf("QUADRADO %.3f\n", quadrado);
		System.out.printf("RETANGULO %.3f\n", retangulo);

	}

}
