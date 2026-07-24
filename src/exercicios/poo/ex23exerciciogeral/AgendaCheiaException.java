package exercicios.poo.ex23exerciciogeral;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
