package URI.LE1_Instruções_Simples.Ex1015_Distancia_Entre_Dois_Pontos_b;
//Klesio Antonio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1015_Distancia_Entre_Dois_Pontos_b {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto distancia = new InterfaceTexto();
        distancia.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Distancia valor;

    InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Distancia();
    }

    private void entradaDados() {
        valor.setValorX1(entrada.nextDouble());
        valor.setValorY1(entrada.nextDouble());
        valor.setValorX2(entrada.nextDouble());
        valor.setValorY2(entrada.nextDouble());

    }

    private void saidaDados() {
        System.out.printf("%.4f\n", valor.getDistancia());
    }

    public void executar(){
        entradaDados();
        saidaDados();
    }

}

class Distancia {
    private double valorX1, valorX2, valorY1, valorY2;

    public void setValorX1(double valorX1) {
        this.valorX1 = valorX1;
    }

    public void setValorX2(double valorX2) {
        this.valorX2 = valorX2;
    }

    public void setValorY1(double valorY1) {
        this.valorY1 = valorY1;
    }

    public void setValorY2(double valorY2) {
        this.valorY2 = valorY2;
    }

    public double getDistancia() {
        return Math.sqrt(Math.pow((valorX2-valorX1 ), 2) + Math.pow((valorY2-valorY1), 2));
    }

}