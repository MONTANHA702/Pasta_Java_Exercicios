package revisao.apidatetime.desafio3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    private static final Scanner LER = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        calcularTempoNascimento();
    }

    private static LocalDate requisitarDataNascimento(String data) {
        while (true) {
            try {
                System.out.println(data);
                String dataTexto = LER.nextLine();
                return LocalDate.parse(dataTexto, FORMATADOR);
            } catch (DateTimeParseException ex) {
                System.out.println("Data escrita incorretamente. Tente novamente.");
            }
        }
    }

    private static void calcularTempoNascimento() {
        while (true) {
            LocalDate dataAtual = LocalDate.now();
            LocalDate dataNascimento = requisitarDataNascimento("Digite a data de nascimento separada por barras: ");
            if (dataAtual.isBefore(dataNascimento)) {
                System.out.println("A data digitada está no futuro. Tente novamente.");
                continue;
            }
            Period tempoDecorrido = Period.between(dataNascimento, dataAtual);
            long totalDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
            if(tempoDecorrido.getYears() >= 1) {
                System.out.printf("Você nasceu há %d ano(s) %d mes(es) e %d dia(s).%n",
                        tempoDecorrido.getYears(),
                        tempoDecorrido.getMonths(),
                        tempoDecorrido.getDays());
                System.out.printf("Total de dias decorridos desde seu nascimento: %d%n", totalDias);
            } else {
                System.out.printf("Você nasceu há %d mes(es) e %d dia(s).%n",
                        tempoDecorrido.getMonths(),
                        tempoDecorrido.getDays());
                System.out.printf("Total de dias decorridos desde seu nascimento: %d%n", totalDias);
            }
            break;
        }
    }
}
