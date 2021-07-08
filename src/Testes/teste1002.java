package Testes;

import java.util.Scanner;

public class teste1002 {
    public static void main(String[] args) {

        Scanner receber = new Scanner(System.in);
        double n, raio, area;

        raio = receber.nextDouble();
        n = 3.14159;
        area = n * (raio * raio);

        System.out.printf("A = %.2f", area);
    }
}
