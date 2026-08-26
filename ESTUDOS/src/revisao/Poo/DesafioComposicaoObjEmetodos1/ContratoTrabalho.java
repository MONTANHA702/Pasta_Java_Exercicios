package revisao.Poo.DesafioComposicaoObjEmetodos1;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean recebeAuxilioFilhos() {
        return funcionario.temFilhos();
    }

}
