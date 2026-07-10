package exercicios.vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex11ForEach {
    public static void main(String[] args) {
        //Lista de notas

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma? ");
        int numAlunos = sc.nextInt();

        double[] notas = new double[numAlunos];
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do %do. aluno: %n", i + 1);
            notas[i] = sc.nextDouble();
        }
        System.out.println("LISTA DE NOTAS: "+ Arrays.toString(notas));

        int aprovados = 0;
        int reprovados = 0;
        double soma = 0;
        for (double nota : notas){
            soma+= nota;
            if (nota >= 6.0){
               aprovados++;
            } else {
                reprovados++;
            }
        }
        double media = (numAlunos != 0) ? soma/numAlunos:0;
        /*if(numAlunos != 0){
            media = soma/numAlunos;
        } else {
            media = 0;
        }*/


        System.out.printf("A soma de todas as notas vale: %.2f.%n", soma);
        System.out.printf("A média da turma vale: <%.2f>%n", media );
        System.out.printf("TOTAL DE ALUNOS DA TURMA %d%n", numAlunos);
        System.out.printf("TOTAL DE APROVADOS NA TURMA %d%n", aprovados);
        System.out.printf("TOTAL DE REPROVADOS NA TURMA %d%n", reprovados);

        sc.close();
    }
}
