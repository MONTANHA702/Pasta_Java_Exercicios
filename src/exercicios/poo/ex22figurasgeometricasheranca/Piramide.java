package exercicios.poo.ex22figurasgeometricasheranca;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double areaBase;
    private double altura;
    private double areaLateral;


    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void descrever() {
        System.out.println("===PIRAMIDE===");
        System.out.println("Sólido geométrico formado por uma base plana e faces laterais triangulares. ");
    }

    @Override
    public double calcularArea() {
        double area = areaBase + areaLateral;
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = areaBase * altura;
        return volume;
    }
}
