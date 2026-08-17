package exercicios.poo.ex11alunocommetodosemain;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Jader", "12344-X", "Matemática");
        //aluno1.statusAluno();
        aluno1.registrarDisciplinas("Geometria", "Aritmética", "Álgebra");
        aluno1.statusAluno();
        aluno1.registrarNotas(0,0,0);
        aluno1.statusAluno();

    }
}
