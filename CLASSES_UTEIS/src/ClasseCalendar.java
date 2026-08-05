import java.util.Calendar;

public class ClasseCalendar {
    public static void main(String[] args) {

        //já existe um calendário instanciado no Java, portanto usa-se o getInstance()
        Calendar hoje = Calendar.getInstance();//padrão sigleton

        System.out.println(hoje);//observe que não é nada amigável

        //formas de simplificar os dados
        int ano = hoje.get(Calendar.YEAR);
        System.out.println("ANO " + ano);


        int mes = hoje.get(Calendar.MONTH);
        System.out.println("MES " + mes + " - equivale a AGOSTO");//MESES no Java comecam no 0
        System.out.println(Calendar.AUGUST);

        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        System.out.println("DIA " + dia);

        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        System.out.println("HORA " + hora);

        System.out.printf("Hoje é dia %d do mes %d do ano %d.%n", dia, (mes+1), ano);

        //adicionar dias em hoje
        hoje.add(Calendar.DAY_OF_MONTH, 5);//se quiser subtrair data coloca negativo
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
}
