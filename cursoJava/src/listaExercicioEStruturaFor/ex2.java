package listaExercicioEStruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o quantidade:");
		int quantidade = entrada.nextInt();
		
		int in = 0;
		int out = 0;
		
		System.out.println("Digite os valores:");
		for(int i = 1; i <= quantidade; i++) {
			float valor = entrada.nextFloat();
			if(valor >= 10 && valor <= 20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		
		

	}

}
