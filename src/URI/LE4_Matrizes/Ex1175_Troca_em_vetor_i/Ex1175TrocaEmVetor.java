package URI.LE4_Matrizes.Ex1175_Troca_em_vetor_i;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Scanner;

public class Ex1175TrocaEmVetor {
    public static void main(String[] args) throws IOException {
        InterfaceTexto inteface = new InterfaceTexto();
        inteface.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Vetor vetor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        vetor = new Vetor();
    }

    public void executar() {
        entradaDados();
        saindaDados();
    }

    private void entradaDados() {
        for (int i = 0; i < vetor.getValor().length; i++)
            vetor.adicionaValor(entrada.nextInt(), i);
    }

    private void saindaDados() {
        vetor.getInverso();
        for (int i = 0; i < vetor.getValor().length; i++)
            System.out.printf("N[%d] = %d\n", i, vetor.getValor()[i]);
    }
}

class Vetor {
    private final int tamanho = 20;
    private int[] valor = new int[tamanho];
    int indexFinal = valor.length - 1;

    public void adicionaValor(int valor, int posicao) {
        this.valor[posicao] = valor;
    }

    public int[] getInverso() {
        int axiliar;
        for (int i = 0; i < (valor.length / 2); i++) {
            axiliar = valor[i];
            valor[i] = valor[indexFinal];
            valor[indexFinal] = axiliar;
            indexFinal--;
        }

        return valor;
    }

    public int[] getValor() {
        return valor;
    }
}