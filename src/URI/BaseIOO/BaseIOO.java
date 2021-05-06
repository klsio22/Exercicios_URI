package URI.BaseIOO;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class BaseIOO {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final NomeDaIntaciaObjeto nomeDaIntaciaClasse;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        nomeDaIntaciaClasse = new NomeDaIntaciaObjeto();
    }

    public void entradaDados() {
        nomeDaIntaciaClasse.setX(entrada.nextInt());
        System.out.println(nomeDaIntaciaClasse.getRetornarString());
    }
}

class NomeDaIntaciaObjeto {
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public String getRetornarString(){
        return"";
    }
}