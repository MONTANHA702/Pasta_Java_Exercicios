package exercicios.poo.ex22figurasgeometricasheranca;

public class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public void descrever() {
        System.out.println("===TRIÂNGULO===");
        System.out.println("Figura geométrica que possui os lados opostos iguais e paralelos. ");

    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
}
