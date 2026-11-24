package revisao.io.ex01criandocomfile;

import java.io.File;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {

        File pasta1 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex01criandocomfile/docs");
    //vou usar um booleano para verificar a criação da pasta
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());


        //para criar a estrutura com pasta e subpasta .mkdirs()
        File pasta2 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex01criandocomfile/fotos/viagens");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        //o fato de instanciar a pasta/arquivo não o cria.
        //a instanciação só indica o caminho, para criar usa-se o .mkdir()/.mkdirs()
        File arquivo1 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex01criandocomfile",
                "docs/contrato.txt");

        //outra forma de instanciar
        File arquivo2 = new File(pasta1, "contrato.txt");

        //agora vamos criar o arquivo2
        //o .createNewFile() deve ser tratado (IOException)
        System.out.printf("Arquivo 2 criado: %b%n", arquivo2.createNewFile());


    }
}
