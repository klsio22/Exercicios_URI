package URI.LE2_Estruturas_Condicionais.Ex1047_Tempo_de_Jogo_com_Minutos;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Scanner;

public class Ex1047_Tempo_de_Jogo {
    public static void main(String[] args) throws IOException {
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private TempoJogo duracao;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        duracao = new TempoJogo();
    }

    public void executar() {
        lerDados();
        imprimirResultado();
    }

    private void lerDados() {
        duracao.setHoraInicial(entrada.nextInt());
        duracao.setMinutoInicial(entrada.nextInt());
        duracao.setHoraFinal(entrada.nextInt());
        duracao.setMinutoFinal(entrada.nextInt());
    }

    private void imprimirResultado() {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",
                    duracao.getRestoHora(), duracao.getRestoMinutos());

    }

}

class TempoJogo {
    private int horaInicial, minutoInicial, horaFinal, minutoFinal;
    private int restoHora, restoMinutos;

    public void setHoraInicial(int horaInicial) {
        this.horaInicial = horaInicial;
    }

    public void setMinutoInicial(int minutoInicial) {
        this.minutoInicial = minutoInicial;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setMinutoFinal(int minutoFinal) {
        this.minutoFinal = minutoFinal;
        tempoDuracao();
    }

    public int getRestoHora() {
        return restoHora;
    }

    public int getRestoMinutos() {
        return restoMinutos;
    }

    private void tempoDuracao() {
        restoHora = horaFinal - horaInicial;
        restoMinutos = minutoFinal - minutoInicial;

        if (restoHora < 0) {
            restoHora += 24;
        }

        if (restoMinutos < 0) {
            restoMinutos += 60;

            restoHora--;
            if (restoHora < 0) {
                restoHora += 24;
            }
        }

        if (restoHora == 0 && restoMinutos == 0) {
            restoHora = 24;
            restoMinutos = 0;
        }
    }

}