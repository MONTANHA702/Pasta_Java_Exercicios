package exercicios.poo.ex13somatoriorecursivo;

public class Somatorio {

    public static int soma(int n){
        if (n == 0){
            return 0;
        }
        return n + soma(n - 1);
    }
}
