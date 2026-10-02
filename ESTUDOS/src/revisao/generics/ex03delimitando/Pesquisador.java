package revisao.generics.ex03delimitando;

public class Pesquisador {

    //realizo a parametrizacao
    //crio uma inteface Nomeavel e implemento em Cliente e Funcionario
    //uso a palavra extends para a interface
    //funciona para os subtipos de nomeavel (cliente, funcionario)
    public static <T extends Nomeavel> T obterPorNome(T[] itens, String nome) {
        for (T item : itens) {
            if (item.getNome().equals(nome)) {
                return item;
            }
        }
        throw new RuntimeException("Funcionário não encontrado");
    }
}
