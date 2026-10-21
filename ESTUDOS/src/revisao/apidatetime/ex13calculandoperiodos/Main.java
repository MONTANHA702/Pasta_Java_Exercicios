package revisao.apidatetime.ex13calculandoperiodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate dataCompra = LocalDate.parse("2026-08-12");
        LocalDate dataEntrega = LocalDate.parse("2026-10-21");

        Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        Period tempoEntrega1 = dataCompra.until(dataEntrega);

        System.out.printf("Tempo de entrega: %d meses e %d dias%n",tempoEntrega.getMonths(),
                tempoEntrega.getDays());
        System.out.printf("Tempo de entrega1: %d meses e %d dias%n", tempoEntrega1.getMonths(),
                tempoEntrega1.getDays());

        //buscando em outras unidades temporais
        long tempoEntregaEmSemanas = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);
        //long tempoEntregaEmSemanas = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
        System.out.printf("%d semanas%n", tempoEntregaEmSemanas);

        long tempoEntregaEmDias = dataCompra.until(dataEntrega, ChronoUnit.DAYS);
        System.out.printf("%d dias%n", tempoEntregaEmDias);

        long tempoEntregaMeses = dataCompra.until(dataEntrega, ChronoUnit.MONTHS);
        System.out.printf("%d meses%n", tempoEntregaMeses);

    }
}
