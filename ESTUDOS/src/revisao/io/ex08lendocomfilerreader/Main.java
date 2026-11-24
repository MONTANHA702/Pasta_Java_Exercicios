package revisao.io.ex08lendocomfilerreader;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {

        File docs = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex08lendocomfilerreader/docs");
        //System.out.println(docs.mkdir());

        File contrato = new File(docs, "contrato.txt");
        StringBuilder texto = new StringBuilder();
        //System.out.println(contrato.createNewFile());

        try (Reader leitor = new FileReader(contrato)) {
            char[] conteudo = new char[100];
            int quantidadeCaracteres;

            while ((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                texto.append(conteudo, 0, quantidadeCaracteres);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto);
    }
}
