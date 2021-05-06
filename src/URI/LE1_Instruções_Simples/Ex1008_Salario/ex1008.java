package URI.LE1_Instruções_Simples.Ex1008_Salario;
//Klesio Antonio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1008 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        int numeroFuncionario = 0 , horas = 0 ;
        double salarioHora = 0;

        numeroFuncionario = entrada.nextInt() ;
        horas = entrada.nextInt();
        salarioHora = entrada.nextDouble();

        System.out.printf("NUMBER = %d\n",numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salarioHora * horas);
    }
}
