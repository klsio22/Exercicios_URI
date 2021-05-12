package URI.LE4_Matrizes.Ex1184_Abaixo_Da_Diagonal_principal;

import java.io.IOException;
import java.util.Scanner;

public class Ex1184AbaixoDaDiagonalPrincipal {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
        obj.saidaDados();
    }

}


class InterfaceTexto {
    private Scanner entrada;
    private Matriz vetor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        vetor = new Matriz();
    }

    public void entradaDados() {


    }

    public void saidaDados() {

    }

}


class Matriz {
    private double soma, media;


}