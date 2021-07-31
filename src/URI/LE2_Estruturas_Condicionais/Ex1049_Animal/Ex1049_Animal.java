package URI.LE2_Estruturas_Condicionais.Ex1049_Animal;
//Klésio Antônio do Nascimento
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1049_Animal {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        InterfaceTexto it = new InterfaceTexto();
        it.executar();
    }
}

class InterfaceTexto{
    private Scanner entrada;
    private Animal tipoAnimal;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        tipoAnimal = new Animal();
    }

    private void lerDados() {
        tipoAnimal.setCaracteristica1(entrada.next());
        tipoAnimal.setCaracteristica2(entrada.next());
        tipoAnimal.setCaracteristica3(entrada.next());
    }

    private void imprimirResultado() {
        System.out.printf("%s\n", tipoAnimal.getEspecie() );
    }

    public void executar() {
        lerDados();
        imprimirResultado();
    }
}

class Animal {

    private String caracteristica1, caracteristica2, caracteristica3;

    public void setCaracteristica1(String caracteristica1) {
        this.caracteristica1 = caracteristica1;
    }

    public void setCaracteristica2(String caracteristica2) {
        this.caracteristica2 = caracteristica2;
    }

    public void setCaracteristica3(String caracteristica3) {
        this.caracteristica3 = caracteristica3;
    }

    public String getEspecie() {

        if (caracteristica1.equals("vertebrado") &&
                caracteristica2.equals("ave") &&
                caracteristica3.equals("carnivoro")) {
            return ("aguia");
        }

        if (caracteristica1.equals("vertebrado") &&
                caracteristica2.equals("ave") &&
                caracteristica3.equals("onivoro")) {
            return ("pomba");
        }

        if (caracteristica1.equals("vertebrado") &&
                caracteristica2.equals("mamifero") &&
                caracteristica3.equals("onivoro")) {
            return ("homem");
        }

        if (caracteristica1.equals("vertebrado") &&
                caracteristica2.equals("mamifero") &&
                caracteristica3.equals("herbivoro")) {
            return ("vaca");
        }

        //------------------------------------------------------------------------------

        if (caracteristica1.equals("invertebrado") &&
                caracteristica2.equals("inseto") &&
                caracteristica3.equals("hematofago")) {
            return ("pulga");
        }

        if (caracteristica1.equals("invertebrado") &&
                caracteristica2.equals("inseto") &&
                caracteristica3.equals("herbivoro")) {
            return ("lagarta");
        }

        if (caracteristica1.equals("invertebrado") &&
                caracteristica2.equals("anelideo") &&
                caracteristica3.equals("hematofago")) {
            return ("sanguessuga");
        }

        if (caracteristica1.equals("invertebrado") &&
                caracteristica2.equals("anelideo") &&
                caracteristica3.equals("onivoro")) {
            return ("minhoca");
        }

        return "";
    }

}