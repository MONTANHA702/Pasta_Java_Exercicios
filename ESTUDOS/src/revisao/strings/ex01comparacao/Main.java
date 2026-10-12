package revisao.strings.ex01comparacao;

public class Main {
    public static void main(String[] args) {


        String nome1 = "João";
        //String nome2 = "João";
        String nome2 = new String("João");//outro endereço


        //O == compara as referências de memória, não o conteúdo.
        System.out.println(nome1 == nome2);

        //.equals() compara os conteúdos
        System.out.println(nome1.equals(nome2));


    }
}
