package revisao.excecoes.ex1introducao;
//a exceção, se não for tratada
//quebra (em tempo de execução) o funcionamento
//do programa. Devem ser tratadas

//exemplo 1 - ArithmeticException
public class Main1 {
    public static void main(String[] args) {

        System.out.println("Iniciando o programa");

        int x = 10 / 0;

        System.out.println("Finalizando o programa");
    }
}
