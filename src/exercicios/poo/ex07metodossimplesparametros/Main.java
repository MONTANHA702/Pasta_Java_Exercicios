package exercicios.poo.ex07metodossimplesparametros;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        FigurasGeometricas figurasGeometricas = new FigurasGeometricas();

        System.out.println("Digite " +
                "\n1 - QUADRADO" +
                "\n2 - RETANGULO" +
                "\n3 - CIRCULO" +
                "\n4 - TRIANGULO");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                figurasGeometricas.dadosTecnicosQuadrado();
                System.out.println("Digite o valor do lado: ");
                double lado = sc.nextDouble();
                System.out.printf("Perimetro Quadrado de %.2f de lado: %.2f%n", lado, figurasGeometricas.perimetroQuadrado(lado));
                System.out.printf("Área do Quadrado de lado %.2f: %.2f%n", lado, figurasGeometricas.areaQuadrado(lado));
                break;
            case 2:
                figurasGeometricas.dadosTecnicosRetangulo();
                System.out.println("Digite o valor da base: ");
                double base = sc.nextDouble();
                System.out.println("Digite o valor da altura: ");
                double altura = sc.nextDouble();
                System.out.printf("Perimetro Retângulo: %.2f%n",figurasGeometricas.perimetroRetangulo(base, altura));
                System.out.printf("Área do Retângulo de base %.2f e altura %.2f: %.2f%n", base, altura, figurasGeometricas.areaRetangulo(base, altura));
                break;
            case 3:
                figurasGeometricas.dadosTecnicosCirculo();
                System.out.println("Digite o valor do raio: ");
                double raio = sc.nextDouble();
                System.out.println("Circunfêrencia: " + figurasGeometricas.circunferencia(raio));
                System.out.printf("Área do Círculo de %.2f de raio: %.2f%n", raio, figurasGeometricas.areaCirculo(raio));
                break;
            case 4:
                figurasGeometricas.dadosTecnicosTriangulo();
                System.out.println("Digite o valor da base: ");
                double baseT = sc.nextDouble();
                System.out.println("Digite o valor da altura: ");
                double alturaT = sc.nextDouble();
                System.out.printf("Área do Triângulo de base %.2f e altura %.2f: %.2f%n", baseT, alturaT, figurasGeometricas.areaTriangulo(baseT, alturaT));
                break;
            default:
                System.out.println("Digite somente números de 1 a 4.");
        }
        sc.close();

    }
}
