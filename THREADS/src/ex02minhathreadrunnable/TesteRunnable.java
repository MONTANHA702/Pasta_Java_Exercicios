package ex02minhathreadrunnable;

//esse programa java é um processo que tem 2 threads funcionando dentro dele
public class TesteRunnable {
    public static void main(String[] args) {

        MinhaThreadRunnable runnable1 = new MinhaThreadRunnable("Runnable #1", 500);
        //Thread t1 = new Thread(runnable1); //passar para o construtor
        //t1.start(); //passar para o construtor

        MinhaThreadRunnable runnable2 = new MinhaThreadRunnable("Runnable #2", 1000);

    }
}
