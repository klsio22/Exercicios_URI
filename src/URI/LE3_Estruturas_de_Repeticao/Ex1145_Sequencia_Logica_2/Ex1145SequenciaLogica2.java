package URI.LE3_Estruturas_de_Repeticao.Ex1145_Sequencia_Logica_2;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1145SequenciaLogica2 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto itf = new InterfaceTexto();
        itf.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Contador contadorNumerica;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        contadorNumerica = new Contador();
    }

    private void entradaDados() {
        contadorNumerica.setQuantidadePorLinha(entrada.nextInt());
        contadorNumerica.setLimite(entrada.nextInt());
    }

    private void saidaDados() {

        for (String sequencia : contadorNumerica.getValores()) {
            System.out.print(sequencia);
        }

    }

    public void executar() {
        entradaDados();
        saidaDados();
    }
}


class Contador {
    private int quantidadePorLinha;
    private int limite;

    public void setQuantidadePorLinha(int quantidadePorLinha) {
        if (quantidadePorLinha > 1 && quantidadePorLinha < 20)
            this.quantidadePorLinha = quantidadePorLinha;
    }

    public void setLimite(int limite) {
        if (quantidadePorLinha < limite && limite < 100000)
            this.limite = limite;
    }

    public ArrayList<String> getValores() {
        ArrayList<String> sequencia = new ArrayList<>();

        for (int i = 1; i <= limite; i++) {

           /* if (i % quantidadePorLinha == 0)
                sequencia.add(i + "\n");
            else
                sequencia.add(i + " ");
            */

            String sln = (i % quantidadePorLinha == 0) ? i + "\n" :
                    i + " ";

            sequencia.add(sln);
        }
        return sequencia;
    }

}