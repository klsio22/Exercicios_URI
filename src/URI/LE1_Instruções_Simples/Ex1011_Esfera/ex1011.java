package URI.LE1_Instruções_Simples.Ex1011_Esfera;
//Klesio Antonio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1011 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double R = entrada.nextDouble(), pi = 3.14159;
        System.out.printf("VOLUME = %.3f\n" , (4.0/3) * pi * (R*R*R) );

    }
}