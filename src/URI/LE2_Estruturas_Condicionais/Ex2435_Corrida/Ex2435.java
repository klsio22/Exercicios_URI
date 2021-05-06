package URI.LE2_Estruturas_Condicionais.Ex2435_Corrida;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex2435 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final Corrida charrete;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        charrete = new Corrida();
    }

    public void entradaDados() {
        charrete.setNumCharrete(entrada.nextInt());
        charrete.setDistancia(entrada.nextInt());
        charrete.setVelocidade(entrada.nextInt());
        charrete.setNumCharrete2(entrada.nextInt());
        charrete.setDistancia2(entrada.nextInt());
        charrete.setVelocidade2(entrada.nextInt());
        System.out.println(charrete.getCharreteVecedora());

    }
}

class Corrida {
    private int numCharrete, distancia, velocidade;
    private int numCharrete2, distancia2, velocidade2;

    public void setNumCharrete(int numCharrete) {
        this.numCharrete = numCharrete;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setDistancia2(int distancia2) {
        this.distancia2 = distancia2;
    }

    public void setNumCharrete2(int numCharrete2) {
        this.numCharrete2 = numCharrete2;
    }

    public void setVelocidade2(int velocidade2) {
        this.velocidade2 = velocidade2;
    }

    public int getCharreteVecedora() {
        double campeao1 = (double) distancia / velocidade;
        double campeao2 = (double) distancia2 / velocidade2;
        if (campeao1 < campeao2)
            return numCharrete;
        return numCharrete2;
    }
}