package exercicios.basicos;


public class Ex09Tabuada {
    public static void main(String[] args) {
        //Tabuada de 7

        int n1 = 7;
        String linha = "=".repeat(10);

        System.out.println(linha);
        System.out.println("TABUADA DE 7");

        System.out.println(linha);
        for (int i =1; i <= 10; i++){
            int tabuada = n1 * i;
            System.out.printf("%d X %d = %d%n", n1, i, tabuada);

        }
        System.out.println(linha);
    }
}
