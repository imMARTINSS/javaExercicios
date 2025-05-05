package listaExEstruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		
		int soma = a + b;
		
		System.out.printf("A soma é: %d.", soma);
		

	}

}
