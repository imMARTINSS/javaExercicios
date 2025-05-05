package listaExercicioCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = entrada.nextInt();
		System.out.println("Digite o valor de B:");
		int b = entrada.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("SÃO MULTIPLOS");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		entrada.close();

	}

}
