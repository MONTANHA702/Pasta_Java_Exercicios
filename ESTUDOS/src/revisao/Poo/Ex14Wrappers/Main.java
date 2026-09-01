package revisao.Poo.Ex14Wrappers;

public class Main {
    public static void main(String[] args) {


        Cliente novoCliente = new Cliente();

        System.out.println(novoCliente.nome);
        System.out.println(novoCliente.idade);
        System.out.println(novoCliente.rendaMensal);

        //atribuindo valores com wrappers
        novoCliente.idade = 20;//versoes antigas: Integer.valueOf(20);
        novoCliente.idade = Integer.valueOf("23"); //passando uma String
        novoCliente.nome = "Joao";
        novoCliente.rendaMensal = 12_450.0;

        System.out.println(novoCliente.nome);
        System.out.println(novoCliente.idade);
        System.out.println(novoCliente.rendaMensal);

    }
}
