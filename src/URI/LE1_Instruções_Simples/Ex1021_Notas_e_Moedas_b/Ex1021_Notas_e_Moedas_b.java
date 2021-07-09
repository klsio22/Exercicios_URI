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
    private ContadorDinheiro dinheiro;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        dinheiro = new ContadorDinheiro();
    }

    public void executar() {
        entradaDados();
        saindaDados();
    }

    private void entradaDados() {
        dinheiro.setValor(entrada.nextDouble());
    }

    private void saindaDados() {

        System.out.printf("NOTAS: \n");
        for (Monetario nota : dinheiro.getQuantidadeNotas()) {
            System.out.printf("%d nota(s) de R$ %d,00\n", nota.getQuantidadeNota(), nota.getCedula());
        }

    }
}

class Monetario {
    private int quantidadeNota;
    private int quantidadeMoedas;
    private int cedula;

    public Monetario(int quantidadeNota, int cedula) {
        this.quantidadeNota = quantidadeNota;
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public int getQuantidadeNota() {
        return quantidadeNota;
    }

    public int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }
}


class ContadorDinheiro {
    private double valor;
    private ArrayList<Monetario> quantidadeNotas = new ArrayList<>();
    private ArrayList<Monetario> quantidadeMoedas = new ArrayList<>();
    private int[] cedulas = {100, 50, 20, 10, 5, 2};

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Monetario> getQuantidadeNotas() {
        for (int i = 0; i < cedulas.length; i++) {
            int nota = 0;
            nota = (int) valor / cedulas[i];
            quantidadeNotas.add(new Monetario(nota, cedulas[i]));
            valor = valor % cedulas[i];

        }
        return quantidadeNotas;
    }

   /* public ArrayList<Integer> getQuantidadeMoedas() {
        int centavos = (int) valor;
        int moedas = (int) ((valor - centavos) * 100);

        for (int i = 0; i < cedulas.length; i++) {
            int moeda = 0;
            moeda = moedas / cedulas[i];
            moedas = moedas % cedulas[i];

            quantidadeMoedas.add(moeda);
        }

        return quantidadeMoedas;
    }*/

}
