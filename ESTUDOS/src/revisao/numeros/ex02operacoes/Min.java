package revisao.numeros.ex02operacoes;

public class Min {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;

        int z = Math.min(x, y);
        int z2 = Integer.min(x, y);

        System.out.println(z);
        System.out.println(z2);
    }
}
