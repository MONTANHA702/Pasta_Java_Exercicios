package revisao.poo.desafioimplementandoheranca;

public class Main {
    public static void main(String[] args) {



        Programador novoProgramador = new Programador("José", 45);
        novoProgramador.setValorBonus(1200);
        novoProgramador.setValorHora(45);
        novoProgramador.calcularSalario(120);

        System.out.println(novoProgramador);



    }
}
