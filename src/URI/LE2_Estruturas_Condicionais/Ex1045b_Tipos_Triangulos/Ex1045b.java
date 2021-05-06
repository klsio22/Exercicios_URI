package URI.LE2_Estruturas_Condicionais.Ex1045b_Tipos_Triangulos;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1045b {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto2 obj = new InterfaceTexto2();
        obj.Renderizar();
    }
}

class InterfaceTexto2 {
    private final Scanner entrada;
    private final TiposDeTriangulos triangulos;

    public InterfaceTexto2() {
        entrada = new Scanner(System.in);
        triangulos = new TiposDeTriangulos();
    }

    public void Renderizar() {
        triangulos.setA(entrada.nextDouble());
        triangulos.setB(entrada.nextDouble());
        triangulos.setC(entrada.nextDouble());
        System.out.println(triangulos.getTiposDeTriagulos());
    }

}

class TiposDeTriangulos {
    private double A = 0.0, B = 0.0, C = 0.0;

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setC(double C) {
        this.C = C;
    }

    public String getTiposDeTriagulos() {

        double ladoA = Math.max(A, Math.max(B, C));
        double ladoB = 0.0;
        double ladoC = 0.0;

        if (ladoA == A) {
            ladoB = Math.max(B, C);
            ladoC = Math.min(B, C);
        }

        if (ladoA == B) {
            ladoB = Math.max(A, C);
            ladoC = Math.min(A, C);
        }

        if (ladoA == C) {
            ladoB = Math.max(B, A);
            ladoC = Math.min(B, A);
        }

        if (A + B > C && B + C > A && C + A > B) {

            if (ladoA * ladoA > ((ladoB * ladoB) + (ladoC * ladoC)))
                // se ladoA > temB + ladoC
                return ("TRIANGULO OBTUSANGULO\n");


            if (ladoA * ladoA == ((ladoB * ladoB) + (ladoC * ladoC)))
                // se ladoA = temB + ladoC
                return ("TRIANGULO RETANGULO\n");


            if (ladoA * ladoA < ((ladoB * ladoB) + (ladoC * ladoC)))
                //se ladoA < temB + ladoC
                return ("TRIANGULO ACUTANGULO\n");


            if ((ladoA == ladoB) && (ladoA == ladoC))
                // se os três lados forem iguais, TRIANGULO EQUILATERO
                return ("TRIANGULO EQUILATERO\n");


            if (((ladoA == ladoB) && (ladoA != ladoC))
                    || ((ladoA == ladoC) && (ladoA != ladoB))
                    || ((ladoB == ladoC) && (ladoB != ladoA)))
                return ("TRIANGULO ISOSCELES\n");

        }

        return ("NAO FORMA TRIANGULO\n");
    }
}
