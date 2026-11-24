package revisao.io.ex04obtendoinformacoes;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws IOException {

        File pasta1 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex04obtendoinformacoes/docs");
        //System.out.printf("Pasta 1 criada: %s%n", pasta1.mkdir());

        File arquivo1 = new File(pasta1, "contrato.txt");
        //System.out.printf("Arquivo 1 criado: %s%n", arquivo1.createNewFile());
        System.out.printf("Nome: %s%n", arquivo1.getName());
        System.out.printf("Diretório pai: %s%n", arquivo1.getParent());

        System.out.printf("Arquivo 1 é pasta? %b%n", arquivo1.isFile());
        System.out.printf("Arquivo 1 é diretório/pasta? %b%n", arquivo1.isDirectory());

        System.out.printf("Arquivo 1 existe? %b%n", arquivo1.exists());
        System.out.printf("Arquivo 1 está oculto? %b%n", arquivo1.isHidden());
        System.out.printf("Ultima modificação: %s%n", Instant.ofEpochMilli(arquivo1.lastModified()));
        System.out.printf("Tamanho do arquivo: %d%n", arquivo1.length());
        System.out.printf("Pode ser executado? %b%n", arquivo1.canExecute());
        System.out.printf("Pode ser lido? %b%n", arquivo1.canRead());
        System.out.printf("Pode ser escrito? %b%n", arquivo1.canWrite());

    }
}
