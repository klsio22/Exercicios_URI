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
    private final int TAMANHO = 100;
    private Scanner entrada;
    private Valores valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valores();
    }

    public void executar() {
        entradaDados();
        saidaDados();
    }

    private void entradaDados() {
        for (int i = 0; i < TAMANHO; i++) {
            valor.adicionarValor(i, entrada.nextDouble());
        }
    }

    private void saidaDados() {
        ArrayList<Numero> numeros = valor.getValores();
        for (Numero numero : numeros) {
            System.out.printf("A[%d] = %.1f\n", numero.getPosicao(), numero.getValor());
        }
    }
}

class Numero {
    private int posicao;
    private double valor;

    public Numero(int i, double valor) {
        this.posicao = i;
        this.valor = valor;
    }

    public int getPosicao() {
        return posicao;
    }

    public double getValor() {
        return valor;
    }
}

class Valores {
    private ArrayList<Numero> valores = new ArrayList();

    public void adicionarValor(int i, double valor) {
        if (valor <= 10) {
            valores.add(new Numero(i, valor));
        }
    }

    public ArrayList<Numero> getValores() {
        return valores;
    }
}