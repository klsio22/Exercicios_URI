package URI.LE4_Matrizes.Ex1179PreenchimentoVetor;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Scanner;

public class Ex1179PreenchimentoVetor {
    public static void main(String[] args) throws IOException {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
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
    }

    private void entradaDados() {
        for (int i = 0; i < 15; i++) {
            vetor.adiciona(entrada.nextInt());

            if (vetor.paresEstaCheio())
                imprimirPares();

            if (vetor.imparesEstaCheio())
                imprimirImpares();
        }

        imprimirImpares();
        imprimirPares();
    }

    public void imprimirPares() {
        for (int i = 0; i < vetor.getQuantidadePares(); i++)
            System.out.printf("par[%d] = %d\n", i, vetor.getPares()[i]);
    }

    public void imprimirImpares() {
        for (int i = 0; i < vetor.getQuantidadeImpares(); i++)
            System.out.printf("impar[%d] = %d\n", i, vetor.getImpares()[i]);
    }

}

class Vetor {
    private int tamanho = 5;
    private int[] pares = new int[tamanho];
    private int[] impares = new int[tamanho];
    private int contadorPares, contadorImpares;
    private int quantidadePares, quantidadeImpares;

    public void adiciona(int valor) {

        if (valor % 2 == 0) {
            pares[contadorPares++] = valor;
            setQuantidadePares(contadorPares);
            paresEstaCheio();
        } else {
            impares[contadorImpares++] = valor;
            setQuantidadeImpares(contadorImpares);
                imparesEstaCheio();

        }

    }

    public boolean paresEstaCheio() {
        return contadorPares == pares.length;
    }

    public boolean imparesEstaCheio() {
        return contadorImpares == impares.length;
    }

    private void setQuantidadeImpares(int quantidadeImpares) {
        this.quantidadeImpares = quantidadeImpares;
    }

    private void setQuantidadePares(int quantidadePares) {
        this.quantidadePares = quantidadePares;
    }

    public int getQuantidadePares() {
        return quantidadePares;
    }

    public int getQuantidadeImpares() {
        return quantidadeImpares;
    }

    public int[] getPares() {
        contadorPares = 0;
        return pares;
    }

    public int[] getImpares() {
        contadorImpares = 0;
        return impares;
    }
}