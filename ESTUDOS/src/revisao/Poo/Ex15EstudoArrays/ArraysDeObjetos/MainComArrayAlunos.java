package revisao.Poo.Ex15EstudoArrays.ArraysDeObjetos;

import java.util.Arrays;

public class MainComArrayAlunos {
    public static void main(String[] args) {

        TurmaComArrayDeAluno turmaB = new TurmaComArrayDeAluno();
        turmaB.identificador = "Turma B";
        turmaB.professor = "Professora Lulu";
        turmaB.alunos = new Aluno[5]; //instancio um vetor com 4 vetores

        turmaB.alunos[0] = new Aluno();//instancio o vetor 0
        turmaB.alunos[0].nome = "Jaja";
        turmaB.alunos[0].idade = 10;

        turmaB.alunos[1] = new Aluno();//instancio o vetor 1
        turmaB.alunos[1].nome = "Jiji";
        turmaB.alunos[1].idade = 9;


        //outra forma
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Jó";
        aluno3.idade = 11;
        turmaB.alunos[2] = aluno3;

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Juju";
        aluno4.idade = 12;
        turmaB.alunos[3] = aluno4;

        //retorna exceção caso algum vetor seja null - usar if-else
        for (int i = 0; i < turmaB.alunos.length; i++) {

            Aluno aluno = turmaB.alunos[i];

            if (aluno != null) {
                System.out.printf("%d - %S (%d anos)%n", (i + 1), aluno.nome, aluno.idade);
            } else {
                System.out.printf("%d - vago%n", (i + 1));
            }

        }

        //trazendo do metodo
        //turmaB.imprimirListaAlunos();
    }
}

