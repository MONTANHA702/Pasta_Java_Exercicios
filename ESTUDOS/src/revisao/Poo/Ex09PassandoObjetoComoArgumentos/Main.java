package revisao.Poo.Ex09PassandoObjetoComoArgumentos;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculadoraIMC novaCalculadora = new CalculadoraIMC();

        Paciente joao = new Paciente();//instanciar a classe paciente

        System.out.println("Entre com o peso: ");
        joao.peso = sc.nextDouble();

        System.out.println("Entre com a altura: ");
        joao.altura = sc.nextDouble();


        IndiceMassaCorporal imc = novaCalculadora.calcular(joao);//passar o objeto como parametro

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso %.2f " +
                    "está com obesidade.%n", imc.altura, imc.peso);
        }

        if (imc.estaAbaixoDoPeso()) {
            System.out.printf("Paciente com altura %.2f e peso %.2f " +
                    "está abaixo do peso.%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);


    }
}
