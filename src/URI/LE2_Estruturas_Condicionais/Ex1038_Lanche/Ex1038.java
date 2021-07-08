package URI.LE2_Estruturas_Condicionais.Ex1038_Lanche;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final Lanche comida;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        comida = new Lanche();
    }

    public void EntradaDados() {
        comida.setCodigo(entrada.nextInt());
        comida.setQuantidade(entrada.nextInt());
        System.out.printf("Total: R$ %.2f\n",
                comida.getPrecoLanche());
    }

}

class Lanche {
    private int codigo, quantidade;
    private double preco;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoLanche() {

        switch (codigo) {
            case 1:
                preco = 4.0 * quantidade;
                break;
            case 2:
                preco = 4.5 * quantidade;
                break;
            case 3:
                preco = 5.0 * quantidade;
                break;
            case 4:
                preco = 2.0 * quantidade;
                break;
            case 5:
                preco = 1.5 * quantidade;
                break;
        }
        return preco;
    }
}
