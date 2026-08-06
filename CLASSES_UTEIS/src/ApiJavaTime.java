import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class ApiJavaTime {
    public static void main(String[] args) {

        //java.time veio para resolver os problemas de data no Java
        //Java 8+
        //Bom saber as outras classes para sistemas legados
        //traz um padrão yyyy-MM-dd
        System.out.println("LocalDate para trabalhar com data");
        LocalDate agora = LocalDate.now();//trabalha com data
        System.out.println(agora);
        System.out.println(LocalDate.of(2026,8,6));//passando parametros int
        System.out.println(LocalDate.parse("2026-08-06"));//passando um string que tem que estar no formato
        System.out.println(agora.plusDays(26));//adicionando dias
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));//reduzir data tirar 1 mes
        System.out.println(agora.minus(30, ChronoUnit.DAYS));//reduzir data tirar 30 dias
        System.out.println(agora.getDayOfWeek());//retorna o nome do dia da semana
        System.out.println(agora.getDayOfMonth());//retorna o dia do mes
        System.out.println(agora.getDayOfYear());//retorna o dia(int) do ano
        System.out.println(agora.getMonth());//retorna o nome do mes
        System.out.println(agora.getYear());//retorna o ano
        System.out.println(agora.isLeapYear());//ano bisexto boolean
        System.out.println("===");

        System.out.println("LocalTime para trabalhar com horas");
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);//padrão hora, min, seg, milseg
        System.out.println(LocalTime.of(20,54));//passando parametros
        System.out.println(LocalTime.parse("20:54"));//passando string
        System.out.println(hAgora.plusMinutes(55));//adicionando minutos
        System.out.println(hAgora.plusHours(55));//adicionando horas
        System.out.println(hAgora.minus(55,ChronoUnit.HOURS));//retirando horas
        System.out.println(hAgora.getHour());
        System.out.println(hAgora.getMinute());
        System.out.println(hAgora.getSecond());
        System.out.println("===");

        System.out.println("LocalDateTime para trabalhar com calendario completo");
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);
        System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));//passando string
        System.out.println(agoraCompleto.plusYears(50));//adicionando anos
        System.out.println("===");

        System.out.println("ZondId para consultar o fuso");
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);









    }
}
