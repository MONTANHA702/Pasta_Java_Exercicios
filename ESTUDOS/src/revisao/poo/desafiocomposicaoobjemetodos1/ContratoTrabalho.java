package revisao.poo.desafiocomposicaoobjemetodos1;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean recebeAuxilioFilhos() {
        return funcionario.temFilhos();
    }

}
