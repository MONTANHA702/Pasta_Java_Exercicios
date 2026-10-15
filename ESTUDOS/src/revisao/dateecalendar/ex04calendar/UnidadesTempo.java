package revisao.dateecalendar.ex04calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UnidadesTempo {
    public static void main(String[] args) throws ParseException {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Data de aniversário: ");
        String dataAniversarioTexto = sc.nextLine();

        //pego a String (dataAniversárioTexto) e atribuo a um Date
        Date dataAniversario = formatador.parse(dataAniversarioTexto);

        //pego o Date (dataAniversario) e transformo num calendar
        Calendar calendar = Calendar.getInstance();//pega este exato momento
        calendar.setTime(dataAniversario);//mudo por meio do setTime o momento
        System.out.println(calendar.getTime());


        //agora posso usar os metodos do Calendar
        if(calendar.get(Calendar.MONTH) == Calendar.DECEMBER &&
        calendar.get(Calendar.DAY_OF_MONTH) ==25) {
            System.out.println("Você nasceu no Natal.");
        } else if(calendar.get(Calendar.DAY_OF_YEAR) == 256) {
            System.out.println("Voc6e nasceu no dia do Programador");
        }


    }
}
