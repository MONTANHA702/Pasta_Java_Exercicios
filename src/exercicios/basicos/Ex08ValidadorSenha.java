package exercicios.basicos;

import java.util.Scanner;

public class Ex08ValidadorSenha {
    public static void main(String[] args) {
        //validar senha
        //Pelo menos 8 caracteres
        //Conter pelo menos 1 letra
        //Conter pelo menos 1 número

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha com pelo menos 8 caracteres (pelo menos 1 letra ou 1 numero: ");
        String senha = sc.nextLine().trim();

        boolean temLetra;
        boolean temNumero;

        while (senha.isEmpty()) {
            System.out.println("Entrada inválida. Digite uma senha ou 99 para SAIR: ");
            senha = sc.nextLine();
            if (senha.equals("99")) {
                break;
            }
        }
        if (senha.equals("99")) {
            System.out.println("Processo encerrado com sucesso.");
        } else {
            while (!senha.equals("99")) {
                temNumero = false;
                temLetra = false;
                for (int i = 0; i < senha.length(); i++) {
                    char letra = senha.charAt(i);
                    if (Character.isLetter(letra)) {
                        temLetra = true;
                    }
                    if (Character.isDigit(letra)) {
                        temNumero = true;
                    }
                }
                if (senha.length() >= 8 && temLetra && temNumero) {
                    System.out.printf("Senha %s registrada com sucesso.", senha);
                } else {
                    System.out.println("Senha não preenche os requisitos. Tente outra vez: ");
                    senha = sc.nextLine();
                    continue;
                }

                System.out.println("\nDeseja cadastrar mais uma senha? " +
                        "\nDigite a nova senha ou 99 para SAIR.");
                senha = sc.nextLine();

                if (senha.equals("99")) {
                    System.out.println("Processo encerrado com sucesso.");
                    break;
                }

            }
        }
        sc.close();
    }
}
