package Testes;

import java.util.Locale;
import java.util.Scanner;

public class Teste1930 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt()-1;
        int b = entrada.nextInt()-1;
        int c = entrada.nextInt()-1;
        int d = entrada.nextInt();
        System.out.println(a+b+c+d);
        entrada.close();
    }
}
