package listaExEstruturaSequecial;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		int number = entrada.nextInt();
		float salary = entrada.nextFloat();
		float hoursWorkend = entrada.nextFloat();
		
		float Salary = salary * hoursWorkend;
		
		System.out.printf("NUMBER = %d\n", number);
		System.out.printf("SALARY = U$ %.2f\n", Salary);
		
		entrada.close();
	}

}
