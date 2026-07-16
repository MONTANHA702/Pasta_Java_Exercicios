package exercicios.poo.ex12fibonacci;

public class MetodoFibonacciRecursivo {

    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
