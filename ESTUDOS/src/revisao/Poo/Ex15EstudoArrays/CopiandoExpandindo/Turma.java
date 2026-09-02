package revisao.Poo.Ex15EstudoArrays.CopiandoExpandindo;

import java.util.Arrays;

public class Turma {

    String identificador;
    String professor;
    //para que se possa expandir o array, já instancio com tamanho 0
    Aluno[] alunos = new Aluno[0];

    void inserirAluno(Aluno aluno) {
        //faço uma cópia do array alunos com uma posicao a mais
        // atribuo a nova posicao ao objeto aluno
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length - 1] = aluno;
    }

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
