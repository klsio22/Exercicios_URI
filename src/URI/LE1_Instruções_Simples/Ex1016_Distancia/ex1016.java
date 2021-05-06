package URI.LE1_Instruções_Simples.Ex1016_Distancia;
//Klesio Antonio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class ex1016 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int km = entrada.nextInt() ;
        System.out.printf("%d minutos\n", km * 2);
    }
}
