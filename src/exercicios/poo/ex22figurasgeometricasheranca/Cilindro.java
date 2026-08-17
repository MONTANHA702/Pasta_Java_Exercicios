package exercicios.poo.ex22figurasgeometricasheranca;

public class Cilindro extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial {

    private double raioBase;
    private double altura;
    final double PI = 3.14;

    public double getRaioBase() {
        return raioBase;
    }

    public void setRaioBase(double raioBase) {
        this.raioBase = raioBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void descrever() {
        System.out.println("===CILINDRO===");
        System.out.println("Sólido geométrico que possui a base circular.");
    }

    @Override
    public double calcularArea() {
       double area = 2*PI*raioBase*(raioBase+ altura);
       return area;
    }

    @Override
    public double calcularVolume() {
        double volume = PI*raioBase*raioBase*altura;
        return volume;
    }
}

