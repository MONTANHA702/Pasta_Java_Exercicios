package ex04enumvaluevalueof;

public class Main {
    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();
        for (int i = 0; i<dias.length; i++) {
            System.out.println(dias[i]);
        }
        System.out.println("========");

        for(DiaSemana dia: dias){
            System.out.println(dia);
        }


    }
}
