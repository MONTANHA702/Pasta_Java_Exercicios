package revisao.enumeracoes.desafio;

public class Main {
    public static void main(String[] args) {

        var notaFiscal = new NotaFiscal(234, "Computador", 10_000);
        System.out.println(notaFiscal.getDescricaoCompleta());

//        notaFiscal.emitir();
//        System.out.println(notaFiscal.getDescricaoCompleta());

        notaFiscal.cancelar();
        System.out.println(notaFiscal.getDescricaoCompleta());

    }
}
