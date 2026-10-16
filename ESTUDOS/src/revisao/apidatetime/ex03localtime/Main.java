package revisao.apidatetime.ex03localtime;

import java.time.LocalTime;

//representa apenas um horário sem data e fuso-horário
//tem precisão de nanosegundos
//usada, por exemplo, para marcar a hora de início e término do expediente, hora de almoço etc


public class Main {
    public static void main(String[] args) {

        LocalTime horario = LocalTime.now();
        System.out.println(horario);

        LocalTime horaAlmoco = LocalTime.of(12, 0, 0);
        System.out.println("Hora almoco: " + horaAlmoco);
    }
}
