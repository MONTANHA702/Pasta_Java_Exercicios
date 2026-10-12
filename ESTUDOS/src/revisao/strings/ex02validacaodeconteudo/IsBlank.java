package revisao.strings.ex02validacaodeconteudo;

public class IsBlank {
    public static void main(String[] args) {

        String nome = "      ";

        System.out.println(nome.isEmpty());//false
        System.out.println(nome.length());
        System.out.println(nome.isBlank());
    }
}
