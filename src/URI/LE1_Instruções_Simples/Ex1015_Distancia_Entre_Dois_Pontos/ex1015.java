package URI.LE1_Instruções_Simples.Ex1015_Distancia_Entre_Dois_Pontos;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1015 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        double x1 = ent.nextDouble(), y1 = ent.nextDouble();
        double x2 = ent.nextDouble() , y2 = ent.nextDouble(),
                distancia = 0;

        distancia = Math.sqrt(Math.pow((x2-x1 ), 2)+ Math.pow((y2-y1), 2));
        System.out.printf("%.4f\n",distancia);
        ent.close();
    }
}
