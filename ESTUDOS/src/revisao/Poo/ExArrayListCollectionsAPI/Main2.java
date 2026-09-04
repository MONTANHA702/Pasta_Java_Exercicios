package revisao.Poo.ExArrayListCollectionsAPI;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jao";
        aluno1.idade = 9;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Titia";
        aluno2.idade = 8;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Samara";
        aluno3.idade = 10;

        Turma turmaA = new Turma();
        turmaA.identificador = "Turma A";
        turmaA.professor = "Tia Andressa";

        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);

        turmaA.imprimirListaAlunos();
        System.out.println("===========");
        turmaA.removerAluno(2);
        turmaA.imprimirListaAlunos();
    }
}
