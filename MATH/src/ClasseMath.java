public class ClasseMath {
    public static void main(String[] args) {

        System.out.println(Math.pow(2, 3));//eleva o primeiro ao segundo

        System.out.println(Math.round(4.7));//se for acima do .5 arredonda para cima

        System.out.println(Math.round(4.4));//se for abaixo do .5 arredonda para baixo

        System.out.println(Math.ceil(4.4));//arredonda para o próximo inteiro

        System.out.println(Math.ceil(4.7));//arredonda para o proximo inteiro

        System.out.println(Math.floor(4.7));//arredonda para o anterior inteiro

        System.out.println(Math.floor(4.4));//arredonda para o anterior inteiro

        System.out.println(Math.random());//numero aleatório entre 0 e 1

        System.out.println(Math.round(Math.random()*10));//numero aleatório entre 1 e 10

        System.out.println(Math.round(Math.random()*100));//numero aleatório entre 1 e 100


        //O Java não tem precisão para trabalhar com números
        //Para aplicações financeiras ou outras que exigem cálculos precisos
        //usa-se por exemplo BigNumber ou BigDecimal









    }
}
