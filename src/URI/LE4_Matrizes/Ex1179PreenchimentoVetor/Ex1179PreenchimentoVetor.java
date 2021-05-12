package URI.LE4_Matrizes.Ex1179PreenchimentoVetor;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Scanner;

public class Ex1179PreenchimentoVetor {
    public static void main(String[] args) throws IOException {
        InterfaceTexto vetor = new InterfaceTexto();
        vetor.entradaDados();
        vetor.saidaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private ParImpar valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new ParImpar();
    }

    public void entradaDados() {
        for (int i = 0; i < 15; i++) {
            valor.setValor(entrada.nextInt());
        }

    }

    public void saidaDados() {
        for (int i = 0; i < valor.getQuantidade(); i++)
            System.out.printf("%s [%d] = %d\n", valor.getNome(), i, valor.getVetor()[i]);
    }

}

class ParImpar {
    private int tamanho = 5;
    private int[] par = new int[tamanho];
    private int[] impar = new int[tamanho];
    private int contPar, contImapar;

    private int[] vetor;
    private String nome;
    private int quantidade;

    public void setValor(int valor) {

        if (valor % 2 == 0) {
            par[contPar++] = valor;
            if (contPar == par.length) {
                setDadosVetor(par, "par", contPar);
                contPar = 0;
            }

        } else {
            impar[contImapar++] = valor;
            if (contImapar == impar.length) {
                setDadosVetor(impar, "impar", contImapar);
                contImapar = 0;
            }
        }

        if (contImapar != 0)
            setDadosVetor(impar, "impar", contImapar);


        if (contPar != 0)
            setDadosVetor(par, "par", contPar);


    }

    private void setDadosVetor(int[] vetor, String nome, int quantidade) {
        setVetor(vetor);
        setNome(nome);
        setQuantidade(quantidade);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int[] getVetor() {
        return vetor;
    }

}

