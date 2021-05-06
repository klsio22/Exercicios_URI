package URI.Ex1002_Area_do_Circulo;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1002 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double area = 0 , raio = 0 , n =  3.14159;
        raio = entrada.nextDouble();
        area = n * (raio*raio);
        System.out.printf("A=%.4f\n",  area);

    }

}
