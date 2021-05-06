package URI.LE2_Estruturas_Condicionais.Ex1794_Lavanderia;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class Ex1794 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final Lavanderia roupas;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        roupas = new Lavanderia();
    }

    public void EntradaDados() {
        roupas.setRoupas(entrada.nextInt());
        roupas.setMinLavadas(entrada.nextInt());
        roupas.setMaxLavadas(entrada.nextInt());
        roupas.setMinSecas(entrada.nextInt());
        roupas.setMaxSecas(entrada.nextInt());

        System.out.println(roupas.getMaquinaDeLavar());
    }
}

class Lavanderia {
    private int roupas, minLavadas, maxLavadas;
    private int minSecas, maxSecas;

    public void setRoupas(int roupas) {
        this.roupas = roupas;
    }

    public void setMaxLavadas(int maxLavadas) {
        this.maxLavadas = maxLavadas;
    }

    public void setMinLavadas(int minLavadas) {
        this.minLavadas = minLavadas;
    }

    public void setMinSecas(int minSecas) {
        this.minSecas = minSecas;
    }

    public void setMaxSecas(int maxSecas) {
        this.maxSecas = maxSecas;
    }

    public String getMaquinaDeLavar() {
        if (minLavadas <= roupas && maxLavadas >= roupas
                && minSecas <= roupas && maxSecas >= roupas)
            return "possivel";
        return "impossivel";
    }
}