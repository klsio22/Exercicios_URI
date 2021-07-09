package URI.LE1_Instruções_Simples.Ex1021_Notas_e_Moedas_b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex1021_Notas_e_Moedas_b{
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
        List<Integer> cedulas = Arrays.asList(100, 50, 20, 10, 5, 2);

        System.out.printf("NOTAS: \n");
        for (Integer nota : dinheiro.getQuantidadeNotas()) {
            System.out.printf("%d nota(s) de ", nota);
            for (Integer cedula : cedulas) {
                System.out.printf("R$ %d,00\n", cedula);
            }
        }


    }
}

class Monetario {


}


class ContadorDinheiro {
    private double valor;
    private ArrayList<Integer> quantidadeNotas = new ArrayList<>();
    private ArrayList<Integer> quantidadeMoedas = new ArrayList<>();
    private int[] cedulas = {100, 50, 20, 10, 5, 2};

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Integer> getQuantidadeNotas() {
        for (int i = 0; i < cedulas.length; i++) {
            int nota = 0;
            nota = (int) valor / cedulas[i];
            valor = valor % cedulas[i];
            quantidadeNotas.add(nota);
        }
        return quantidadeNotas;
    }

    public ArrayList<Integer> getQuantidadeMoedas() {
        int centavos = (int) valor;
        int moedas = (int) ((valor - centavos) * 100);

        for (int i = 0; i < cedulas.length; i++) {
            int moeda = 0;
            moeda = moedas / cedulas[i];
            moedas = moedas % cedulas[i];

            quantidadeMoedas.add(moeda);
        }

        return quantidadeMoedas;
    }

}
