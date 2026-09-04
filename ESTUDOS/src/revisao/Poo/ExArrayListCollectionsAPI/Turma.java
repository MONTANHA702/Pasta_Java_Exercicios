package revisao.Poo.ExArrayListCollectionsAPI;

import java.util.ArrayList;

public class Turma {

    String identificador;
    String professor;
    //Aluno[] alunos = new Aluno[0];
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    void removerAluno(int indice) {
        alunos.remove(indice);

    }
    void imprimirListaAlunos(){
        for (Aluno aluno : alunos) {
            System.out.printf("%S (%d anos)%n", aluno.nome, aluno.idade);
        }
    }
}
