package revisao.dateecalendar.ex04calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ComparandoDatas {
    public static void main(String[] args) {

        Calendar minhaDataNascimento = new GregorianCalendar(1972, Calendar.FEBRUARY, 9);

        Calendar dataNascimentoAlguem = new GregorianCalendar(1983, Calendar.SEPTEMBER, 19);

//        if(minhaDataNascimento.before(dataNascimentoAlguem)) {
//            System.out.println("Eu sou mais velho");
//        } else if (minhaDataNascimento.after(dataNascimentoAlguem)) {
//            System.out.println("Eu sou mais novo");
//        }  else {
//            System.out.println("Nascemos no mesmo dia");
//        }

        if (minhaDataNascimento.compareTo(dataNascimentoAlguem) < 0) {//minhaDataNascimento anterior retorna 1
            System.out.println("Eu sou mais velho");
        }
        if(minhaDataNascimento.compareTo(dataNascimentoAlguem) > 0) {
            System.out.println("Eu sou mais novo");
        }
        if(minhaDataNascimento.compareTo(dataNascimentoAlguem) == 0) {
            System.out.println("Nascemos no mesmo dia");
        }
    }
}
