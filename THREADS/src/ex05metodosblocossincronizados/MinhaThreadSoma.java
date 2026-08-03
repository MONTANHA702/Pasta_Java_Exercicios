package ex05metodosblocossincronizados;

public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] numeros;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this, nome).start();
        //Thread t = new Thread(this, nome);
        // t.start()
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciando...");
        int soma = calc.somaArray(this.numeros);
        System.out.println("Resultado da soma para trhead " + this.nome + " : " + soma);
        System.out.println(this.nome + " finalizando...");
    }
}
