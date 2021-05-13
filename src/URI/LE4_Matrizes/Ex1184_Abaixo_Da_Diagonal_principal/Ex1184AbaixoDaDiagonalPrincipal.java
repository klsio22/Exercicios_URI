package URI.LE4_Matrizes.Ex1184_Abaixo_Da_Diagonal_principal;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1184AbaixoDaDiagonalPrincipal {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto inteface = new InterfaceTexto();
        inteface.executar();
    }

}

class InterfaceTexto {
    private Scanner entrada;
    private Matriz matriz;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        matriz = new Matriz();
    }

    private void entrada() {
        for (int i = 0; i < matriz.getMatriz().length; i++)
            for (int j = 0; j < matriz.getMatriz()[i].length; j++) {
                matriz.adicionarValores(entrada.nextDouble(), i, j);
            }
    }

    public void executar() {
        char opcao = entrada.next().toUpperCase().charAt(0);

        if (opcao == 'S') {
            entrada();
            System.out.printf("%.1f\n", matriz.getSoma());
        }

        if (opcao == 'M') {
            entrada();
            System.out.printf("%.1f\n", matriz.getMedia());
        }
    }
}

class Matriz {
    private double soma;
    private double[][] matriz = new double[12][12];

    public void adicionarValores(double valor, int linha, int coluna) {
        matriz[linha][coluna] = valor;
    }

    public double getMedia() {
        return getSoma() / ((144.0 - 12) / 2);
    }

    public double getSoma() {
        for (int i = 0; i < matriz.length; i++)
            for (int j = i + 1; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

        return soma;
    }

    public double[][] getMatriz() {
        return matriz;
    }
}