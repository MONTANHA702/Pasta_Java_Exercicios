package exercicios.basicos;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12ExcecoesSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = 0;
        while (true) {
            try {
                System.out.print("Digite um valor: ");
                valor = sc.nextInt(); //nao consome a quebra de linha
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida, digite um número inteiro");
                sc.next(); //descarta a entrada inválida que causou a exceção, evita loop infinito.
            }
        }
        System.out.println("Entrada válida. Número digitado: " + valor);

        sc.close();


    }


}
