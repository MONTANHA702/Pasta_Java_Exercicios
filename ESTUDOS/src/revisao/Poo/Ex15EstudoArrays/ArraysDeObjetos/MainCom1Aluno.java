package revisao.Poo.Ex15EstudoArrays.ArraysDeObjetos;

public class MainCom1Aluno {
    public static void main(String[] args) {


//        Aluno aluno1 = new Aluno();
//        aluno1.nome = "Jajá";
//        aluno1.idade =4;

        TurmaCom1Aluno turmaA = new TurmaCom1Aluno();
        turmaA.identificador = "Turma A";
        turmaA.professor = "Tia Lalá";

        turmaA.aluno = new Aluno(); //instanciar ou receber aluno1 (bloco comentado)
        turmaA.aluno.nome = "Jaja";
        turmaA.aluno.idade = 14;


        System.out.println("Turma: " + turmaA.identificador);
        System.out.println("Professora: " + turmaA.professor);
        System.out.println("Aluno: " + turmaA.aluno.nome + " Idade: "+ turmaA.aluno.idade);
    }
}
