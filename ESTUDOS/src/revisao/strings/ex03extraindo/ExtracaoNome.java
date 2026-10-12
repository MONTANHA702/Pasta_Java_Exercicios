package revisao.strings.ex03extraindo;

public class ExtracaoNome {
    public static void main(String[] args) {

        String nome = "    José da Silva";
        System.out.println(nome.length());
        String nome1 = nome.trim();
        System.out.println(nome1.length());

        //System.out.println(nome.trim());
        //retirar o sobrenome
        //System.out.println(nome.indexOf(" "));//retorna o index do primeiro espaço <4>

        //System.out.println(nome.substring(5));
        //System.out.println(nome.substring(5, 7));//retorna um trecho

        System.out.println(obterSobrenome(nome));


    }

    private static String obterSobrenome(String nome) {
        String nomeSemEspacosIniciais = nome.trim();
        int posicaoPrimeiroEspaco = nomeSemEspacosIniciais.indexOf(" ");//retorna -1 caso nao encontre
        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo.");
        }
        return nomeSemEspacosIniciais.substring(posicaoPrimeiroEspaco + 1);
    }
}
