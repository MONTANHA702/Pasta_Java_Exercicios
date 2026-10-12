package revisao.strings;

public class MainStringBuilder {
    public static void main(String[] args) {

        long tempoInicial = System.currentTimeMillis();

        //String texto = "";
        StringBuilder sb = new StringBuilder(210_000);

        for (int i = 0; i <= 200_000; i++) {
            sb.append("#");
        }

        double tempoTotal = (System.currentTimeMillis() - tempoInicial) / 1000d;
        System.out.println(tempoTotal);
    }
}
