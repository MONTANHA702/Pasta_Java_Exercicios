package exercicios.basicos;

import java.util.Scanner;

public class Ex18ExcecoesThrows {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite um numero decimal: ");
        try{
            double numero = lerNumero();
            System.out.println("Número digitado: " + numero);
        } catch(Exception e){
            System.out.println("Entrada inválida"); //geralmente paramos aqui para nao expor o sistema
            e.printStackTrace(); //usamos essa linha quando passamos para outro dev tratar o problema
        }

    }

    public static double lerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        return numero;
    }
}
