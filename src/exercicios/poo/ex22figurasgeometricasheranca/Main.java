package exercicios.poo.ex22figurasgeometricasheranca;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        triangulo.descrever();
        System.out.println("=====");;
        Quadrado quadrado = new Quadrado();
        quadrado.descrever();
        quadrado.setLado(4);
        double areaQ = quadrado.calcularArea();
        System.out.println("Area do quadrado: " + areaQ);



        System.out.println("====");
        Circulo circulo = new Circulo();
        circulo.descrever();
        System.out.println("====");
        Cilindro cilindro = new Cilindro();
        cilindro.descrever();
    }
}
