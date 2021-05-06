package Testes;

import java.io.IOException;
import java.util.Scanner;

public class Teste1080 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int valor = 0, maiorValor = 0, posicao = 0;

        for (int i = 1; i < 6; i++) {
            valor = entrada.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
                posicao = i;
            }
        }

        System.out.println(maiorValor);
        System.out.println(posicao);
    }

}
