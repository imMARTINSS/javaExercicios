package listaExercicioCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int duracaoInicial = entrada.nextInt();
		int duracaoFinal = entrada.nextInt();
		
		int duracao;
		
		if(duracaoInicial < duracaoFinal) {
			duracao = duracaoFinal - duracaoInicial;
			System.out.printf("O JOGO DUROU %d HORAS\n", duracao);
		}else {
			duracao = 24 - duracaoInicial + duracaoFinal;
			System.out.printf("O JOGO DUROU %d HORAS\n", duracao);
		}
		
		entrada.close();

	}

}
