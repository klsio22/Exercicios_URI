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
        System.out.printf("NOTAS:\n");
        for (Cedulas nota : dinheiro.getQuantidadeNotas()) {
            if (nota.getValor() != 1)
                System.out.printf("%d nota(s) de R$ %d.00\n",
                        nota.getQuantidadeCedulas(), nota.getValor());
            if (nota.getValor() == 1) {
                System.out.printf("MOEDAS:\n");
                System.out.printf("%d moeda(s) de R$ %d.00\n",
                        nota.getQuantidadeCedulas(), nota.getValor());
            }
        }

        for (Monetario moeda : dinheiro.getQuantidadeMoedas()) {
            System.out.printf("%d moeda(s) de R$ %s\n",
                    moeda.getQuantidadeMoeda(), moeda.getMoedas());
        }
    }
}

class Cedulas {
    private int quantidadeCedulas;
    private int valor;

    public Cedulas(int quantidadeCedulas, int valor) {
        this.quantidadeCedulas = quantidadeCedulas;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidadeCedulas() {
        return quantidadeCedulas;
    }
}

class Monetario {
    private int quantidadeMoeda;
    private String moedas;

    public Monetario(int quantidadeMoeda, String moedas) {
        this.quantidadeMoeda = quantidadeMoeda;
        this.moedas = moedas;
    }

    public String getMoedas() {
        return moedas;
    }

    public int getQuantidadeMoeda() {
        return quantidadeMoeda;
    }
}

class ContadorDinheiro {
    private double valor;
    private ArrayList<Cedulas> quantidadeNotas = new ArrayList<>();
    private ArrayList<Monetario> quantidadeMoedas = new ArrayList<>();
    private int[] restoCedulas = {100, 50, 20, 10, 5, 2, 1};
    private int[] restoMoedas = {50, 25, 10, 5, 1};
    private String[] restoCentavos = {"0.50", "0.25", "0.10", "0.05", "0.01"};

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Cedulas> getQuantidadeNotas() {
        for (int i = 0; i < restoCedulas.length; i++) {
            int nota = 0;
            nota = (int) valor / restoCedulas[i];
            quantidadeNotas.add(new Cedulas(nota, restoCedulas[i]));
            valor = valor % restoCedulas[i];

        }
        return quantidadeNotas;
    }

    public ArrayList<Monetario> getQuantidadeMoedas() {
        int centavos = (int) valor;
        int moedas = (int) ((valor - centavos) * 100);

        for (int i = 0; i < restoMoedas.length; i++) {
            int moeda = 0;
            moeda = moedas / restoMoedas[i];
            quantidadeMoedas.add(new Monetario(moeda, restoCentavos[i]));
            moedas = moedas % restoMoedas[i];
        }
        return quantidadeMoedas;
    }

}
