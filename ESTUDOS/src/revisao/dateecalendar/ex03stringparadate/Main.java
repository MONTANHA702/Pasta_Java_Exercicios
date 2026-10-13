package revisao.dateecalendar.ex03stringparadate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        String dataTexto = "13/10/2026";

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatador.parse(dataTexto);

        System.out.println(data);




    }
}
