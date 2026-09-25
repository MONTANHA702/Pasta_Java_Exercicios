package revisao.poo.ex27interfaces2;

public interface ClienteFinanciavel {

    double JUROS_BAIXO_RISCO = 1.0; //public static final double
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    double calcularLimiteAprovado();

    //default method - somente para interface
    //usado quando quando for acrescentar um metodo em uma
    //interface que já é usada por muitas classes
    default double calcularJuros(double valorSolicitado) {
        if(valorSolicitado < 100_000) {
            return JUROS_BAIXO_RISCO;
        } else if (valorSolicitado < 1_000_000) {
            return JUROS_MEDIO_RISCO;
        }

        return JUROS_ALTO_RISCO;
        }
    }

