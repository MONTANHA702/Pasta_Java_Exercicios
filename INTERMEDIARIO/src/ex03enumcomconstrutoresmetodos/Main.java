package ex03enumcomconstrutoresmetodos;

public class Main {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEXTA;
        System.out.println(dia.toString() + " - " + dia.getValor());

        //Terá uma resposta tipo: SEXTA - 6
        //Isso importa para um banco de dados onde pode imprimir SEXTA e guardar 6.

        Data data = new Data(1, 4, 2026, DiaSemana.SEXTA);
        System.out.println("DIA: " + data.getDia() +" "+
                "\nMÊS: " + data.getMes() +
                "\nANO: "+data.getAno()+
                "\nDIA DA SEMANA: "+ data.getDiaSemana());

    }
}
