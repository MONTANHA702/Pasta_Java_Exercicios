package revisao.poo.desafiointerface;

public class Main {
    public static void main(String[] args) {

        var novoImovel = new ImovelResidencial(100_000, 120, "Casa");
        var carroNovo = new CarroParticular("Subaru", 340_000, 1999);
        var caminhaoNovo = new Caminhao("Volvo 1045", 1_200_000, 2015, 10);


        var servicoPropostaSeguro = new ServicoPropostaSeguro();
        servicoPropostaSeguro.emitir(novoImovel);
        servicoPropostaSeguro.emitir(carroNovo);
        servicoPropostaSeguro.emitir(caminhaoNovo);
    }
}
