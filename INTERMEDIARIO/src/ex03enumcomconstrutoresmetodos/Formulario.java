package ex03enumcomconstrutoresmetodos;

public class Formulario {
//exemplo de enum dentro da classe
    enum Genero {
        MASCULINO('M'), FEMININIO('F');

        private char valor;

        //construtor
        Genero(char valor) {
            this.valor = valor;
        }
    }
    private String nome;
    private Genero genero;
}
