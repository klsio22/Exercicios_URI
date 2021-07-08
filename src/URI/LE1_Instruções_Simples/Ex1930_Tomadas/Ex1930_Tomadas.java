package URI.LE1_Instruções_Simples.Ex1930_Tomadas;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class Ex1930_Tomadas {
    public static void main(String[] args) throws IOException {
        InterfaceTexto regua = new InterfaceTexto();
        regua.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private FiltroDeLinha tomada;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        tomada = new FiltroDeLinha();
    }

    private void entradaDados() {
        tomada.setFiltro1(entrada.nextInt());
        tomada.setFiltro2(entrada.nextInt());
        tomada.setFiltro3(entrada.nextInt());
        tomada.setFiltro4(entrada.nextInt());
    }

    private void saidaDados() {
        System.out.println(tomada.getTomada());
    }

    public void executar() {
        entradaDados();
        saidaDados();
    }

}

class FiltroDeLinha {
    private int filtro1, filtro2, filtro3, filtro4;

    public void setFiltro1(int filtro1) {
        this.filtro1 = filtro1 - 1;
    }

    public void setFiltro2(int filtro2) {
        this.filtro2 = filtro2 - 1;
    }

    public void setFiltro3(int filtro3) {
        this.filtro3 = filtro3 - 1;
    }

    public void setFiltro4(int filtro4) {
        this.filtro4 = filtro4;
    }

    public int getTomada() {
        return filtro1 + filtro2 + filtro3 + filtro4;
    }

}
