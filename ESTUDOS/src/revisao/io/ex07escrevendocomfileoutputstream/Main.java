package revisao.io.ex07escrevendocomfileoutputstream;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;

public class Main {
    public static void main(String[] args) throws IOException {

        File docs = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex07escrevendocomfileoutputstream/docs");
        //System.out.println(docs.mkdir());

        File arquivo = new File(docs, "foto1.jpg");
        //System.out.println(arquivo.createNewFile());

        //ler (entrada - inputStream)
        //escrever (saída - outputStream

        File arquivoDestino = new File(docs, "foto2.jpg");
        try (InputStream inputStream = new FileInputStream(arquivo);
             OutputStream outputStream = new FileOutputStream(arquivoDestino)
        ) {
            int conteudo;//lê bite a bite, pode demorar muito

            while ((conteudo = inputStream.read()) != -1) {
                //System.out.println(conteudo); //ler
                outputStream.write(conteudo); //escrever byte a byte
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo", e);
        }

        //forma mais otimizada lendo blocos de bytes

        File arquivoOtimizado = new File(docs, "foto3.jpg");
        try (InputStream inputStream = new FileInputStream(arquivo);
             OutputStream outputStream = new FileOutputStream(arquivoOtimizado)
        ) {
            byte[] buffer = new byte[1024];//Lê blocos (buffers) de bytes
            int quantidadeDeBytes;

            while ((quantidadeDeBytes = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, quantidadeDeBytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo", e);
        }
    }
}
