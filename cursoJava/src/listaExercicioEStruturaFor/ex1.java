package listaExercicioEStruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite:");
		int numero = entrada.nextInt();
		for(int i = 1; i <= numero; i ++) {
			if(i % 2 != 0) {
				System.out.println(numero);
			}
		}
		entrada.close();

	}

}
