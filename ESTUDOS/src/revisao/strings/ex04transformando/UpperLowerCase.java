package revisao.strings.ex04transformando;

public class UpperLowerCase {
    public static void main(String[] args) {

        String nome = "Pedro";

        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeMaiusculo);

        System.out.println(nome);//A String original é imutável

        System.out.println(nome.toLowerCase());
    }
}
