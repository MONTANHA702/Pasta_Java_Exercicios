package revisao.Poo.DesafioVarargs;

public class MainVarargs {

    public static void main(String[] args) {

        MediaNumerosVarargs mediaNumeros = new MediaNumerosVarargs();
        double media = mediaNumeros.calcularMedia(2, 19);
        System.out.printf("Média: %.2f%n", media);

    }
}
