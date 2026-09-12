package revisao.poo.ex22classeimutavel;

//records ajuda a enxugar o código nas classes imutáveis

public record HorarioRecords(int hora, int minuto) {
//ele já traz um construtor padrão, só é necessário fazer caso deseje validar
    public HorarioRecords {
        if(hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
    }

    public String formatando() {
        return String.format("%dh %dm", hora(), minuto());
    }

}
