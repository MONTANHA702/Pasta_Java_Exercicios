package ex08enumcomatributos;

public class Main {
    public static void main(String[] args) {

        System.out.println("== Distância dos Planetas ==");
        for (Planeta planeta : Planeta.values()) {
            System.out.println(planeta + " está a "+ planeta.getDistanciaSol() + " milhões de Km do Sol.");
        }
    }
}
