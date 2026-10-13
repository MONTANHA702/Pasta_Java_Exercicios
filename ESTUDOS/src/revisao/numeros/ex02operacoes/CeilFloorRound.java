package revisao.numeros.ex02operacoes;

public class CeilFloorRound {
    public static void main(String[] args) {

        double x = 100.4;
        double y = 100.5;

        //.ceil() arredonda para cima
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));


        //.floor() arredonda para baixo
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));

        //.round() até .4 arredonda p baixo, .5 em diante arredonda p cima
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));


    }
}
