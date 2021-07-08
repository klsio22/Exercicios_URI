package URI.LE1_Instruções_Simples.Ex1018_Cedulas;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class ex1018 {
    public static void main(String[] args) throws IOException {

        Scanner ent = new Scanner(System.in);
        int n = ent.nextInt() , valor = n;
        int cem , cinquenta , vinte , dez , cinco , dois ,um;

        if (0 < n && n <1000000) {
            cem = n / 100;
            n = n % 100;

            cinquenta = n / 50;
            n = n % 50;

            vinte = n / 20;
            n = n % 20;

            dez = n / 10;
            n = n % 10;

            cinco = n / 5;
            n = n % 5;

            dois = n / 2;
            n = n % 2;

            um = n ;

            System.out.printf("%d\n" +
                    "%d nota(s) de R$ 100,00\n" +
                    "%d nota(s) de R$ 50,00\n" +
                    "%d nota(s) de R$ 20,00\n" +
                    "%d nota(s) de R$ 10,00\n" +
                    "%d nota(s) de R$ 5,00\n" +
                    "%d nota(s) de R$ 2,00\n" +
                    "%d nota(s) de R$ 1,00\n", valor, cem, cinquenta,
                    vinte, dez, cinco, dois, um);
        }
    }

}
