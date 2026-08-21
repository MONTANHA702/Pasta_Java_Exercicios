package revisao.Poo.Ex06MetodoRetornaObjeto;

public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularImc() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;


    }
}
