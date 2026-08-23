package revisao.Poo.DesafioComposicaoObjEmetodos;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraTrab;
    double valorHoraExtra;

    boolean possuiAdicionalFilhos() {
        return funcionario.temFilhos();
    }

}
