package exercicios.poo.ex05fichaaluno;


import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] materias;
    double[] notas;
    boolean cadastrado = false;


    Scanner sc = new Scanner(System.in);

    String linha = "=".repeat(20);

    void cadastrar() {
        System.out.println("==== CADASTRAR ALUNO ====");
        System.out.println("Nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Criar matricula: ");
        matricula = sc.nextLine();
        System.out.println("Inserir curso: ");
        curso = sc.nextLine();

        materias = new String[3];
        for (int i = 0; i < materias.length; i++) {
            System.out.printf("Digite a %sa. matéria: %n", i + 1);
            materias[i] = sc.nextLine();
        }
        System.out.println("Cadastro realizado com sucesso.");
        cadastrado = true;
    }

    void consultarAluno() {
        if (cadastrado) {
            System.out.println("==== CADASTRO DO ALUNO ====");
            System.out.println("Nome do aluno: " + nome);
            System.out.println("Matricula: " + matricula);
            System.out.println("Curso: " + curso);
            System.out.println("Matérias: " + Arrays.toString(materias));
            System.out.println(linha);
        } else {
            System.out.println("Nenhum aluno foi encontrado. Realize o cadastro.");
        }
    }

    void inserirNotas() {
        if (cadastrado) {
            notas = new double[3];
            System.out.println("==== INSERIR NOTAS ====");
            for (int i = 0; i < notas.length; i++) {
                System.out.printf("Digite a %da. nota: %n", i + 1);
                notas[i] = sc.nextDouble();
                sc.nextLine();
            }
            System.out.println("Notas inseridas no sistema: " + Arrays.toString(notas));
        } else {
            System.out.println("Operação nao permitida. Realize o cadastro.");
        }

    }

    void statusAluno() {

        if (cadastrado && notas != null) {
            System.out.println("==== STATUS ALUNO ====");
            System.out.println("Nome do aluno: " + nome);
            System.out.println("Matricula: " + matricula);
            System.out.println("Curso: " + curso);
            System.out.println("Matérias: " + Arrays.toString(materias));
            System.out.println("Notas inseridas no sitema: " + Arrays.toString(notas));
            System.out.println(linha);

            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= 7) {
                    System.out.printf("Materia %s, nota <%.2f> : APROVADO %n", materias[i], notas[i]);
                } else {
                    System.out.printf("Materia %s, nota <%.2f> : REPROVADO %n", materias[i], notas[i]);
                }
            }
        } else if (cadastrado) {
            System.out.println("Notas ainda não inseridas.");
        }
    }
}
