package URI.LE1_Instruções_Simples.Ex1006_Media;
//Klesio Antonio do Nascimento
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1006_Media {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        IntefaceTexto media = new IntefaceTexto();
        media.executar() ;
    }
}

class IntefaceTexto {
    private Scanner entrada;
    private Media valor;

    public IntefaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Media();
    }

    public void executar() {
        valor.setValor1(entrada.nextDouble());
        valor.setValor2(entrada.nextDouble());
        valor.setValor3(entrada.nextDouble());

        System.out.printf("MEDIA = %.1f\n", valor.getNota());

    }

}

class Media {
    private double valor1, valor2, valor3, media;

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getNota() {
        media = (((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5));
        return media;
    }

}