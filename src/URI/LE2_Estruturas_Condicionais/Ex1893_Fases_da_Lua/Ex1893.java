package URI.LE2_Estruturas_Condicionais.Ex1893_Fases_da_Lua;

//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex1893 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final FasesDaLua fase;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fase = new FasesDaLua();
    }

    public void EntradaDados() {
        fase.setDoisDiasAtras(entrada.nextInt());
        fase.setNoitePassada(entrada.nextInt());
        System.out.println(fase.getFaseDaLua());
    }
}

class FasesDaLua {
    private int doisDiasAtras, noitePassada;

    public void setDoisDiasAtras(int doisDiasAtras) {
        this.doisDiasAtras = doisDiasAtras;
    }

    public void setNoitePassada(int noitePassada) {
        this.noitePassada = noitePassada;
    }

    public String getFaseDaLua() {

        if (noitePassada >= 0 && noitePassada <= 2)
            return "nova";

        if (noitePassada >= 3 && noitePassada <= 96
                && doisDiasAtras <= noitePassada)
            return "crescente";

        if (noitePassada >= 97 && noitePassada <= 100)
            return "cheia";

        if (noitePassada >= 3 && noitePassada <= 96)
            return "minguante";

        return "";
    }
}