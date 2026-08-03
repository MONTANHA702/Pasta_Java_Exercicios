package ex05metodosblocossincronizados;

public class Calculadora {

    private int soma;

    //synchronized permite que apenas uma thread acesse por vez, impedindo que os resultados sejam compartilhados gerando erro
    public synchronized int somaArray(int[] array){
        soma = 0;
        for(int i = 0; i < array.length; i++){
            soma = soma + array[i];
            System.out.println("Executando a soma " + Thread.currentThread().getName() + " somando o valor " + array[i] +
                    " com total de " + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
