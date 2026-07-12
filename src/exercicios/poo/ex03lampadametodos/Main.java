package exercicios.poo.ex03lampadametodos;

public class Main {
    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.marca = "Aspen";
        lampada1.modelo = "Sem borda";
        lampada1.walts = 25;
        lampada1.preco = 42.40;

        lampada1.fichaTecnica();
        lampada1.ligar();
        lampada1.desligar();
    }
}
