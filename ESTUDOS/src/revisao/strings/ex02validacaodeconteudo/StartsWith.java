package revisao.strings.ex02validacaodeconteudo;

public class StartsWith {
    public static void main(String[] args) {

        String nome = "João";

        System.out.println(nome.startsWith("o"));//false
        System.out.println(nome.startsWith("Jo"));//true
    }
}
