package revisao.io.ex05listandoarquivosediretorios;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File pasta1 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex05listandoarquivosediretorios/docs");
        System.out.printf("Arquivo 1 criado: %s%n", pasta1.mkdir());

        File subpasta1 = new File(pasta1, "cancelados");
        System.out.printf("Subpasta 1 criada -  %b%n", subpasta1.mkdir());

        File contrato123 = new File(pasta1, "contrato123.txt");
        System.out.println("Contrato123 - " + contrato123.createNewFile());

        File contrato456 = new File(pasta1, "contrato456.txt");
        System.out.println("Contrato456 - " + contrato456.createNewFile());

        File instrucoes = new File(pasta1, "instrucoes.md");
        System.out.println("Instrucoes - " + instrucoes.createNewFile());

        File proposta = new File(pasta1, "proposta.txt");
        System.out.println("Proposta - " + proposta.createNewFile());

        File termos = new File(pasta1, "termos.md");
        System.out.println("Termos - " + termos.createNewFile());

        //ver todos
        System.out.println("-----");
        File[] arquivos = pasta1.listFiles();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
            }
        }

        //ver somente os arquivos
        System.out.println("-----");
        File[] arquivos2 = pasta1.listFiles(File::isFile);
        if (arquivos2 != null) {
            for (File arquivo : arquivos2) {
                System.out.println(arquivo.getName());
            }
        }

        //somente pastas
        System.out.println("-----");
        File[] arquivos3 = pasta1.listFiles(File::isDirectory);
        if (arquivos3 != null) {
            for (File arquivo : arquivos3) {
                System.out.println(arquivo.getName());
            }
        }

        //por nome
        System.out.println("-----");
        File[] arquivos4 = pasta1.listFiles((dir,nome) -> nome.endsWith(".txt"));
        if (arquivos4 != null) {
            for (File arquivo : arquivos4) {
                System.out.println(arquivo.getName());
            }
        }


    }
}
