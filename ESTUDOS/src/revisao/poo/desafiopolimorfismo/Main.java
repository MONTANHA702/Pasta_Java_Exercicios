package revisao.poo.desafiopolimorfismo;

public class Main {
    public static void main(String[] args) {

        var gestorDeImpostos = new GestorDeImpostos();

        var pessoa1 = new PessoaFisica("Mariazinha", 140_000);
        var pessoa2 = new EmpresaSimples("Manoel EIRELLI", 120_000, 105_000);
        var pessoa3 = new EmpresaLucroReal("Sofia LTDA", 200_000, 240_000);

        gestorDeImpostos.adicionar(pessoa1);
        gestorDeImpostos.adicionar(pessoa2);
        gestorDeImpostos.adicionar(pessoa3);


        System.out.printf("Total de imposto recolhido: R$ %.2f%n", gestorDeImpostos.getValorTotalImpostos());

    }
}
