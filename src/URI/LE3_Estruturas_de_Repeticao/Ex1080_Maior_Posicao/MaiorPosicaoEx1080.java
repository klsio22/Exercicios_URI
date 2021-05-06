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
    private final Scanner entrada;
    private final MaiorValor numero;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new MaiorValor();
    }

    public void entradaDados() {
        for (int i = 1; i <= 100; i++) {
            numero.setAuxiliar(i);
            numero.setValor(entrada.nextInt());
        }
        System.out.printf("%d\n%d\n", numero.getValor(), numero.getPosicao());
    }

}

class MaiorValor {

    private int valor, posicao, auxiliar;

    public void setAuxiliar(int auxiliar) {
        this.auxiliar = auxiliar;
    }

    public void setValor(int valor) {
        if (valor > this.valor) {
            this.valor = valor;
            posicao = auxiliar;
        }
    }

    public int getValor() {
        return valor;
    }

    public int getPosicao() {
        return posicao;
    }
}
