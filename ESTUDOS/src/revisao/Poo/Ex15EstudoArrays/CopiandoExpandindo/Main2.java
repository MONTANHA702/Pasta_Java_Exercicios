package revisao.Poo.Ex15EstudoArrays.CopiandoExpandindo;

public class Main2 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Aisha";
        aluno1.idade = 8;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Manoel";
        aluno2.idade = 8;

        Turma turmaC = new Turma();
        turmaC.identificador = "Turma C";
        turmaC.professor = "Tia Andressa";

        turmaC.inserirAluno(aluno1);
        turmaC.inserirAluno(aluno2);

        turmaC.imprimirListaAlunos();


    }
}
