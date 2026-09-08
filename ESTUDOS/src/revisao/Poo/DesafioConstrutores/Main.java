package revisao.Poo.DesafioConstrutores;

public class Main {
    public static void main(String[] args) {

        Participante participante1 = new Participante("José");
        Participante participante2 = new Participante("Maria", 250);

        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontos);
        System.out.println("==========");
        System.out.println(participante2.nome);
        System.out.println(participante2.saldoDePontos);
    }
}
