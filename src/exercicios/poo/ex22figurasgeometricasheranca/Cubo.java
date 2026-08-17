package exercicios.poo.ex22figurasgeometricasheranca;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private double aresta;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public void descrever() {
        System.out.println("===CUBO===");
        System.out.println("Sólido que possui 6 faces (quadrados) iguais.");
    }

    @Override
    public double calcularArea() {
        return 6*aresta*aresta;
    }

    @Override
    public double calcularVolume() {
        return aresta*aresta*aresta;
    }
}
