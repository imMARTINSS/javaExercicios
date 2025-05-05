package listaExercicioCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o codigo do produto:");
		int code = entrada.nextInt();
		System.out.println("Informe a quantidade:");
		int unit = entrada.nextInt();
		
		float value;
		
		String productName;
		
		if(code == 1) {
			productName = "Cachorro Quente";
			value = 4.00f;
			System.out.printf("\n%d\t%s      %.2f", code, productName, unit * value );
		}
		else if(code == 2){
			productName = "X-salada";
			value = 4.50f;
			System.out.printf("\n%d\t%s      %.2f", code, productName, unit * value );
		}
		else if(code == 3) {
			productName = "X-bacon";
			value = 5.00f;
			System.out.printf("\n%d\t%s      %.2f", code, productName, unit * value );					
		}
		else if(code == 4) {
			productName = "Torrada simples";
			value = 2.00f;
			System.out.printf("\n%d\t%s      %.2f", code, productName, unit * value );					
		}
		else if(code == 5) {
			productName = "Refrigerante";
			value = 1.50f;
			System.out.printf("\n%d\t%s      %.2f", code, productName, unit * value );					
		}
		
		entrada.close();

	}

}
