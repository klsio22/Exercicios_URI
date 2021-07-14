package URI.LE1_Instruções_Simples.Ex1021_Notas_e_Moedas_b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex1021_Notas_e_Moedas_b {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto dinheiro = new InterfaceTexto();
        dinheiro.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private DivisorMonetario divisorMonetario;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        divisorMonetario = new DivisorMonetario();
    }

    public void executar() {
        lerDados();
        imprimirResultado();
    }

    private void lerDados() {
        divisorMonetario.setValor(entrada.nextDouble());
    }

    private void imprimirResultado() {
        System.out.println("NOTAS:");
        for (Monetario cedula : divisorMonetario.getCedulas()) {
            System.out.printf("%d nota(s) de R$ %.2f%n", cedula.getQuantidade(), cedula.getValor());
        }

        System.out.println("MOEDAS:");
        for (Monetario cedula : divisorMonetario.getMoedas()) {
            System.out.printf("%d nota(s) de R$ %.2f\n", cedula.getQuantidade(), cedula.getValor());
        }
    }
}

class Monetario {
    private int quantidade;
    private double valor;

    public Monetario(int quantidade, double valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

class DivisorMonetario {

    private double valor;
    private double umReal;
    private ArrayList<Monetario> cedulas = new ArrayList<>();
    private ArrayList<Monetario> moedas = new ArrayList<>();

    private static final int[] TIPOS_DE_CEDULAS = {100, 50, 20, 10, 5, 2, 1};
    private static final double[] TIPOS_DE_MOEDAS = {0.50, 0.25, 0.10, 0.05, 0.01};


    public void setValor(double valor) {
        this.valor = valor;
        calcularDivisaoMonetaria();
    }

    public double getValor() {
        return valor;
    }

    public ArrayList<Monetario> getCedulas() {
        return cedulas;
    }

    public ArrayList<Monetario> getMoedas() {
        return moedas;
    }

    public double getUmReal() {
        return umReal;
    }

    private void calcularDivisaoMonetaria() {
        cedulas.clear();
        moedas.clear();
        double valor = this.valor;

        for (int cedula : TIPOS_DE_CEDULAS) {

            int quantidade = (int) valor / cedula;
            valor = valor % cedula;
            cedulas.add(new Monetario(quantidade, cedula));
        }


        double moedaAjustado = (int) ((valor - (int) valor) * 100);

        for (double moeda : TIPOS_DE_MOEDAS) {
            moeda *= 100;

            int quantidade = (int) (moedaAjustado / moeda);
            moedaAjustado = moedaAjustado % moeda;
            moedas.add(new Monetario(quantidade, moeda / 100));

        }
    }
}