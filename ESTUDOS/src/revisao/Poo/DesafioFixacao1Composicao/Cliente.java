package revisao.Poo.DesafioFixacao1Composicao;

public class Cliente {

    String nome;
    Endereco endereco;
    DocumentoIdentidade identidade;

    void exibirDados() {
        System.out.println("===========");
        System.out.println("DADOS DO CLIENTE");
        System.out.println("Nome: " + nome);
        endereco.exibirEndereco();
        identidade.exibirDocumento();
        System.out.println("===========");


    }
}
