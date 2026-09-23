package revisao.poo.ex25polimorfismoclassesabstratas;

public class Main {
    public static void main(String[] args) {

        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);
    }
}
