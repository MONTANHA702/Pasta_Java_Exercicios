package revisao.excecoes.ex06finally;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        //Path arquivo = Path.of("/Users/jadersantos/Desktop/abc/teste.txt");
        Path arquivo = Path.of("/Users/jadersantos/Desktop/teste.txt");


//        try {
//            Files.createFile(arquivo);
//            System.out.println("Arquivo gerado com sucesso");
//        } catch (IOException e) {
//            System.out.println("Erro ao gerar arquivo");
//        }

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {

            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } finally {
            try {
                reader.close();

            } catch (IOException e) {
                System.out.println("Erro na leitura do arquivo: " + e.getMessage());;
            }
        }

    }
}

