package listaExEstruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		
		int diferenca = (a * b - c * d);
		
		
		System.out.printf("DIFERENÇA = %d", diferenca);

	}

}
