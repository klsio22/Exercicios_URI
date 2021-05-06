package Testes;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Teste1154 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int idade, soma =0;
        int cont = 0;
        double media = 0.0;

        idade = entrada.nextInt();
        while (idade > 0) {
            soma += idade;
            idade = entrada.nextInt();
            cont ++;
            media = (double) soma / cont;
        }

        System.out.printf("%.2f",media);

    }

}
