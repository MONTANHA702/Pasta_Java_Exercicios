package exercicios.poo.ex07metodossimplesparametros;

public class FigurasGeometricas {
    String quadrado = "Quadrado";
    String circulo = "Circulo";
    String retangulo = "Retangulo";
    String triangulo = "Triangulo";

    final double PI = 3.14;

    double areaQuadrado(double lado){
        return lado*lado;
    };
    double areaCirculo(double raio){
        return PI*raio*raio;
    };
    double areaRetangulo(double base, double altura){
        return base*altura;
    };
    double areaTriangulo(double base, double altura){
        return (base*altura)/2;
    }
    double perimetroQuadrado(double lado){
        return lado*4;
    }
    double perimetroRetangulo(double base, double altura){
        return 2*(base + altura);
    }
    double circunferencia(double raio){
        return 2*PI*raio;
    }
    void dadosTecnicosCirculo(){
        System.out.println("Figura: "+ circulo);
        System.out.println("Diametro é a maior corda e equivale a 2 RAIOS");
        System.out.println("PI é calculado dividindo-se a circunferencia pelo diâmetro.");

    }
    void dadosTecnicosQuadrado(){
        System.out.println("Figura: "+ quadrado);
        System.out.println("4 lados iguais, 4 ângulos retos");
        System.out.println("Os lados opostos são paralelos");
    }
    void dadosTecnicosRetangulo(){
        System.out.println("Figura: "+ retangulo);
        System.out.println("lados opostos são iguais, 4 ângulos retos");
        System.out.println("Os lados opostos são paralelos");
    }
    void dadosTecnicosTriangulo(){
        System.out.println("Figura: "+ triangulo);
        System.out.println("Classificação quanto aos lados: equilátero, isósceles, escaleno");
        System.out.println("Classificação quanto aos ângulos: acutângulo, reto, obtusângulo");
        System.out.println("O triângulo equilátero possui os 3 lados iguais e 3 ângulos iguais a 60 graus.");
    }
}
