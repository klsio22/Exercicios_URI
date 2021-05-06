package URI.LE2_Estruturas_Condicionais.Ex1042_Sort_Simples;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj1 = new InterfaceTexto();
        obj1.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final NumerosEmOrdemCrescente numero;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new NumerosEmOrdemCrescente();
    }

    public void entradaDados() {
        numero.setNum1(entrada.nextInt());
        numero.setNum2(entrada.nextInt());
        numero.setNum3(entrada.nextInt());
        System.out.print(numero.getNumerosEmOrdemCrescente());
        System.out.printf("%d\n%d\n%d\n", numero.getNum1(),
                numero.getNum2(), numero.getNum3());
    }
}

class NumerosEmOrdemCrescente {
    private int num1, num2, num3;
    private int pos2 = 0;
    private int pos3 = 0;


    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public String getNumerosEmOrdemCrescente() {

        int pos1 = Math.min(num1, Math.min(num2, num3));

        if (pos1 == num1) {
            pos2 = Math.min(num2, num3);
            pos3 = Math.max(num2, num3);
        }

        if (pos1 == num2) {
            pos2 = Math.min(num1, num3);
            pos3 = Math.max(num1, num3);
        }

        if (pos1 == num3) {
            pos2 = Math.min(num1, num2);
            pos3 = Math.max(num1, num2);
        }
        return pos1 + "\n" + pos2 + "\n" + pos3 + "\n\n";
    }

}
