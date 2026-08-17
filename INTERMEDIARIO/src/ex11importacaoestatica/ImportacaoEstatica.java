package ex11importacaoestatica;

//3 - para isso fazemos a importação estática da classe

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//4 - pode fazer a importação estática de todo o pacote Math mas não é uma boa prática
// porque deixa muito abrangente

//import static java.lang.Math.*;


public class ImportacaoEstatica {
    public static void main(String[] args) {

        double a = 5;
        double b = 8;
        double c = 2;

        System.out.println(Math.pow(a,b)); //1 - Math é um classe estatic, por isso não precisamos instanciar
        System.out.println(Math.sqrt(a)); //2 - mas se for usar bastante, escrever Math pode poluir visualmente.
        System.out.println("=====");

        System.out.println(pow(a,b)); //5 - após o import estatico, não precisa mais do Math.
        System.out.println(sqrt(a));
        System.out.println(sqrt(c));
    }
}
