package listaExercicioCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma valor inteiro:");
		int valor = entrada.nextInt();
		
		if(valor < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		entrada.close();

	}

}
