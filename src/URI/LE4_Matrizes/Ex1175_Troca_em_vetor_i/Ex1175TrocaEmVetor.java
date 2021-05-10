package URI.LE4_Matrizes.Ex1175_Troca_em_vetor_i;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1175TrocaEmVetor {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto vetor = new InterfaceTexto();
        vetor.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private TrocaVetores vetor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        vetor = new TrocaVetores();
    }

    public void entradaDados() {
        for (int i = 0; i < vetor.getValor().length; i++)
            vetor.setValores(entrada.nextInt(), i);

        for (int i = 0; i < (vetor.getValor().length / 2); i++)
            vetor.setInversaoValores(i);

        for (int i = 0; i < vetor.getValor().length; i++)
            System.out.printf("N[%d] = %d\n", i, vetor.getValor()[i]);
    }
}

class TrocaVetores {
    private int tamanho = 20;
    private int[] valor = new int[tamanho];
    int indexFinal = this.valor.length - 1;

    public void setValores(int valor, int posicao) {
        this.valor[posicao] = valor;
    }

    public void setInversaoValores(int posicao) {
        int axiliar = this.valor[posicao];
        this.valor[posicao] = this.valor[indexFinal];
        this.valor[indexFinal] = axiliar;
        indexFinal--;
    }

    public int[] getValor() {
        return valor;
    }

}