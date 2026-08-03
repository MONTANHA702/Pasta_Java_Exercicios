package ex03criandovariasthreads;

public class TesteThread1 {
    public static void main(String[] args) {

        MinhaThread minhaThread = new MinhaThread("Thread #1", 500);
        MinhaThread minhaThread2 = new MinhaThread("Thread #2", 500);
        MinhaThread minhaThread3 = new MinhaThread("Thread #3", 500);

        //como a instanciação da Thread foi tirada do construtor, coloco aqui
        Thread t1 = new Thread(minhaThread);
        Thread t2 = new Thread(minhaThread2);
        Thread t3 = new Thread(minhaThread3);

        t1.start();
        t2.start();
        t3.start();

        //inserido um bloco while para que a mensagem seja executada somente após as threads
        //imagina com 200 threads qual o tamanho da lógica!!

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            try {
                Thread.sleep(200);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado");
    }
}
