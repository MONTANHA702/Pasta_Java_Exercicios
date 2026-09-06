package revisao.Poo.Ex19InformacaoMemoria;

public class Teste {
    public static void main(String[] args) {

        imprimirUsoMemoria();

        //teste
        byte[] memoria = new byte[500*1024*1024]; //500MB

        imprimirUsoMemoria();

    }

    static void imprimirUsoMemoria() {
        //Memoria maxima que a JVM pode usar
        System.out.printf("Máxima: %d%n", Runtime.getRuntime().maxMemory()/(1024*1024));

        //Memoria empenhada no momento
        System.out.printf("Empenhada: %d%n",
                Runtime.getRuntime().totalMemory()/(1024*1024));

        //Memoria disponível do que ja foi reservado
        System.out.printf("Disponivel: %d%n",
                Runtime.getRuntime().freeMemory()/(1024*1024));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Usada: %d%n", memoriaUsada/(1024*1024));

        System.out.println("======================");

    }



}
