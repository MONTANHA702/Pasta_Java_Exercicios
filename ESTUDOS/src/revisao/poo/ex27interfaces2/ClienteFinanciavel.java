package revisao.poo.ex27interfaces2;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    //default method - somente para interface
    //usado quando quando for acrescentar um metodo em uma
    //interface que já é usada por muitas classes
    default double calcularJuros(double valorSolicitado) {
        if(valorSolicitado < 100_000) {
            return 1.0;
        } else if (valorSolicitado < 1_000_000) {
            return 1.5;
        }

        return 2.0;
        }
    }

