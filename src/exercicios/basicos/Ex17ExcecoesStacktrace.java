package exercicios.basicos;

public class Ex17ExcecoesStacktrace {
    public static void main(String[] args) {

        int[] numeradores = {2, 4, 6, 8};
        int[] denominadores = {2, 0, 3};

        for (int i = 0; i < numeradores.length; i++) {
            try {
                System.out.printf("%d / %d = %d%n", numeradores[i], denominadores[i], numeradores[i] / denominadores[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage()); //imprime o tipo de exceção
                e.printStackTrace(); //indica qual a linha ocorreu
            }
        }

    }
}
