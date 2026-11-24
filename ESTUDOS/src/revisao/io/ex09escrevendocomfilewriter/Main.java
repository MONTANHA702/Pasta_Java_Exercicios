package revisao.io.ex09escrevendocomfilewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Main {
    public static void main(String[] args) {

        File docs = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex09escrevendocomfilewriter/docs");
        //System.out.println(docs.mkdir());


        //vamos escrever um arquivo
        String[] nomes = {"João", "Maria", "Sebastião", "José"};
        File arquivoDestino = new File(docs, "lista.txt");

        try (Writer escritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                escritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}



