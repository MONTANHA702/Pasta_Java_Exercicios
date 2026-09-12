package revisao.poo.ex22classeimutavel;

//classes imutáveis não permitem a modificação dos valores do objeto
//quando quero mudar o valor tenho que instanciar um novo objego
//classe imutável necessita da palavra final.
//instancias com final
//retirar os setters

public final class Horario {

    private final int hora;
    private final int minuto;

    public Horario(int hora, int minuto) {
        if(hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void formatar() {
        System.out.printf("%dh %dm%n", getHora(), getMinuto());
    }

}
