package exercicios.basicos.criandonossaexcecao;

public class Main {
    public static void main(String[] args) {

        int[] numero = {4, 8, 16, 21, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numero.length; i++) {
            try {
                if (numero[i] % 2 != 0) {
                    throw new NaoInteriroException(numero[i], denom[i]);
                }
                System.out.println(numero[i] + "/" + denom[i] + " = " + numero[i] / denom[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteriroException e) {
                System.out.println("Aconteceu um erro.");
                e.printStackTrace();

            }
        }
    }
}
