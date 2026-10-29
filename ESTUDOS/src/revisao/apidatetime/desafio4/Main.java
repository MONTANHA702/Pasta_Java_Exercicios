package revisao.apidatetime.desafio4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORA = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_FINAL = DateTimeFormatter
            .ofPattern("dd 'de ' MMMM ' de ' yyyy ' às ' HH:mm (zzzz)");
    private static final Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        produzirConvite();

    }

    private static LocalDate inserindoData(String data) {
        while (true) {
            try {
                System.out.println(data);
                String horaTexto = LER.nextLine();
                return LocalDate.parse(horaTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data escrita incorretamente. Tente novamente.");
            }
        }
    }

    private static LocalTime inserindoHora(String hora) {
        while (true) {
            try {
                System.out.println(hora);
                String dataTexto = LER.nextLine();
                return LocalTime.parse(dataTexto, FORMATADOR_HORA);
            } catch (DateTimeParseException e) {
                System.out.println("Hora escrita incorretamente. Tente novamente.");
            }
        }
    }

    public static void produzirConvite() {
        while (true) {

            LocalDate data = inserindoData("Digite a data do evento: ");
            if (data.isBefore(LocalDate.now())) {
                System.out.println("Foi digitada uma data passada. Tente novamente.");
                continue;
            }
            LocalTime hora = inserindoHora("Hora do evento:");
            ZonedDateTime dataHoraComFuso = ZonedDateTime.of(data, hora, ZoneId.systemDefault());
            ZonedDateTime dataHoraLosAngeles = dataHoraComFuso
                    .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
            ZonedDateTime dataHoraJapao = dataHoraComFuso
                    .withZoneSameInstant(ZoneId.of("Japan"));


            separador();
            System.out.println("CONVITE FESTA");
            separador();
            System.out.println("Data local do evento: " + FORMATADOR_FINAL.format(dataHoraComFuso));
            System.out.println("Data do evento LOS ANGELES: " + FORMATADOR_FINAL.format(dataHoraLosAngeles));
            System.out.println("Data do evento JAPÃO: " + FORMATADOR_FINAL.format(dataHoraJapao));
            separador();
            break;
        }
    }

    private static void separador() {
        System.out.println("==========");
    }
}
