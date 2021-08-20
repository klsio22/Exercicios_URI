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
    private Fibonacci quantidade;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        quantidade = new Fibonacci();
    }

    public void executar() {
        quantidade.setQuantidade(entrada.nextInt());

        for (int i = 0; i < quantidade.getQuantidade(); i++) {
            int posicao = entrada.nextInt();
            System.out.printf("Fib(%d) = %d\n", posicao,
                    quantidade.getNEssimoElemento()[posicao]);
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

    public long[] getNEssimoElemento() {
        for (int i = 0; i <= (fibonacci.length-1); i++) {
            if (i < 2)
                fibonacci[i] = i;
            else
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

}