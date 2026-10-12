package revisao.strings;

public class ImplementandoAlgoritmos {
    public static void main(String[] args) {

        String nome = "   Pedro da Silva Costa de Oliveira    ";

        System.out.println(nomeFormatado(nome, "de", "da"));


    }

    public static String nomeFormatado(String nome, String... preposicoesParaExclusao){

        String nomeFormatado = nome.strip();
        for(String preposicao : preposicoesParaExclusao){
            nomeFormatado = nomeFormatado.replace(" "+preposicao+" ", " ");
        }
        return nomeFormatado.toUpperCase();

    }
}
