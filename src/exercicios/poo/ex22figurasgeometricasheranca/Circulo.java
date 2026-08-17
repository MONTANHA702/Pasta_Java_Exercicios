package exercicios.poo.ex22figurasgeometricasheranca;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    private double raio;
    final private double PI = 3.1415;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public void descrever() {
        System.out.println("===CÍRCULO===");
        System.out.println("Figura geométrica que possui raio e circunfência.");
    }

    @Override
    public double calcularArea() {
        return 2*PI*raio;
    }
}
