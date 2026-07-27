package ex02enum;

public class Main {
    public static void main(String[] args) {

        usandoEnum();

    }

    private static void usandoEnum() {

        DiaSemana domingo = DiaSemana.DOMINGO;
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;

        System.out.println("== Teste utilizando Enum no Java ==");
        //imprimirDiaSemana(DiaSemana.DOMINGO);
        imprimirDiaSemana(domingo);
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
    }


    public static void imprimirDiaSemana(DiaSemana dia) {
        switch (dia) {
            case DOMINGO:
                System.out.println("Domingo");
                break;
            case SEGUNDA:
                System.out.println("Segunda_feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta_feira");
                break;
            case QUINTA:
                System.out.println("Quinta_feira");
                break;
            case SEXTA:
                System.out.println("Sexta_feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
        }
    }
}
