package ex08enumcomatributos;

public enum Planeta {

    MERCURIO(57.9),
    VENUS(108.2),
    TERRA(149.6),
    MARTE(227.9);

    private double distanciaSol;

    Planeta(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }
}
