package revisao.io.ex11escrevendocombufferwriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File base = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex11escrevendocombufferwriter/docs");
        base.mkdir();

        File arquivoOrigem = new File(base, "lista.txt");
        //arquivoOrigem.createNewFile();

        File arquivoDestino = new File(base, "saida.txt");

        try (Reader leitor = new FileReader(arquivoOrigem);
             Writer escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {
            int conteudo;
            while ((conteudo = leitor.read()) != -1) {
                escritor.write(conteudo);//dessa vez só escreve quando o buffer estiver cheio
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

    }
}
