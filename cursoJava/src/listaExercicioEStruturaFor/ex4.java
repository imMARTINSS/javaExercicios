package listaExercicioEStruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade:");
		int quantidade = entrada.nextInt();
		
		System.out.println("Digite os valores:");

		for(int i = 1; i <= quantidade; i++) {
			double a = entrada.nextDouble();
			double b = entrada.nextDouble();
			
			if(b == 0) {
				System.out.println("divisao impossivel");
			}else {
				System.out.printf("A divisão entre %.1f / %.1f = %.1f\n", a,b ,a/b);
			}
			
		}
	}

}
