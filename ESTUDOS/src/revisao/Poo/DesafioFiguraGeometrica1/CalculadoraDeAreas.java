package revisao.Poo.DesafioFiguraGeometrica1;

import revisao.Poo.DesafioFiguraGeometrica.CalculadorDeAreas;

public class CalculadoraDeAreas {

     static  final double PI = 3.1415;

    static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
    static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraDeAreas.PI;
    }
    static double calcularAreaRetangulo(double base, double altura) {
        return  base * altura;
    }
    static double calcularAreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }


}
