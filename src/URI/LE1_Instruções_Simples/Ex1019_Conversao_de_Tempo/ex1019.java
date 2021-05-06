package URI.LE1_Instruções_Simples.Ex1019_Conversao_de_Tempo;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class ex1019 {
    public static void main(String[] args) throws IOException {

        Scanner ent = new Scanner(System.in);

        int N = ent.nextInt();
        int hora , min , seg ;

        hora = N/3600;
        N = N % 3600;

        min =  N / 60;
        N = N % 60;

        seg = N;

        System.out.printf("%d:%d:%d\n",hora,min,seg);
    }
}
