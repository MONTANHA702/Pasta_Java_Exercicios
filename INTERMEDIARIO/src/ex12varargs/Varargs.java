package ex12varargs;

public class Varargs {
    public static void main(String[] args) {

        System.out.println("Soma com 2 elementos declarados");
        System.out.println(soma(3, 4));
        System.out.println("Soma com 3 elementos declarados");
        System.out.println(soma(3, 4, 15));
        System.out.println("Soma dos elementos dos vetores (sabe-se quantos elementos)");
        int[] vetor = {1, 3, 5, 7, 9};
        System.out.println(soma(vetor));
        System.out.println("varargs, quando não se sabe o número de elementos");
        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //note que como já existe metodo para 3 elementos, o java considera varargs a partir do quarto

    }

    static int soma(int a, int b){
        return a+b;
    }
    static int soma(int a, int b, int c){
        return a+b+c;
    }

    static int soma(int[] vetor){
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }

    //varargs
    static int soma(Integer... vetor){//note a classe wrapper
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }
}
