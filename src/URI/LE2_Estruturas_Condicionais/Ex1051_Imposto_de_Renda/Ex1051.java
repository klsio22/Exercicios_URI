package URI.LE2_Estruturas_Condicionais.Ex1051_Imposto_de_Renda;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final ImpostoDeRenda salario;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        salario = new ImpostoDeRenda();
    }

    public void EntradaDados() {
        salario.setSalario(entrada.nextDouble());
        if (salario.getValorDoImposto() == 0.0) {
            System.out.println("Isento");
        } else
            System.out.printf("R$ %.2f\n", salario.getValorDoImposto());
    }
}

class ImpostoDeRenda {
    private double salario = 0.0;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorDoImposto() {
        if (salario >= 0.0 && salario <= 2000.00)
            return 0.0;
        if (salario <= 3000.00)
            return (salario - 2000.00) * 0.08;
        if (salario <= 4500.00)
            return (salario - 3000.00) * 0.18 + (1000 * 0.08);
        if (salario > 4500.00)
            return (salario - 4500.00) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
        return 0.00;
    }
}