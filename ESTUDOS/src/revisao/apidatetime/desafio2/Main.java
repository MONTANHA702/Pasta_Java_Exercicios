package revisao.apidatetime.desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        LocalDate primeiraParcela = requisitarData("Digite a data da primeira parcela: ");
        //System.out.println("Primeira parcela: " + FORMATADOR.format(primeiraParcela));

        int quantidadeParcelas = requisitarQuantidadeParcelas("Quantidade de parcelas: ");
        //System.out.println("Quantidade de parcelas: " + quantidadeParcelas);

        System.out.println("CALENDÁRIO DE PARCELAS");
        mostrarDataParcelas(primeiraParcela, quantidadeParcelas);

    }

    private static LocalDate requisitarData(String data) {
        while (true) {
            try {
                System.out.println(data);
                String dataTexto = ENTRADA.nextLine();
                return LocalDate.parse(dataTexto, FORMATADOR);
            } catch (DateTimeParseException e) {
                System.out.println("Data incorreta. Tente novamente.");
            }
        }
    }

    private static int requisitarQuantidadeParcelas(String parcelas) {
        while (true) {
            System.out.println(parcelas);
            try {
                int quantidade = Integer.parseInt(ENTRADA.nextLine().trim());//java 8-
                if (quantidade > 0) {
                    return quantidade;
                }
                System.out.println("Parcela negativa. Tente novamente.");
            } catch (RuntimeException e) {
                System.out.println("Informação inconsistente. Tente novamente.");
            }
        }
    }

    private static void mostrarDataParcelas(LocalDate data, int parcelas) {
        for (int i = 1; i <= parcelas; i++) {
            data = data.plusDays(30);
            System.out.printf("Data da parcela #%d: %s%n", i, FORMATADOR.format(data));
        }
    }




}
