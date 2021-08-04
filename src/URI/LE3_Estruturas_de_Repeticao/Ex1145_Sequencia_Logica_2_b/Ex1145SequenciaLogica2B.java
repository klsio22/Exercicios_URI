package URI.LE3_Estruturas_de_Repeticao.Ex1145_Sequencia_Logica_2_b;
//Klésio Antônio do Nascimento

import java.io.IOException;
import java.util.Scanner;

public class Ex1145SequenciaLogica2B {
    public static void main(String[] args) throws IOException {
        InterfaceTexto itf = new InterfaceTexto();
        itf.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Contador contadorNumerico;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        contadorNumerico = new Contador();
    }

    private void entradaDados() {
        contadorNumerico.setQuantidadePorLinha(entrada.nextInt());
        contadorNumerico.setLimite(entrada.nextInt());
    }

    private void saidaDados() {
        System.out.print(contadorNumerico.getValores());
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

    public StringBuffer getValores() {
        StringBuffer sequencia = new StringBuffer();

        for (int i = 1; i <= limite; i++) {
            String sln = (i % quantidadePorLinha == 0) ? i + "\n" : i + " ";
            sequencia.append(sln);
        }
        return sequencia;
    }

}