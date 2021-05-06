package URI.Ex1001_Extremamente_Basico;
import java.io.IOException;
import java.util.Scanner;

public class ex1001 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int A = 0, B = 0 , X = 0;
        A = entrada.nextInt();
        B = entrada.nextInt();
        X = A+B ;
        System.out.println("X = " + X);
    }
}
