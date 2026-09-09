package revisao.poo.desafiopacotesemodificadoresacesso.br.com.algamilhas;

public class Main {
    public static void main(String[] args) {

        Participante participante1 = new Participante("Manuel");
        Participante participante2 = new Participante("Laranja");

        participante1.creditarPontos(300);

        participante1.mostrarStatus();
        participante2.mostrarStatus();


    }
}
