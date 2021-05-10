package URI.LE4_Matrizes.Ex1180MenorPosicao;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Scanner;

public class Ex1180MenorPosicao {
    public static void main(String[] args) throws IOException {
        InterfaceTexto vetor = new InterfaceTexto();
        vetor.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private MenorValor vetor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        vetor = new MenorValor(entrada.nextInt());
    }

    public void entradaDados() {
        for (int i = 0; i < vetor.getValor().length; i++)
            vetor.setValor(entrada.nextInt(), i);

        System.out.printf("Menor valor: %d\n", vetor.getMenorValor());
        System.out.printf("Posicao: %d\n", vetor.getPosicaoMenor());
    }
}

class MenorValor {
    private int posicaoMenor, menorValor;
    private int valor[];

    public MenorValor(int tamanho) {
        setMenorValor(10000000);
        setPosicaoMenor(0);
        valor = new int[tamanho];
    }

    public void setValor(int valor, int posicao) {
        this.valor[posicao] = valor;
        if (this.valor[posicao] < menorValor) {
            menorValor = this.valor[posicao];
            this.posicaoMenor = posicao;
        }
    }

    private void setMenorValor(int menorValor) {
        this.menorValor = menorValor;
    }

    private void setPosicaoMenor(int posicaoMenor) {
        this.posicaoMenor = posicaoMenor;
    }

    public int getMenorValor() {
        return menorValor;
    }

    public int getPosicaoMenor() {
        return posicaoMenor;
    }

    public int[] getValor() {
        return valor;
    }
}