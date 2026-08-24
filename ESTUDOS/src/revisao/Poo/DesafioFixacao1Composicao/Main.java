package revisao.Poo.DesafioFixacao1Composicao;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco();
        endereco1.logradouro = "Q 104";
        endereco1.numero = 11;
        endereco1.cidade = "AGUAS CLARAS";
        endereco1.uf = "DF";
        endereco1.cep = "71.909-180";

        DocumentoIdentidade documento1 = new DocumentoIdentidade();
        documento1.tipo = "IDENTIDADE";
        documento1.numero = "492927";

        Cliente joao = new Cliente();
        joao.nome = "JOAO SILVA";
        joao.endereco = endereco1;
        joao.identidade = documento1;

        joao.exibirDados();
    }
}
