package revisao.poo.ex22classeimutavel;

public class Main {
    public static void main(String[] args) {
        Horario hora1 = new Horario(12, 45);
        hora1.formatar();


        HorarioRecords hora2 = new HorarioRecords(10, 25);
        System.out.println(hora2.formatando());

    }


}
