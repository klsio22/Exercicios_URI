package URI.LE4_Matrizes.Ex1174_Selecao_de_vetor;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex1174SelecaoDeVetor {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto inteface = new InterfaceTexto();
        inteface.executar();
    }
}

class InterfaceTexto {
    private final int TAMANHO = 5;
    private Scanner entrada;
    private Vetor vetor;
    private Numero numero;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        vetor = new Vetor();
    }

    public void executar() {
        entradaDados();
        saidaDados();
    }

    private void entradaDados() {
        for (int i = 0; i < TAMANHO; i++) {
            vetor.adicionarValor(i, entrada.nextDouble());
        }
    }

    private void saidaDados() {
        for (int i = 0; i < vetor.getVetor().size(); i++)
            System.out.printf("A[%d] = %.1f\n", i, vetor.getVetor().get(i));
    }

}

class Numero {
    private int posicao;
    private double valor;

    public Numero(int i, double valor) {
        this.posicao = i;
        this.valor = valor;
    }
}

class Vetor {
    private ArrayList<Numero> vetor = new ArrayList();

    public void adicionarValor(int i, double valor) {
        if (valor <= 10) {
            vetor.add(new Numero(i, valor));
        }
    }

    public ArrayList<Numero> getVetor() {
        return vetor;
    }
}