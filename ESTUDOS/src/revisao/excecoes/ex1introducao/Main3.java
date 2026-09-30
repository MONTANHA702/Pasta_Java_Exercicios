package revisao.excecoes.ex1introducao;

//exemplo 3 - NullPointerException
public class Main3 {
    public static void main(String[] args) {

        System.out.println("Iniciando o programa");

        Double valor = null;
        valor.intValue();

        System.out.println("Finalizando o programa");
    }
}
