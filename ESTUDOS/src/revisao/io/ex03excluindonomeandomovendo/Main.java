package revisao.io.ex03excluindonomeandomovendo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        File pasta1 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex03excluindonomeandomovendo/docs");
//        System.out.printf("Arquivo <docs> criado: %b%n", pasta1.mkdir());
//        File arquivo1 = new File(pasta1, "contrato.txt");
//        System.out.println(arquivo1.createNewFile());

        //renomear
        File base = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex03excluindonomeandomovendo");
        File pasta1 = new File(base,"docs");
        File pasta2 = new File(base,"documentos");
        System.out.println(pasta1.renameTo(pasta2));

        //excluir
        //.delete() só exclui diretorios vazios
        //entao temos que deletar os arquivos de dentro
        File arquivo1 = new File(pasta2, "contrato.txt");
        System.out.println(arquivo1.delete());
        System.out.println(pasta2.delete());



    }
}
