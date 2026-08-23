package revisao.Poo.DesafioComposicaoObjEmetodos;

public class FolhaPagamento {

    Holerite calcular(int qtdHorasTrabalhadas, int qtdHorasExtra, ContratoTrabalho contrato) {

        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasTrabalhadas = qtdHorasTrabalhadas*contrato.valorHoraTrab;
        holerite.valorTotalHorasExtras = qtdHorasExtra*contrato.valorHoraExtra;

        double subTotal = holerite.valorTotalHorasTrabalhadas + holerite.valorTotalHorasExtras;

        if (contrato.possuiAdicionalFilhos()) {
            holerite.valorAdicionalFilhos = subTotal*0.1;
        }
        return holerite;

    }
}
