package exercicios.basicos.criandonossaexcecao;

public class NaoInteriroException extends Exception{

    protected int num;
    protected int denom;

    public NaoInteriroException(int num, int denom) {
        super();
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denom + " não é inteiro";
    }
}
