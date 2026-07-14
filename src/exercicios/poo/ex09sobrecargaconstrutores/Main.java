package exercicios.poo.ex09sobrecargaconstrutores;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jader","Castanho","Castanhos", 30, 1.91, 102 );
        Pessoa p2 = new Pessoa("Ayla", 14, 1.53);
        Pessoa p3 = new Pessoa();


        p1.apresentarPessoa();
        p2.apresentarPessoa();
        p3.apresentarPessoa();

    }
}
