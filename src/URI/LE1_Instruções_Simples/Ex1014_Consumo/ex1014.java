package URI.LE1_Instruções_Simples.Ex1014_Consumo;
//Klesio Antonio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int X = entrada.nextInt();
        double Y = entrada.nextDouble();

        System.out.printf("%.3f km/l\n", X/Y);

    }

}
