package listaExercicioCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a coordenada de x:");
		float x = entrada.nextFloat();
		System.out.println("digite a coordenada de y:");
		float y = entrada.nextFloat();
		
		if(x == 0 && y == 0) {
			System.out.println("\nOrigem");
		}
		else if(x > 0 && y > 0) {
			System.out.println("\nQ1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("\nQ2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("\nQ3");
		}
		else{
			System.out.println("\nQ4");
		}
		
		entrada.close();

	}

}
