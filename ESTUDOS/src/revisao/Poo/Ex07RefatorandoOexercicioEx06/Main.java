package revisao.Poo.Ex07RefatorandoOexercicioEx06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Paciente novoPaciente = new Paciente();

        System.out.println("Digite o peso: ");
        novoPaciente.peso = sc.nextDouble();

        System.out.println("Digite a altura: ");
        novoPaciente.altura = sc.nextDouble();

        IndiceMassaCorporal imc = novoPaciente.calcularIndiceCorporal();

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso %.2f " +
                    "está com obesidade.%n", imc.altura, imc.peso);
        }

        if (imc.estaAbaixoDoPeso()) {
            System.out.printf("Paciente com altura %.2f e peso %.2f " +
                    "está abaixo do peso.%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado );
    }
}
