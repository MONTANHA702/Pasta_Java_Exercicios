package revisao.Poo.DesafioComposicaoObjEmetodos1;

public class FolhaDePagamento {

    Holerite calcularSalario(int quantidadeHorasNormais, int quantidadeHorasExtra,
                                     ContratoTrabalho contrato){
        Holerite holerite = new Holerite();
        holerite.valorTotalHorasNormais = quantidadeHorasNormais*contrato.valorHoraNormal;
        holerite.valorTotalHorasExtra = quantidadeHorasExtra*contrato.valorHoraExtra;
        holerite.funcionario = contrato.funcionario;

        double salarioParcial = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtra;

        if (contrato.recebeAuxilioFilhos()) {
            holerite.valorAdicionalFilhos = salarioParcial*0.1;
        }

        return holerite;
    }


}
