package exercicios.poo.ex23exerciciogeral;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;
        while (opcao != 3) {
            opcao = obterOpcaoMenu(sc);
            if (opcao == 1) {//consultar contato
                consultarContado(sc, agenda);

            } else if (opcao == 2) {//adicionar contato
                adicionarContato(sc, agenda);

            } else if (opcao == 3) {//sair
                System.out.println("Saindo do sitema");
            }
        }
    }

    public static void adicionarContato(Scanner sc, Agenda agenda) {
        System.out.println("Criando contato. Entre com as informações: ");
        String nome = lerInformacao(sc, "Entre com o nome do contato: ");
        String telefone = lerInformacao(sc, "Entre com o telefone: ");
        String email = lerInformacao(sc, "Entre com o email: ");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        System.out.println("Contato a ser criado: ");
        System.out.println(contato.toString());

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contados da agenda:");
            System.out.println(agenda.toString());
        }

    }

    public static void consultarContado(Scanner sc, Agenda agenda) {
        String nomeContato = lerInformacao(sc, "Entre com o nome do contato a ser pesquisado: ");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacao(Scanner sc, String msg) {
        System.out.println(msg);
        String entrada = sc.nextLine();
        return entrada;
    }


    public static int obterOpcaoMenu(Scanner sc) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada:" +
                    "\n1 - Consultar contato;" +
                    "\n2 - Adicionar contato;" +
                    "\n3 - Sair;");
            try {
                String entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente.\n");

            }

        }
        return opcao;

    }

}



