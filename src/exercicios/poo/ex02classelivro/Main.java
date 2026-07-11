package exercicios.poo.ex02classelivro;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.titulo = "O Senhor dos Aneis";
        livro2.titulo = "O Senhor das Moscas";
        livro3.titulo = "Adeus China";

        livro1.anoLancamento = 2012;
        livro2.anoLancamento = 1992;
        livro3.anoLancamento = 2008;



        System.out.printf("O livro %s foi escrito em %d.%n", livro1.titulo, livro1.anoLancamento);
        System.out.printf("O livro %s foi escrito em %d.%n", livro2.titulo, livro2.anoLancamento);
        System.out.printf("O livro %s foi escrito em %d.%n", livro3.titulo, livro3.anoLancamento);
    }
}
