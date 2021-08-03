package URI.LE3_Estruturas_de_Repeticao.Ex1145_Sequencia_Logica_2;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1445SequenciaLogica2 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto itf = new InterfaceTexto();
        itf.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Sequencia sequenciaNumerica;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        sequenciaNumerica = new Sequencia();
    }

    private void entradaDados() {
        sequenciaNumerica.setQuantidadePorLinha(entrada.nextInt());
        sequenciaNumerica.setValor(entrada.nextInt());
    }

    private void saidaDados() {

        for (ArmazenarSequenciaNumerica sequencia : sequenciaNumerica.getValores()) {

            if (sequencia.getEspaco() == "")
                System.out.printf("%d\n", sequencia.getValores());
            else
                System.out.printf("%d ", sequencia.getValores());

        }

    }

    public void executar() {
        entradaDados();
        saidaDados();
    }
}

class ArmazenarSequenciaNumerica {
    private int valores;
    private String espaco;

    public ArmazenarSequenciaNumerica(int valor, String espaco) {
        this.valores = valor;
        this.espaco = espaco;
    }

    public int getValores() {
        return valores;
    }

    public String getEspaco() {
        return espaco;
    }
}

class Sequencia {
    private int quantidadePorLinha;
    private int valor;
    private ArrayList<ArmazenarSequenciaNumerica> valores = new ArrayList<>();

    public void setQuantidadePorLinha(int quantidadePorLinha) {
        if (quantidadePorLinha > 1 && quantidadePorLinha < 20)
            this.quantidadePorLinha = quantidadePorLinha;
    }

    public void setValor(int valor) {
        if (quantidadePorLinha < valor && valor < 100000)
            this.valor = valor;
    }

    public ArrayList<ArmazenarSequenciaNumerica> getValores() {
        for (int i = 1; i <= valor; i++) {

            if (i % quantidadePorLinha == 0)
                valores.add(new ArmazenarSequenciaNumerica(i, ""));
            else
                valores.add(new ArmazenarSequenciaNumerica(i, " "));
        }

        return valores;
    }

}