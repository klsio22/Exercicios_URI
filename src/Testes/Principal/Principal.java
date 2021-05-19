package Testes.Principal;
import java.util.ArrayList;
abstract class Conta {
    private double saldo;

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public double sacar(double saldo) {
        this.saldo -= saldo;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void processar();

    public String toString() {
        return "Saldo: " + saldo;
    }
}


 class ContaCorrente extends Conta {

    public void processar() {
        sacar(15);
    }

    public String toString() {
        return "CC -> Saldo: " + getSaldo();
    }
}


 class ContaPoupanca extends Conta {

    public void processar() {
        depositar(getSaldo()*0.01);
    }

    public String toString() {
        return "CP -> Saldo: " + getSaldo();
    }
}



class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void registra(Conta conta) {
        contas.add(conta);
    }

    public void processarContas() {
        for(Conta conta : contas) {
            conta.processar();
        }
    }

    public void exibe() {
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }
}


public class Principal {
    private Principal() {}

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);
        cp.depositar(100);

        Banco banco = new Banco();
        banco.registra(cc);
        banco.registra(cp);

        banco.processarContas();

        banco.exibe();
    }
}