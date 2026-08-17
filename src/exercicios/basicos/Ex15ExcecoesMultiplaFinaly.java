package exercicios.basicos;

public class Ex15ExcecoesMultiplaFinaly {
    public static void main(String[] args) {

        int[] numeradores = {2, 4, 6, 8};
        int[] denominadores = {2, 0, 3};

        for (int i = 0; i < numeradores.length; i++) {
            try {
                System.out.printf("%d / %d = %d%n", numeradores[i], denominadores[i], numeradores[i] / denominadores[i]);
            } catch (ArithmeticException e) {
                System.out.println("Divisão por zero.");
            } catch(Throwable e){
                System.out.println("Encontrado erro.");
            } finally {
                System.out.println("Essa linha vai ser impressa depois do try e do catch.");
            }
        }
    }
}
