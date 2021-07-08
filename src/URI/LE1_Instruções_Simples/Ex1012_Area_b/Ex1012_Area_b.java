package URI.LE1_Instruções_Simples.Ex1012_Area_b;
//Klesio Antonio do Nascimento

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1012_Area_b {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto area = new InterfaceTexto();
        area.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Area valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Area();
    }

    private void entrada() {
        valor.setValor1(entrada.nextDouble());
        valor.setValor2(entrada.nextDouble());
        valor.setValor3(entrada.nextDouble());
    }

    private void saida() {
        System.out.printf("TRIANGULO: %.3f\n", valor.getAreaTriangulo());
        System.out.printf("CIRCULO: %.3f\n", valor.getAreaCirculo());
        System.out.printf("TRAPEZIO: %.3f\n", valor.getAreaTrapezio());
        System.out.printf("QUADRADO: %.3f\n", valor.getAreaQuadrado());
        System.out.printf("RETANGULO: %.3f\n", valor.getAreaRetangulo());
    }

    public void executar() {
        entrada();
        saida();
    }

}

class Area {
    private double valor1, valor2, valor3;
    private final double pi = 3.14159;

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getAreaTriangulo() {
        return ((valor1 * valor3) / 2);
    }

    public double getAreaCirculo() {
        return (pi * (Math.pow(valor3, 2)));
    }

    public double getAreaTrapezio() {
        return ((valor1 + valor2) * valor3) / 2;
    }

    public double getAreaQuadrado() {
        return valor2 * valor2;
    }

    public double getAreaRetangulo() {
        return valor1 * valor2;
    }

}