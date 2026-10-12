package revisao.strings.ex03extraindo;

public class LastIndexOf {
    public static void main(String[] args) {

        String nome = "   José Silva Souza Magalhães";

        System.out.println(retornarUltimoSobrenome(nome));

    }

    private static String retornarUltimoSobrenome(String nome) {

        int posicaoUltimoEspaco = nome.lastIndexOf(" ");
        if (posicaoUltimoEspaco == -1) {
            throw new RuntimeException("Não é um nome completo");
        }
        return nome.substring(posicaoUltimoEspaco + 1);
    }
}
