package revisao.Poo.DesafioFiguraGeometrica;

public class CalculadorDeAreas {

    double lado;
    double raio;
    double base;
    double altura;
    double diagonalMaior;
    double diagonalMenor;


    static double calcularAreaQuadrado(CalculadorDeAreas quadrado) {

       return quadrado.lado * quadrado.lado;

    }

    static double calcularAreaCirculo(CalculadorDeAreas circulo) {

       return 3.14 * circulo.raio * circulo.raio;

    }

    static double calcularAreaRetangulo(CalculadorDeAreas retangulo) {

        return retangulo.base * retangulo.altura;
    }

    static double calcularAreaLosango(CalculadorDeAreas losango) {

        return (losango.diagonalMaior + losango.diagonalMenor) * losango.altura / 2;
    }

    static double calcularAreaTriangulo(CalculadorDeAreas triangulo) {

        return (triangulo.base * triangulo.altura) / 2;
    }

}
