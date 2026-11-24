package revisao.io.ex10lendocombufferedreader;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File base = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex10lendocombufferedreader/docs");
        //base.mkdir();

        File arquivoOrigem = new File(base, "lista.txt");
        //arquivoOrigem.createNewFile();

        //BufferedReader empacota o que o FileReader lê
        //Por padrão o BufferReader faz blocos de 8 em 8 kb
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem))) {
            String linha = null;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

                    leitor.readLine();
        } catch (IOException e) {
            throw new IOException("Erro de I/O", e);
        }


    }
}
