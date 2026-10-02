package revisao.generics.ex03delimitando;


public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new Funcionario("Joao", 40),
                new Funcionario("Jose", 20),
                new Funcionario("Maria", 30)};


        Cliente[] clientes = {
                new Cliente("Mercado do Joao", 2_000_000),
                new Cliente("Posto J", 1_000_000),
                new Cliente("Javac Ltda", 58_000_000),
        };

        Funcionario funcionarioEncontrado = Pesquisador.obterPorNome(funcionarios, "Joao");
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterPorNome(clientes, "Javac Ltda");
        System.out.println(clienteEncontrado);
    }
}
