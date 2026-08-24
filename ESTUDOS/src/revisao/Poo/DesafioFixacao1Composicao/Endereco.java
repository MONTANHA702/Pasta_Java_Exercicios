package revisao.Poo.DesafioFixacao1Composicao;

public class Endereco {

    String logradouro;
    String cidade;
    String uf;
    String cep;
    int numero;

    void exibirEndereco() {
        System.out.printf("Endereço: %S, %d - %S-%S, CEP %s%n", logradouro,numero, cidade, uf, cep);
    }

}
