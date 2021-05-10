package Testes;

import java.util.Locale;
import java.util.Scanner;

public class Teste1174 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double[] vetor = new double[100];

        for (int i = 0; i < 100; i++)
            vetor[i] = entrada.nextDouble();

        for (int i = 0; i < 100; i++)
            if (vetor[i] <= 10)
                System.out.printf("A[%d] = %.2f\n", i, vetor[i]);

    }
}
