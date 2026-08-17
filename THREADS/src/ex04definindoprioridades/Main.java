package ex04definindoprioridades;

import ex03criandovariasthreads.MinhaThread;

public class Main {
    public static void main(String[] args) {

        MinhaThread thread1 = new MinhaThread("#1", 500);
        MinhaThread thread2 = new MinhaThread("#2", 500);
        MinhaThread thread3 = new MinhaThread("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // note que as threads são executadas ao mesmo ciclo mas sempre em ordem diferente
        //para ajustar isso usamos .setPriority()
        //ele pode ser ajustado com valores de 1 (menor prioridade) a 10 (maior prioridade)

        //t1.setPriority(10);
        //t2.setPriority(5);
        //t3.setPriority(1);

        //pode-se usar constantes que já estão na thread
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);


        t1.start();
        t2.start();
        t3.start();



    }
}
