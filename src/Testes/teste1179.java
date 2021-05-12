package Testes;

import java.io.IOException;
import java.util.Scanner;

public class teste1179 {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int tamanho = 5;
        int[] par = new int[tamanho];
        int[] impar = new int[tamanho];

        int valor;
        int contPar = 0, contImpar = 0;
        for (int i = 0; i < 15; i++) {
            valor = entrada.nextInt();

            if (valor % 2 == 0) {
                par[contPar++] = valor;
                if (contPar == par.length) {
                    imprimirVetor(par, "par", contPar);
                    contPar = 0;
                }
            } else {
                impar[contImpar++] = valor;
                if (contImpar == impar.length) {
                    imprimirVetor(impar, "impar", contImpar);
                    contImpar = 0;
                }
            }
        }

        if (contImpar != 0) {
            imprimirVetor(impar, "impar", contImpar);
        }

        if (contPar != 0) {
            imprimirVetor(par, "par", contPar);
        }
    }


    public static void imprimirVetor(int[] vetor, String str, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(str + "[" + i + "]" + " = " + vetor[i]);
        }
    }
}
