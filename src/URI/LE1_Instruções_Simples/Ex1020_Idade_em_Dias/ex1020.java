package URI.LE1_Instruções_Simples.Ex1020_Idade_em_Dias;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class ex1020 {
    public static void main(String[] args) throws IOException {
        Scanner ent = new Scanner(System.in);
        int x = ent.nextInt(), ano , mes , dia;
        ano = x / 365;
        x = x % 365;
        mes = x / 30;
        x = x % 30;
        dia = x;
        System.out.printf("%d ano(s)\n" +
                "%d mes(es)\n" +
                "%d dia(s)\n",ano , mes , dia);

    }

}
