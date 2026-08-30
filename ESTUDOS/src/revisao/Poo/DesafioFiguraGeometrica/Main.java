package revisao.Poo.DesafioFiguraGeometrica;

public class Main {

    public static void main(String[] args) {

        //Instancio a classe para obter os atributos
        //Instancio o metodo static para obter a formula especifica de cada figura

        CalculadorDeAreas areas = new CalculadorDeAreas();

        //quadrado
        areas.lado = 5;

        double quadradoArea = CalculadorDeAreas.calcularAreaQuadrado(areas);
        System.out.printf("A área do quadrado vale %.2f metros quadrados%n", quadradoArea);

        //circulo
        areas.raio = 23;
        double circuloArea = CalculadorDeAreas.calcularAreaCirculo(areas);
        System.out.printf("A área do circulo vale %.2f metros quadrados%n", circuloArea);


        //retangulo
        //triangulo
        areas.base = 10;
        areas.altura = 5;
        double retanguloArea = CalculadorDeAreas.calcularAreaRetangulo(areas);
        System.out.printf("A área do retângulo vale %.2f metros quadrados%n", retanguloArea);

        double trianguloArea = CalculadorDeAreas.calcularAreaTriangulo(areas);
        System.out.printf("A área do triângulo vale %.2f metros quadrados%n", trianguloArea);

        //losango
        areas.diagonalMenor = 12;
        areas.diagonalMaior = 18;
        areas.altura = 10;
        double losangoArea = CalculadorDeAreas.calcularAreaLosango(areas);
        System.out.printf("A área do losango vale %.2f metros quadrados%n", losangoArea);
    }
}
