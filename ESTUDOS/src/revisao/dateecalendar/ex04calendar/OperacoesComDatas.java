package revisao.dateecalendar.ex04calendar;

import java.util.Calendar;

public class OperacoesComDatas {
    public static void main(String[] args) {

        //sempre instanciar com .getInstance()
        Calendar calendar = Calendar.getInstance();//momento atual

        //calendar.set(Calendar.DAY_OF_MONTH, 20); //altera o dia para 20

        //quero colocar o ultimo dia do mes
        int ultimoDiaMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //System.out.println(ultimoDiaMes); //31
        //calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaMes);

        //somar
        //calendar.add(Calendar.DAY_OF_MONTH, 3);//adiciono 3 dias
        calendar.add(Calendar.DAY_OF_MONTH, -3);//subtraio 3 dias


        System.out.println(calendar.getTime());
    }
}
