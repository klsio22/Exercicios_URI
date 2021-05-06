package Testes;
/*

        4! = n*(n-1)

        f(4) = (1/1)+(1/2!)+(1/3!)*(1/4!)

        f(4) = (1/1)+(1/2!)+(1/3*2!)*(1/4*3*2!)

        (1/2)>= (4*3*1)/(4*3*2)
		(1/3!) = (1/3*2!) => (4*1)/(4*3*2)


        f(4) = (1/1)+(1/2)+(1/3*2!)*(1/4*3*2!)




        f(4) = (1/1)+(4*3*1)/(4*3*2)+(4*1)/(4*3*2) + 1/(4*3*2)---

        f(4) = (4*3*2*1)/((4*3*2*1)) + (4*3*1)/(4*3*2) + (4*2*1)/(4*3*2) + 1/(4*3*2)

        f(4) = (4*3*2)/((4*3*2)) + (4*3)/(4*3*2) + (4)/(4*3*2) + 1/(4*3*2)

        f(4) = ((4*3*2)+ (4*3) + (4) + 1)/(4*3*2)

        f(4) = 41/24

          NumeroInteiro obj = new NumeroInteiro();

        obj.setN(4);
        obj.formula();

        System.out.println("1/"+obj.formula());

        */

import java.io.IOException;
import java.util.Scanner;

public class TesteAA3 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n = 1;
        int fator = 1;
        double formula = 0.0;
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            fator *= i;
            if (i > 2)
                formula *= (-1);
            formula += (1.0 / fator);
            System.out.printf("f(%d) = %f\n", i, formula);
        }

    }
}

