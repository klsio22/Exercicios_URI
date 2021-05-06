package URI.LE1_Instruções_Simples.Ex1009_Salario_com_Bonus;
//Klesio Antonio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1009 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.next();
        double sal = entrada.nextDouble(),
                vendas = entrada.nextDouble() ,
                total = 0;

        total = sal + vendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}