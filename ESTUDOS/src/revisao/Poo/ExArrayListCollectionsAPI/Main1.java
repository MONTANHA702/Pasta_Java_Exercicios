package revisao.Poo.ExArrayListCollectionsAPI;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        //ArrayList funciona como um wrapper de arrays
        //permite fazer operacoes mais rapidas sem processos manuais
        //como instanciar tamanho, remover, inserir
        //ARRAYLIST NAO SUPORTA TIPOS PRIMITIVOS

        //jeito antigo
//        String[] alunos = new String[2];
//        alunos[0] = "João";
//        alunos[1] = "Maria";

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

//        for (int i = 0; i < alunos.length; i++) {
//            String aluno = alunos[i];
//            System.out.println(aluno);
//        }

        for (int i = 0; i < alunos.size(); i++) { //lenght por size
            String aluno = alunos.get(i); //insere o get()
            System.out.println(aluno);

        }

        //for reduzido permanece o mesmo
        for(String aluno : alunos) {
            System.out.println(aluno);
        }




    }
}
