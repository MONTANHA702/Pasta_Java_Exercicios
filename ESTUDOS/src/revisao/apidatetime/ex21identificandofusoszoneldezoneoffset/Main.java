package revisao.apidatetime.ex21identificandofusoszoneldezoneoffset;

import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

        ZoneId zona1 = ZoneId.systemDefault();
        System.out.println(zona1);
        System.out.println(zona1.getClass());
        System.out.println(zona1.getClass().getSuperclass());
        System.out.println(zona1.getRules());

        ZoneId zona2 = ZoneId.of("America/Los_Angeles");//tz database
        System.out.println(zona2);
        System.out.println(zona2.getClass());
        System.out.println(zona2.getClass().getSuperclass());
        System.out.println(zona2.getRules());
        System.out.println("===============");

        //obtendo as zoneId
//        for (String zoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zoneId);
//        }


    }
}
