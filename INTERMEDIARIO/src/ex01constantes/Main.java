package ex01constantes;

public class Main {
    public static void main(String[] args) {

        usandoConstantes();

    }

    private static void usandoConstantes() {

        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("== Teste utilizando constantes no Java ==");
        //imprimirDiaSemana(DiaSemanaConstantes.DOMINGO);
        imprimirDiaSemana(domingo);
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
    }

    public static void imprimirDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda_feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta_feira");
                break;
            case 5:
                System.out.println("Quinta_feira");
                break;
            case 6:
                System.out.println("Sexta_feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
}
