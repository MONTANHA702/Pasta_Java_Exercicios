package revisao.excecoes.ex1introducao;

//exemplo 2 - ArrayIndexOutOfBoundsException
public class Main2 {
    public static void main(String[] args) {

        System.out.println("Iniciando o programa");

        int[] numeros = {1, 3, 5, 7};
        System.out.println(numeros[10]);

        System.out.println("Finalizando o programa");
    }
}
