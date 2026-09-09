package revisao.poo.ex06metodoretornaobjeto;

public class Paciente {

    double peso;
    double altura;

    //esse metodo retorna uma CLASSE (IndiceMassaCorporal)
    IndiceMassaCorporal calcularImc() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;


    }
}
