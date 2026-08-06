import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClasseSimpleDateFormat {
    public static void main(String[] args) {

        //jeito mais fácil de formatar datas
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yy");//buscar documentação para letras

        //colocando uma data
        //instanciar um Gregorian
        Calendar data = new GregorianCalendar(2026, 0, 5, 20, 34,30);

        System.out.println(simpleDate.format(data.getTime()));


        //transformando em string
        System.out.println("===");
        //data atual
        Date hoje = new Date();
        SimpleDateFormat simpleDate2 = new SimpleDateFormat("dd-MM-yy HH:mm:ss   z");
        System.out.println(simpleDate2.format(hoje.getTime()));//formato Date
        String d = simpleDate2.format(hoje);//formato String
        System.out.println("===");
        //String para Date
        String minhaData = "20/02/26";//a string tem que ser exatamente o padrao da instancia (simpleDate)
        try {
            Date minhaDataEmDate = simpleDate.parse(minhaData);
            System.out.println(minhaDataEmDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
