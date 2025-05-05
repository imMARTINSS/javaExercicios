package listaExEstruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o raio do circlo: ");
		float raio = entrada.nextFloat();
		
		double formula = 3.14 * Math.pow(raio, 2);
		
		System.out.printf("A aréa do circulo é: %.2f.", formula);

	}

}
