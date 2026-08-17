package exercicios.poo.ex20heranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas professores serão registrados? ");
        int n = sc.nextInt();
        sc.nextLine();
        Professor[] professores = new Professor[n];
        for (int i = 0; i < professores.length; i++) {
            System.out.println("Digite o nome do professor " + (i + 1)+ ": ");
            String nome = sc.nextLine();
            System.out.println("Digite o sexo do professor " + (i + 1)+ ": ");
            String sexo = sc.nextLine();
            System.out.println("Digite o departamento do professor " + (i + 1)+ ": ");
            String departamento = sc.nextLine();
            System.out.println("Digite a idade do professor " + (i + 1)+ ": ");
            int idade = sc.nextInt();
            System.out.println("Digite o salário  do professor " + (i + 1)+ ": ");
            double salario = sc.nextDouble();
            sc.nextLine();

            Professor professor = new Professor(nome, idade, sexo);
            professor.setDepartamento(departamento);
            professor.setSalario(salario);

            professores[i] = professor;

        }

        System.out.println("=== Professres Registrados ===");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() +
                    "\nIdade: " + professor.getIdade() +
                    "\nSexo: " + professor.getSexo() +
                    "\nDepartamento: " + professor.getDepartamento() +
                    "\nSalario: " + professor.getSalario() +
                    "\n==============");
        }

    }
}
