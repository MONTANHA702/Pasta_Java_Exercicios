package revisao.Poo.DesafioFiguraGeometrica1;

public class Main {
    public static void main(String[] args) {

        //quadrado
        double areaQuadrado = CalculadoraDeAreas.calcularAreaQuadrado(4);
        System.out.printf("A área do quadrado vale %.2f metros quadrados%n", areaQuadrado);

        double areaCirculo = CalculadoraDeAreas.calcularAreaCirculo(6);
        System.out.printf("A área do círculo vale %.2f metros quadrados%n", areaCirculo);

        double areaRetangulo = CalculadoraDeAreas.calcularAreaRetangulo(6,14);
        System.out.printf("A área do retângulo vale %.2f metros quadrados%n", areaRetangulo);

        double aretaTriangulo = CalculadoraDeAreas.calcularAreaTriangulo(20, 13);
        System.out.printf("A área do triângulo vale %.2f metros quadrados%n", aretaTriangulo);
    }
}
