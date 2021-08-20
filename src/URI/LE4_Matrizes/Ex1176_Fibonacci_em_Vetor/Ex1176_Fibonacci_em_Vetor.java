package URI.LE4_Matrizes.Ex1176_Fibonacci_em_Vetor;

import java.io.IOException;
import java.util.Scanner;

public class Ex1176_Fibonacci_em_Vetor {

    public static void main(String[] args) throws IOException {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Fibonacci fibonacci;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fibonacci = new Fibonacci();
    }

    public void executar() {
        fibonacci.setQuantidade(entrada.nextInt());

        for (int i = 0; i < fibonacci.getQuantidade(); i++) {
            int posicao = entrada.nextInt();
            System.out.printf("Fib(%d) = %d\n", posicao,
                    fibonacci.getNumeroNaPosicao()[posicao]);
        }
    }
}

class Fibonacci {
    private int quantidade;
    private int TAMANHO = 61;
    private long[] fibonacci = new long[TAMANHO];

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long[] getNumeroNaPosicao() {
        for (int i = 0; i < (fibonacci.length - 1); i++) {
            if (i < 2)
                fibonacci[i] = i;
            else
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

}