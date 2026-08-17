package exercicios.poo.ex22figurasgeometricasheranca;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;

    }

    @Override
    public void descrever() {
        System.out.println("===QUADRADO===");
        System.out.println("Figura geométrica com 4 lados iguais e 4 ângulos retos.");
    }

    @Override
    public double calcularArea( ) {
        return lado*lado;
    }
}
