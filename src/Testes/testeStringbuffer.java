package Testes;

public class testeStringbuffer {
    public static void main(String[] args) {
        String[] letras = {"B", "C", "D", "E", "F", "G"};

        String alfabeto = "";


      /*  for (String letra : letras) {
            alfabeto += letra;
        }

        System.out.println(alfabeto);*/

        StringBuffer sb = new StringBuffer();

        for (String letra : letras) {
            sb.append(letra);
        }

        alfabeto = sb.toString();
        System.out.println(alfabeto);

        alfabeto = new String(sb);
        System.out.println(alfabeto);


    }
}
