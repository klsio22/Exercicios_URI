package URI.LE2_Estruturas_Condicionais.Ex2057_Fuso_Horario;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex2057 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
    }

    public void EntradaDados() {
        int saida = entrada.nextInt();
        int tempo = entrada.nextInt();
        int fusoHorario = entrada.nextInt();
        FusoHorario fuso = new FusoHorario(saida, tempo, fusoHorario);
        System.out.printf("%d\n", fuso.getDestino());
    }
}

class FusoHorario {
    private final int saida;
    private final int tempo;
    private final int fusoHorario;

    public FusoHorario(int saida, int tempo, int fusoHorario) {
        this.saida = saida;
        this.fusoHorario = fusoHorario;
        this.tempo = tempo;
    }

    public int getDestino() {
        int soma;

        soma = saida + tempo + fusoHorario;

        if (soma == 24)
            return 0;
        if (soma > 24)
            return soma - 24;
        if (soma < 0)
            return 24 + (soma);

        return soma;
    }
}