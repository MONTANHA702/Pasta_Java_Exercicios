package revisao.apidatetime.instant;

//API a partir do Java 8
//armazena o timestemp que armazena o tempo em milisegundos desde 0h de 0101/1970
//possui metodos que contam o tempo em seg e miliseg desde sua criação
//USA-SE ESSA CLASSE PARA SABER EXATAMENTE O MOMENTO, EX.: REGISTRAR UM EVENTO

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant instante = Instant.now();//data de agora em zulutime
        System.out.println(instante);
        separador();

        System.out.println(instante.toEpochMilli());//todos os miliseg desde 1970
        System.out.println(System.currentTimeMillis());//faz a mesma coisa
        separador();




    }

    private static void separador() {
        String sep = "=".repeat(15);
        System.out.println(sep);
    }
}
