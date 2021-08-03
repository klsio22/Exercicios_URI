package URI.LE3_Estruturas_de_Repeticao.Ex1589_Bob_Conduite;
//KLÉSIO ANTÔNIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex1589_Bob_Conduite {
    public static void main(String[] args) throws IOException {
        InterfaceTexto itf = new InterfaceTexto();
        itf.executar();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private RaioCirulos raio;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        raio = new RaioCirulos();
    }

    private void entradaDados() {
        raio.setNumeroTestes(entrada.nextInt());

        for (int i = 0; i < raio.getNumeroTestes(); i++) {
            raio.setRaio1(entrada.nextInt());
            raio.setRaio2(entrada.nextInt());
            saidaDados();
        }

    }

    private void saidaDados() {
        System.out.printf("%d\n", raio.getMenorRaio());
    }

    public void executar() {
        entradaDados();
    }

}

class RaioCirulos {
    private int numeroTestes, raio1, raio2;

    public void setNumeroTestes(int numeroTestes) {
        this.numeroTestes = numeroTestes;
    }

    public void setRaio1(int raio1) {
        this.raio1 = raio1;
    }

    public void setRaio2(int raio2) {
        this.raio2 = raio2;
    }

    public int getNumeroTestes() {
        return numeroTestes;
    }

    public int getMenorRaio() {
        return raio1 + raio2;
    }
}
