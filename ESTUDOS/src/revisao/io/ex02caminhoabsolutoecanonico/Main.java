package revisao.io.ex02caminhoabsolutoecanonico;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File arquivo1 = new File("/Users/jadersantos/IdeaProjects/Estudos01/ESTUDOS/src/revisao/io/ex02caminhoabsolutoecanonico/docs/texto.txt");
        System.out.println("Caminho absoluto tem a raiz, veja o exemplo:");
        System.out.println(arquivo1);
        System.out.println("-------");

        System.out.println("Caminho relativo toma por base a pasta do projeto :");
        File arquivo2 = new File("docs/texto.txt");
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsoluteFile());//mostra o caminho até a raiz resolvido
        System.out.println("-----");

        //.. (ponto ponto) volta um diretório
        File arquivo3 = new File("../docs/texto.txt");
        System.out.println(arquivo3);
        System.out.println(arquivo3.getAbsoluteFile());//mostra a raiz, mas não mostra o caminho resolvido
        System.out.println(arquivo3.getCanonicalFile());//mostra o caminho resolvido (tem que tratar IOException)


    }
}
