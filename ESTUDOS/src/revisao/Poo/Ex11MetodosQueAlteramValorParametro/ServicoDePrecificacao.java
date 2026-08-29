package revisao.Poo.Ex11MetodosQueAlteramValorParametro;

public class ServicoDePrecificacao {

    //observe que a variável alterada morre no escopo do método
    //ela nao modifica nada.
    void calcularPrecoVenda(double precoCusto) {
        //adiciona 20% de margem de lucro
        precoCusto = precoCusto*1.20;
    }

    //forma correta
/*
    double calcularPrecoVenda(double precoCusto) {
        return precoCusto*1.20;
    }*/
}
