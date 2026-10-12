package revisao.strings.ex02validacaodeconteudo;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {

        String nome = "José da Silva Sousa";

        System.out.println(nome.contains("Silva"));//true
        System.out.println(nome.contains("Si"));//true
    }
}
