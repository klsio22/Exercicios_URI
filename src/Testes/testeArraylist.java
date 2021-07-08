package Testes;

import java.util.ArrayList;

public class testeArraylist {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);


        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

    }
}
