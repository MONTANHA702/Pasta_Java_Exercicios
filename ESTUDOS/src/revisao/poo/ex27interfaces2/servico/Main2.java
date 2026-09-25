package revisao.poo.ex27interfaces2.servico;

import revisao.poo.ex27interfaces2.ClienteFinanciavel;
import revisao.poo.ex27interfaces2.Funcionario;

public class Main2 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Pedro", 12_000);
        //funcionario.calcularBonus(80);


        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagarBonus(funcionario, 80);


    }
}
