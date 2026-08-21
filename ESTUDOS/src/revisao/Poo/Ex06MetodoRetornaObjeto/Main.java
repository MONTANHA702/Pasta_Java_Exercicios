package revisao.Poo.Ex06MetodoRetornaObjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        //System.out.println("Digite o peso: ");
        paciente1.peso = 94;//sc.nextDouble();

        //System.out.println("Digite a altura: ");
        paciente1.altura = 1.89; //sc.nextDouble();

        IndiceMassaCorporal imcx = paciente1.calcularImc();//se o metodo fosse um double, declaro um double
        //mas como o metodo e um IndiceMassaCorporal entao declara-se como tal.
        System.out.printf("IMC: %.2f%n", imcx.resultado);


    }
}
