package URI.LE1_Instruções_Simples.Ex1012_Area;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1012 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        double a = 0.0, b = 0.0 , c = 0.0;
        double pi = 3.14159;

        a = ent.nextDouble();
        b = ent.nextDouble() ;
        c = ent.nextDouble() ;

        System.out.printf(
                "TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n",((a*c)/2),
                (pi* (Math.pow(c , 2))),
                (((a+b)*c)/2), (b*b), (a*b));
    }
}
