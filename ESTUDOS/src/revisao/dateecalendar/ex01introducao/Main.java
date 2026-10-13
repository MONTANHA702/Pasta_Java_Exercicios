package revisao.dateecalendar.ex01introducao;

//é uma API legada com muitos metodos depreciados
//não recomendada para novos projetos

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis);

        double diferencaHoras = diferencaMillis / 1000 / 60 / 60d;

        System.out.printf("Diferença em horas: %.2f%n", diferencaHoras);

        System.out.printf("Depois: %b%n", hoje.after(ontem));
        System.out.printf("Antes: %b%n", hoje.before(ontem));
        System.out.printf("Comparação: %d%n", hoje.compareTo(ontem));


        //System.out.println(data.getDay());
        //System.out.println(data.getYear());

    }
}
