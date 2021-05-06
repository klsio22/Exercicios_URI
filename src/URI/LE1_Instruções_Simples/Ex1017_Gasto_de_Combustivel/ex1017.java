package URI.LE1_Instruções_Simples.Ex1017_Gasto_de_Combustivel;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int  horas= entrada.nextInt() ,
                kmH =entrada.nextInt();
        double litros = (horas/12.0) * kmH ;

        System.out.printf("%.3f\n", litros);
    }
}
