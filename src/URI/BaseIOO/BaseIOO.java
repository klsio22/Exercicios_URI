package URI.BaseIOO;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class BaseIOO {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.executar();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final NomeDaIntaciaObjeto nomeDaIntaciaClasse;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        nomeDaIntaciaClasse = new NomeDaIntaciaObjeto();
    }

    private void entradaDados() {
        nomeDaIntaciaClasse.setX(entrada.nextInt());
    }

    private void saidaDados() {
        System.out.println(nomeDaIntaciaClasse.getRetornarString());
    }

    public void executar() {
        entradaDados();
        saidaDados();
    }


}

class NomeDaIntaciaObjeto {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public String getRetornarString() {
        return "";
    }
}