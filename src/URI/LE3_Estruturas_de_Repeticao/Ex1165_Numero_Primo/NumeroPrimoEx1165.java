package URI.LE3_Estruturas_de_Repeticao.Ex1165_Numero_Primo;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class NumeroPrimoEx1165 {
    public static void main(String[] args) throws IOException {
        InterfeceTexto obj = new InterfeceTexto();
        obj.render();
    }

}

class InterfeceTexto {
    private final Scanner entrada;
    private final NumeroPrimoOuNao primo;

    public InterfeceTexto() {
        entrada = new Scanner(System.in);
        primo = new NumeroPrimoOuNao();
    }

    public void render() {
        int NumeroEntradas;
        NumeroEntradas = entrada.nextInt();

        if (NumeroEntradas >= 1 && NumeroEntradas <= 100) {
                for (int i = 0; i < NumeroEntradas; i++) {
                primo.setPrimo(entrada.nextInt());

                System.out.print(primo.getPrimo());

                if (primo.getNumeroPrimo())
                    System.out.println(" eh primo");
                else
                    System.out.println(" nao eh primo");

            }
        }
    }
}

class NumeroPrimoOuNao {
    private int primo;

    public void setPrimo(int primo) {
        this.primo = primo;
    }

    public int getPrimo() {
        return primo;
    }

    public boolean getNumeroPrimo() {
        for (int j = 2; j <= primo / 2; j++)
            if (primo % j == 0)
                return false;
        return primo != 1;
    }
}