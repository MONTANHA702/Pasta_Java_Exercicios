package revisao.Poo.Ex15EstudoArrays.ArraysDeObjetos;

public class MainComArrayAlunos {
    public static void main(String[] args) {

        TurmaComArrayDeAluno turmaB = new TurmaComArrayDeAluno();
        turmaB.identificador = "Turma B";
        turmaB.professor = "Professora Lulu";
        turmaB.alunos = new Aluno[4]; //instancio um vetor com 4 vetores

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

    }
}
