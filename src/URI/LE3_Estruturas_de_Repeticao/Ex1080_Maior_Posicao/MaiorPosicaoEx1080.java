package URI.LE3_Estruturas_de_Repeticao.Ex1080_Maior_Posicao;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class MaiorPosicaoEx1080 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private MaiorValor numero;
    private int tamanho = 100;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new MaiorValor();
    }

    public void entradaDados() {
        for (int i = 1; i <= tamanho; i++) {
            numero.setValor(entrada.nextInt(), i);
        }
        System.out.printf("%d\n%d\n", numero.getValor(), numero.getPosicao());
    }

}

class MaiorValor {

    private int valor, posicao;

    public void setValor(int valor, int posicao) {
        if (valor > this.valor) {
            this.valor = valor;
            this.posicao = posicao;
        }
    }

    public int getValor() {
        return valor;
    }

    public int getPosicao() {
        return posicao;
    }
}
