package ex03criandovariasthreads;

public class TesteThread2 {
    public static void main(String[] args) {

        MinhaThread minhaThread = new MinhaThread("Thread #1", 500);
        MinhaThread minhaThread2 = new MinhaThread("Thread #2", 700);
        MinhaThread minhaThread3 = new MinhaThread("Thread #3", 800);

        //como a instanciação da Thread foi tirada do construtor, coloco aqui
        Thread t1 = new Thread(minhaThread);
        Thread t2 = new Thread(minhaThread2);
        Thread t3 = new Thread(minhaThread3);

        t1.start();
        t2.start();
        t3.start();

        //ao inves do bloco while, coloco .join que vai garantir que cada thread seja executada completamente
        // antes de passar para o ultimo comando.

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
