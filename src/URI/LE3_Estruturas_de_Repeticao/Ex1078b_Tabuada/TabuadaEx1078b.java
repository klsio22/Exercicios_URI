package URI.LE3_Estruturas_de_Repeticao.Ex1078b_Tabuada;

import java.io.IOException;
import java.util.Scanner;

public class TabuadaEx1078b {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}


class InterfaceTexto {
    private final Scanner entrada;
    private final FormarTabuada numero;


    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new FormarTabuada();
    }

    public void EntradaDados() {
        numero.setNumero(entrada.nextInt());
        System.out.print(numero.getTabuada());
    }
}

class FormarTabuada {
    private String tabuada;
    private int numero;

    public void setNumero(int numero) {
        if (numero > 2 && numero < 1000)
            this.numero = numero;
    }

    public String getTabuada() {
            for (int i = 1; i < 11; i++)
                tabuada += i + " x " + numero + " = " + (numero * i) + "\n";
        return tabuada;
    }

}
