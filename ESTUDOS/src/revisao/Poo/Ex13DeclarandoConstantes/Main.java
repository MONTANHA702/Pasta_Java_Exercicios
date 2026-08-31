package revisao.Poo.Ex13DeclarandoConstantes;

public class Main {

    public static void main(String[] args) {



        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Joao";
        novoVisitante.idade = 17;

        if (novoVisitante.idade < Visitante.IDADE_MINIMA_DE_ACESSO) {
            System.out.printf("Idade não permitida para menores de %d anos.%n",
                    Visitante.IDADE_MINIMA_DE_ACESSO);
        } else {
            System.out.println("Acesso liberado.");
        }

    }
}
