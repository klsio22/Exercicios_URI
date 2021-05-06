package URI.LE3_Estruturas_de_Repeticao.Ex1131_Greanais;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class GenaisEx1131 {

    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final PartidasFutebol partidasFutebol;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        partidasFutebol = new PartidasFutebol();
    }

    public void entradaDados() {
        int partida = 1;
        do {
            if (partida == 1) {
                partidasFutebol.setPartidas(entrada.nextInt(), entrada.nextInt());
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            partida = entrada.nextInt();
        } while (partida != 2);

        System.out.printf("%d grenais\n", partidasFutebol.getTotal());
        System.out.printf("Inter:%d\n", partidasFutebol.getVitoriasInter());
        System.out.printf("Gremio:%d\n", partidasFutebol.getVitoriasGremios());
        System.out.printf("Empates:%d\n", partidasFutebol.getEmpates());

        if (partidasFutebol.getVitoriasInter() > partidasFutebol.getVitoriasGremios())
            System.out.println("Inter venceu mais");
        else if (partidasFutebol.getVitoriasInter() < partidasFutebol.getVitoriasGremios())
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");

    }
}

class PartidasFutebol {
    private int vitoriasInter, vitoriasGremios, total, empates;

    public void setPartidas(int inter, int gremio) {
        total++;
        if (inter > gremio)
            vitoriasInter++;
        if (gremio > inter)
            vitoriasGremios++;
        if (gremio == inter)
            empates++;
    }

    public int getEmpates() {
        return empates;
    }

    public int getVitoriasInter() {
        return vitoriasInter;
    }

    public int getVitoriasGremios() {
        return vitoriasGremios;
    }

    public int getTotal() {
        return total;
    }
}
