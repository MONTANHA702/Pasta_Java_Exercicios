package revisao.poo.desafiocomposicaoobjemetodos;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraTrab;
    double valorHoraExtra;

    boolean possuiAdicionalFilhos() {
        return funcionario.temFilhos();
    }

}
