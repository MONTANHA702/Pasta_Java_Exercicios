package exercicios.matriz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex01Matriz2Por2 {
    public static void main(String[] args) {

        //Matriz 2x2

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[][] notasAlunos = new double[2][2];
        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.printf("Digite a %da. nota do %do. aluno %n", j+1, i+1);
                notasAlunos[i][j] = sc.nextDouble();
            }
        }
        System.out.println("=Notas dos alunos=");
        for (int i = 0; i<notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println("=Notas dos alunos=");
        //System.out.println(Arrays.deepToString(notasAlunos));

        sc.close();


    }
}
