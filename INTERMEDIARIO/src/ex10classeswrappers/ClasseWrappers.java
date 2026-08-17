package ex10classeswrappers;

public class ClasseWrappers {
    public static void main(String[] args) {
        //O java não é uma linguagem 100% orientada a objetos
        //Ele possui 8 tipos primitivos
        //Classes Wrappers são aquelas que representam os tipos primitivos

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000L;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean num7 = true;
        char a = 'a';

        //para representar esses tipos primitivos tem-se as classes:

        Short num8 = (short) 1; //temos que fazer o casting (short)
        Byte num9 = (byte) 10;
        Integer num10 = 100;
        Long num11 = 1000L;
        Float num12 = 3.5f;
        Double num13 = 3.5555;
        Boolean num14 = true;
        Character a2 = 'a';


        //Essas classes wrappers possuem métodos

        //vamos transformar um float num double

        Double numero = num12.doubleValue();
        System.out.println(num12 + " - " + num12.getClass().getSimpleName()); //3.5 Float
        System.out.println(numero +" - " + numero.getClass().getSimpleName()); //3.5 Double
        System.out.println("=======");

        //String em Integer

        String mil = "1000";
        Integer milInt = Integer.parseInt(mil);
        System.out.println(mil + " - " + mil.getClass().getSimpleName());
        System.out.println(milInt + " - " + milInt.getClass().getSimpleName());
        System.out.println("========");

        //transformar primitivo em Wrapper

        int numero2 = 12345;
        Integer numero3 = numero2;
        System.out.println(numero3 + " - " + numero3.getClass().getSimpleName());










    }
}
