package revisao.poo.ex27interfaces2;

public abstract class Empresa {

    private String razaoSocial;
    private double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }


    public double getTotalFaturamento() {
        return totalFaturamento;
    }


}
