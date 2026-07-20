package exercicios.poo.ex19curso;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Curso curso = new Curso();
        curso.setNomeCurso("Geografia");

        Professor professor = new Professor();
        professor.setNome("Antonio");
        professor.setDepartamento("Geografia");
        professor.setEmail("antonio@gmail.com");

        curso.setProfessor(professor);



        System.out.println("Quantos alunos tem o curso? ");
        int qtdAlunos = sc.nextInt();
        Aluno[] alunos = new Aluno[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            sc.nextLine();

            System.out.printf("Digite o nome do  %do. aluno: %n", i+1);
            String nome = sc.nextLine();

            System.out.println("Digite a matrícula: ");
            String matricula = sc.nextLine();

            double[] notas = new double[4];
            for(int j = 0; j < 4; j++){
                System.out.printf("Digite a %da. nota do aluno: %n", j+1);
                notas[j] = sc.nextDouble();
            }

            Aluno a = new Aluno();
            a.setNomeAluno(nome);
            a.setMatricula(matricula);
            a.setNotasAluno(notas);

            alunos[i] = a;
        }

        curso.setAlunos(alunos);


        System.out.println("Curso: " + curso.getNomeCurso());

        System.out.println(curso.getProfessor().dadosProfessor());

        for (Aluno aluno : curso.getAlunos()) {
            System.out.println(aluno.obterInfo());
        }

    }
}
