package revisao.apidatetime.ex23zonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime dataFestaAniversario = ZonedDateTime
                .parse("2023-09-19T20:00:00-03:00[America/Sao_Paulo]");
        System.out.println("Data hora da festa aqui: " + dataFestaAniversario);

        //Qual é esse horário em outro local?
        ZonedDateTime dataFestaLosAngeles = dataFestaAniversario.withZoneSameInstant(ZoneId
                .of("America/Los_Angeles"));
        System.out.println("Data hora da festa em Los Angeles: "+ dataFestaLosAngeles);


        //comparando
        System.out.println(dataFestaAniversario.equals(dataFestaLosAngeles));//false
        System.out.println(dataFestaAniversario.isEqual(dataFestaLosAngeles));//true


    }
}
