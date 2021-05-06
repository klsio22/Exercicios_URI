package URI.LE3_Estruturas_de_Repeticao.Ex1094_Experiencia;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Experiencia1094 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final Experimento cobaias;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        cobaias = new Experimento();
    }

    public void entradaDados() {
        int exprimentos;
        exprimentos = entrada.nextInt();

        for (int i = 0; i < exprimentos; i++) {
            cobaias.setAnimais(entrada.nextInt(), entrada.next().charAt(0));
        }

        System.out.printf("Total: %d cobaias\n",
                cobaias.getTotalAnimais());
        System.out.printf("Total de coelhos: %d\n",
                cobaias.getCoelhos());
        System.out.printf("Total de ratos: %d\n",
                cobaias.getRatos());
        System.out.printf("Total de sapos: %d\n",
                cobaias.getSapos());

        System.out.printf("Percentual de coelhos: %.2f %%\n",
                cobaias.getPorCentCoelhos());

        System.out.printf("Percentual de ratos: %.2f %%\n",
                cobaias.getPorcentRatos());

        System.out.printf("Percentual de sapos: %.2f %%\n",
                cobaias.getPorcentSapos());

    }
}

class Experimento {
    private int total;
    private int coelhos, ratos, sapos;
    private double porCentCoelhos, porcentRatos, porcentSapos;

    public void setAnimais(int quantia, char tipoCobai) {
        if (quantia >= 1 && quantia <= 15) {
            total += quantia;
            if (tipoCobai == 'C')
                coelhos += quantia;
            if (tipoCobai == 'R')
                ratos += quantia;
            if (tipoCobai == 'S')
                sapos += quantia;

            porCentCoelhos = (double) (coelhos * 100) / total;
            porcentRatos = (double) (ratos * 100) / total;
            porcentSapos = (double) (sapos * 100) / total;
        }
    }

    public double getPorCentCoelhos() {
        return porCentCoelhos;
    }

    public double getPorcentRatos() {
        return porcentRatos;
    }

    public double getPorcentSapos() {
        return porcentSapos;
    }

    public int getTotalAnimais() {
        return total;
    }

    public int getRatos() {
        return ratos;
    }

    public int getSapos() {
        return sapos;
    }

    public int getCoelhos() {
        return coelhos;
    }
}