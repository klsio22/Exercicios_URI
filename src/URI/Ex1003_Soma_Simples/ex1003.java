package URI.Ex1003_Soma_Simples;
//Klesio Antonio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class ex1003 {
    public static void main(String[] args) throws IOException {
        Scanner ent = new Scanner(System.in);
        int A = ent.nextInt(),
                B = ent.nextInt();
        System.out.printf("SOMA = %d\n", A+B);
    }
}
