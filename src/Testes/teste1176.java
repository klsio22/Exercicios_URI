package Testes;

import java.util.Scanner;

public class teste1176 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade, pesquisar;
        long fib[] = new long[61];
        quantidade = entrada.nextInt();

        for (int i = 0; i <= 60; i++) {
            if (i < 2)
                fib[i] = i;
            else
                fib[i] = fib[i - 2] + fib[i - 1];
        }

        for (int i = 0; i < quantidade; i++) {
            pesquisar = entrada.nextInt();
            System.out.printf("Fib(%d) = %d\n", pesquisar, fib[pesquisar]);
        }
    }

}
