package URI.LE2_Estruturas_Condicionais.Ex1743_Maquina_de_Verificacao_Automatizada;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1743_Maquina_de_Verificacao_Automatizada {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
    }

    private void lerDados() {

    }

    private void imprimirResultado() {
    }

    public void executar() {
        lerDados();
        imprimirResultado();
    }
}

class Maquina {
    private int[] conector1 = new int[5];
    private int[] conector2 = new int[5];

    public void setConector1(int[] conector1) {
        this.conector1 = conector1;
    }





}