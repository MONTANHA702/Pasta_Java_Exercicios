package exercicios.poo.ex05fichaaluno;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();
        aluno.cadastrar();
        aluno.consultarAluno();
        aluno.inserirNotas();
        aluno.statusAluno();
    }
}
