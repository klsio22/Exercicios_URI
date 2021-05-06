package URI.LE3_Estruturas_de_Repeticao.Ex1164_Numero_Perfeito;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class NumeroPerfeitoEx1164 {
    public static void main(String[] args) throws IOException {
        InterfeceTexto obj = new InterfeceTexto();
        obj.entradaDados();
    }
}

class InterfeceTexto {
    private final Scanner entrada;
    private final NumerosPerfeito numero;

    public InterfeceTexto() {
        entrada = new Scanner(System.in);
        numero = new NumerosPerfeito();
    }

    public void entradaDados() {
        int NumeroEntradas;

        NumeroEntradas = entrada.nextInt();
        if (NumeroEntradas >= 1 && NumeroEntradas <= 20) {
            for (int i = 0; i < NumeroEntradas; i++) {
                numero.setValor(entrada.nextInt());

                if (numero.getNumerosPerfeitos())
                    System.out.printf("%d eh perfeito\n", numero.getValor());
                else
                    System.out.printf("%d nao eh perfeito\n", numero.getValor());
            }
        }
    }
}

class NumerosPerfeito {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }




    public boolean getNumerosPerfeitos() {
        int contador = valor / 2;
        int divisores = 0;
        if (valor >= 1 && valor <= Math.pow(10, 8)) {
            for (int i = 1; i <= contador; i++) {
                if (valor % i == 0) {
                    divisores += i;
                }
            }
            return divisores == valor;
        }
        return false;
    }
}

