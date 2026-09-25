package revisao.poo.ex27interfaces2;
//essa classe abstrata foi criada para inserir uma regra
//criada posteriormente para toda empresa
//que a taxa de juros para empresa será 0.8
public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel{

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 0.8;
    }
}
