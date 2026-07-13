package exercicios.poo.ex06metodossimplesreturn;

public class Main {
    public static void main(String[] args) {

        MetodosGerais metodosGerais = new MetodosGerais();

        int doze = metodosGerais.retornaDoze();
        System.out.println("Doze = " + doze);

        System.out.println("Ano atual: "+ metodosGerais.anoAtual());

        int numeroSorte = metodosGerais.numeroSorte();
        System.out.println(numeroSorte);

        System.out.println(metodosGerais.sexo());
    }
}
