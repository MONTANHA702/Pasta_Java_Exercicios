package revisao.Poo.Ex15EstudoArrays.ArraysDeObjetos;

public class TurmaComArrayDeAluno {

    String identificador;
    String professor;
    Aluno[] alunos;

    void imprimirListaAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%S (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("VAGO");
            }
        }
    }
}
