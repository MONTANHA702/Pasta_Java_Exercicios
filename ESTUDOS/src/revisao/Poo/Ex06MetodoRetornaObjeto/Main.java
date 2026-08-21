package revisao.Poo.Ex06MetodoRetornaObjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        System.out.println("Digite o peso: ");
        paciente1.peso = sc.nextDouble();

        System.out.println("Digite a altura: ");
        paciente1.altura = sc.nextDouble();

        IndiceMassaCorporal imcx = paciente1.calcularImc();//se o metodo fosse um double, declaro um double
        //mas como o metodo e um IndiceMassaCorporal entao declara-se como tal.

        if (imcx.resultado >= 30) { //note que não é interessante ter essa regra no codigo
                                    //principal, dificulta a manutenção.
            System.out.printf("Paciente com altura %.2f e peso %.2f " +
                    "está com obesidade.%n", imcx.altura, imcx.peso);
        }

        System.out.printf("IMC: %.2f%n", imcx.resultado);


    }
}
