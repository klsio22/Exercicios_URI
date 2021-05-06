package URI.LE2_Estruturas_Condicionais.Ex1794b_Lavanderia;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex1794b {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }

}

class InterfaceTexto {
    private final Scanner entrada;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
    }

    public void EntradaDados() {
        int roupas = entrada.nextInt();
        int minLavadas = entrada.nextInt();
        int maxLavadas = entrada.nextInt();
        int minSecas = entrada.nextInt();
        int maxSecas = entrada.nextInt();

        Lavanderia pecas = new Lavanderia(roupas, minLavadas,
                maxLavadas, minSecas, maxSecas);
        System.out.println(pecas.getMaquinaDeLavar());
    }
}

class Lavanderia {
    private final int roupas;
    private final int minLavadas;
    private final int maxLavadas;
    private final int minSecas;
    private final int maxSecas;

    public Lavanderia(int roupas, int minLavadas,
                      int maxLavadas, int minSecas,
                      int maxSecas) {
        this.roupas = roupas;
        this.minLavadas = minLavadas;
        this.minSecas = minSecas;
        this.maxLavadas = maxLavadas;
        this.maxSecas = maxSecas;
    }

    public String getMaquinaDeLavar() {
        if (minLavadas <= roupas && maxLavadas >= roupas
                && minSecas <= roupas && maxSecas >= roupas)
            return "possivel";
        return "impossivel";
    }
}