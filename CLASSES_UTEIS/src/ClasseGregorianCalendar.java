import java.util.Calendar;
import java.util.GregorianCalendar;

//apesar da semelhança  essas classes tem algumas diferencas nos métodos
//por exemplo o .isLeapYear() que retorna um boolean para ano bisexto que só tem no Gregorian

public class ClasseGregorianCalendar {
    public static void main(String[] args) {

        //A classe gregorian calendar é uma subclasse da classe calendar
        //como ela não é uma classe padrão singleton ela pode ser instanciada com new
        GregorianCalendar hoje  = new GregorianCalendar();
        //System.out.println(hoje);//saída similar ao Calendar
        imprimirData(hoje);


    }
    private static void imprimirData(Calendar hoje) {

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);

        System.out.printf("Data: %02d/%02d/%d - %02d:%02d:%02d%n", dia, mes, ano, hora, minuto, segundo);

    }
}
