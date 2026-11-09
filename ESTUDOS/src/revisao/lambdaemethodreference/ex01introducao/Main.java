package revisao.lambdaemethodreference.ex01introducao;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("Joao", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Pedro", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

//        List<Cliente> clientes = cadastroCliente.getClientes();

//        System.out.println("Lista de todos os clientes (com o getClientes):");
//        for (Cliente c : clientes) {
//            System.out.printf("%S - %d anos%n", c.getNome(), c.getIdade());
//        }


//        System.out.println("Lista de clientes (filtrados com classe anônima):");
//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                return cliente.getIdade() > 40;
//            }
//        };
//        //consultar clientes a partir da variavel filtro
//        List<Cliente> clientesConsultados  = cadastroCliente.consultar(filtro);
//        for (Cliente c : clientesConsultados) {
//            System.out.printf("%S - %d anos%n", c.getNome(), c.getIdade());
//        }


        System.out.println("Lista de clientes (filtrados com lambda):");

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        for (Cliente cliente : clientes) {
            System.out.printf("Nome: %s - %d%n", cliente.getNome(), cliente.getIdade());
        }


    }
}
