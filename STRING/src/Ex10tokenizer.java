import java.util.StringTokenizer;

public class Ex10tokenizer {
    public static void main(String[] args) {

        //string tokenizer serve para extrair informações de uma super string
        //sem usar arrays. Ela extrai tokens.

        String arquivo = "1;Antonio;30;";

        StringTokenizer tokenizer = new StringTokenizer(arquivo, ";");
        while (tokenizer.hasMoreTokens()) {//enquanto o tokenizer tiver mais tokens (que nao o ;)
            System.out.println(tokenizer.nextToken());
        }

    }
}
