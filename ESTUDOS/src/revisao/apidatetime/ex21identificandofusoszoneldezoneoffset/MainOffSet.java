package revisao.apidatetime.ex21identificandofusoszoneldezoneoffset;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class MainOffSet {
    public static void main(String[] args) {

        System.out.println("O método .of já identifica a classe de acordo " +
                "com o parâmetro passado.");
        ZoneId offset1 = ZoneId.of("America/Sao_Paulo");
        System.out.println(offset1);
        System.out.println(offset1.getClass());
        System.out.println("======");
        ZoneId offset2 = ZoneId.of("-08:00");
        System.out.println(offset2);
        System.out.println(offset2.getClass());

        //outras formas
        System.out.println("===========");
        ZoneId offset3 = ZoneOffset.ofHours(-3);
        System.out.println(offset3);
    }
}
