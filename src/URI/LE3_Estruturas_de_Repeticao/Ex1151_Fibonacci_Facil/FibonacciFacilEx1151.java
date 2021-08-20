package URI.LE3_Estruturas_de_Repeticao.Ex1151_Fibonacci_Facil;

//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class FibonacciFacilEx1151 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto it = new InterfaceTexto();
        it.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Fibonacci valores;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valores = new Fibonacci();
    }

    public void entradaDados() {
        valores.setValores(entrada.nextInt());
        System.out.println(valores.getSequenciaFibonacci());
    }
}

class Fibonacci {
    private int valores;
    private String fibonacci = "";

    public void setValores(int valores) {
        if (valores > 0 && valores < 46)
            this.valores = valores;
    }

    public String getSequenciaFibonacci() {
        for (int i = 0; i < valores; i++) {
            fibonacci += getFibonacci(i) + " ";
        }
        return fibonacci.trim();
    }

    private int getFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }



}
