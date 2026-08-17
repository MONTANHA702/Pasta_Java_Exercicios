import java.util.Random;

public class ClasseRandom {
    public static void main(String[] args) {

        //existem 2 formas de gerar números aleatórios
        //Math
        //Classe Random

        System.out.println(Math.random());//gera aleatórios entre 0 e 1
        System.out.println(Math.floor(Math.random()*10)); //aleatórios entre 1 e 9, não se tem muito controle

        Random r = new Random();
        System.out.println(r.nextInt());//gerar aleatórios no limite do int
        System.out.println(r.nextInt(100));//entre 0 até 99
        System.out.println(r.nextInt(100+1));//entre 0 até 100


    }
}
