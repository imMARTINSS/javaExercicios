package listaExercicioEStruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor:");
        int num = entrada.nextInt();

        int fatorial = 1; 

        for (int i = 1; i <= num; i++) {
            fatorial *= i;  
        }

        System.out.printf("%d! = %d\n", num, fatorial);

        entrada.close();
    }
}
