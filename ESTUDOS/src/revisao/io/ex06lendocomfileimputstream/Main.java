package revisao.io.ex06lendocomfileimputstream;

import java.io.*;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws IOException {

        File docs = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex06lendocomfileimputstream/docs");
        System.out.println(docs.mkdir());

        File contrato = new File(docs, "contrato.txt");
        System.out.println(contrato.createNewFile());

        //ler o arquivo -> InputStream.
        //a sintaxe abaixo já fecha o arquivo automaticamente
        //economizando mais um bloco (finally) com .close()

        try (InputStream inputStream = new FileInputStream(contrato)) {
            int conteudo;
            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }
        } catch (FileNotFoundException e) {
            throw new RemoteException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RemoteException("Erro de I/O", e);
        }



    }
}
