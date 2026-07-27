package ex03enumcomconstrutoresmetodos;

public enum DiaSemana {

    DOMINGO(1), SEGUNDA(2),  TERCA(3),
    QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    private int valor;

    //Construtores em enum não tem modificadores de acesso

    DiaSemana(int valor) {
        this.valor = valor;
    }

    //Getter
    public int getValor() {
        return valor;
    }
}
