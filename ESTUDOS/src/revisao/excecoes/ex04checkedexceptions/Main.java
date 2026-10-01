package revisao.excecoes.ex04checkedexceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        //Path arquivo = Path.of("/Users/jadersantos/Desktop/abc/teste.txt");
        Path arquivo = Path.of("/Users/jadersantos/Desktop/teste.txt");


        try {
            Files.createFile(arquivo);
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo" + e.getMessage());
            //e.printStackTrace();
        }
    }
}
