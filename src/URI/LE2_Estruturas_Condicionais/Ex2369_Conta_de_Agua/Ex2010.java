package URI.LE2_Estruturas_Condicionais.Ex2369_Conta_de_Agua;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class Ex2010 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final ContaDeAgua conta;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        conta = new ContaDeAgua();
    }

    public void EntradaDados() {
        conta.setConsumo(entrada.nextInt());
        System.out.println(conta.getValorAPagar());
    }
}

class ContaDeAgua {
    private int consumo;

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getValorAPagar() {
        if (consumo <= 10)
            return 7;
        if (consumo <= 30)
            return 7 + (consumo - 10);
        if (consumo <= 100)
            return 7 + 20 + (2 * (consumo - 30));

        return 7 + 20 + 140 + (5 * (consumo - 100));
    }
}
