package URI.LE2_Estruturas_Condicionais.Ex1041_Plano_cartesiano;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1041_Plano_cartesiano {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Cartesiano intersecção;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        intersecção = new Cartesiano();
    }

    public void executar() {
        lerDados();
        imprimirResultado();
    }

    private void lerDados() {
        intersecção.setEixoX(entrada.nextDouble());
        intersecção.setEixoY(entrada.nextDouble());
    }

    private void imprimirResultado() {
        System.out.printf("%s\n", intersecção.getPonto());
    }
}

class Cartesiano {
    private double eixoX;
    private double eixoY;

    public void setEixoX(double eixoX) {
        this.eixoX = eixoX;
    }

    public void setEixoY(double eixoY) {
        this.eixoY = eixoY;
    }

    public  String getPonto(){
        if (eixoX == 0 && eixoY == 0 )
            return "Origem";

        if (eixoY == 0)
            return "Eixo X";

        if (eixoX == 0)
            return "Eixo Y";

        if (eixoX > 0 && eixoY > 0 )
            return "Q1";

        if (eixoX < 0 && eixoY > 0 )
            return  "Q2";

        if (eixoX < 0 && eixoY < 0)
            return  "Q3";

        if (eixoX > 0 && eixoY < 0 )
            return "Q4";

        return "";
    }

}