public class PrimeiroProjeto {
        public static void main(String[] args) {

            System.out.println("Cartela da Mega-Sena...\n");

            int totalNumeros = 60;
            int numeroPorLinha = 10;
            System.out.println("==============");
            for (int i = 1; i <= totalNumeros; i++) {
                System.out.printf("%4d", i);

                if (i % numeroPorLinha == 0){
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("==============");

        }
}
