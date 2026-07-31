package ex01introducaothreads;

public class Main {
    public static void main(String[] args) {

        MinhaThread minhaThread = new MinhaThread("Thread #1", 1000);

        //minhaThread.start(); para não ficar sempre solicitando start, melhor deixar no construtor

        MinhaThread minhaThread2 = new MinhaThread("Thread #2", 500);

        MinhaThread minhaThread3 = new MinhaThread("Thread #3", 100);
    }
}
