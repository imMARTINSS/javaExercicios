package listaExercicioCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		float valor = entrada.nextFloat();
		
		if(valor <= 25) {
			System.out.println("intevalo[0.25]");
		}
		else if(valor <= 50) {
			System.out.println("intevalo[25.50]");
		}
		else if(valor <= 75) {
			System.out.println("intevalo[50.75]");
		}
		else if(valor <= 100) {
			System.out.println("intevalo[75.100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		entrada.close();

	}

}
