package exercicios.poo.ex11alunocommetodosemain;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;
    private boolean temDisciplinas;

    //construtor
    Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.temDisciplinas = false;
    }

    private String[] inserirDisciplina(String disciplina1, String disciplina2, String disciplina3) {
        disciplinas = new String[3];
        disciplinas[0] = disciplina1;
        disciplinas[1] = disciplina2;
        disciplinas[2] = disciplina3;
        temDisciplinas = true;
        return disciplinas;
    }

    private double[] inserirNotas(double nota1, double nota2, double nota3) {
        notas = new double[3];
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        return notas;
    }

    public double[] registrarNotas(double nota1, double nota2, double nota3) {
        if (temDisciplinas) {
            return inserirNotas(nota1, nota2, nota3);
        } else {
            return null;
        }
    }

    public String[] registrarDisciplinas(String disciplina1, String disciplina2, String disciplina3) {
        return inserirDisciplina(disciplina1, disciplina2, disciplina3);

    }


    public void statusAluno() {
        System.out.printf("==== STATUS ALUNO ====%n");
        System.out.printf("Nome do aluno: %s%n", this.nome);
        System.out.println("CURSO: " + this.curso);
        if (temDisciplinas) {
            System.out.println("DISCIPLINAS MATRICULADAS:" + Arrays.toString(this.disciplinas));
        } else {
            System.out.println("AGUARDANDO MATRÍCULAS.");
        }
        if (temDisciplinas) {
            if (notas != null) {
                for (int i = 0; i < notas.length; i++) {
                    if (notas[i] >= 7) {
                        System.out.printf("- %s < %.2f > : APROVADO.%n", disciplinas[i], notas[i]);
                    } else {
                        System.out.printf("- %s < %.2f > : REPROVADO.%n", disciplinas[i], notas[i]);
                    }
                }
            } else {
                System.out.println("Notas não lançadas.");

            }
        } else {
            System.out.println("NOTAS: Necessário fazer matrícula.");
        }
        System.out.println("===========");
    }


}
