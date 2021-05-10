package URI.LE4_Matrizes.Ex1174_Selecao_de_vetor;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1174SelecaoDeVetor {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto vetor= new InterfaceTexto();
        vetor.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private PosicaoVetor vetor;
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        vetor = new PosicaoVetor();
    }

    public void entradaDados() {

        for (int i = 0; i < vetor.getValor().length; i++) {
            vetor.setValores(entrada.nextDouble(), i);
        }

        for (int i = 0; i < vetor.getValor().length; i++)
            if (vetor.getValor()[i] <= 10)
                System.out.printf("A[%d] = %.1f\n", i , vetor.getValor()[i]);
    }
}

class PosicaoVetor {
    private int tamanho = 100;
    private double[] valor = new double[tamanho];

    public void setValores(double valor, int posicao) {
        this.valor[posicao] = valor;
    }

    public double[] getValor() {
        return valor;
    }
}