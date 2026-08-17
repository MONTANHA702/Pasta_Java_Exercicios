package exercicios.poo.ex19curso;

import java.util.Arrays;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] notasAluno;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(double[] notasAluno) {
       this.notasAluno = notasAluno;
    }

    public String obterInfo(){
        StringBuilder info = new StringBuilder();

        info.append("Nome Aluno = ").append(nomeAluno).append("; ");
        info.append("Matricula = ").append(matricula).append("; ");
        info.append("Notas: ");

        double soma = 0;
        for (double nota : notasAluno){
            soma += nota;
            info.append(nota).append(" ");
        }
        double media = soma / notasAluno.length;
        info.append("\n").append("Média = ").append(media).append(" - ");

        if (media >= 7){
            info.append("Aprovado!");
        } else {
            info.append("Reprovado!");
        }

        return info.toString();
    }


}
