package revisao.Poo.Ex09PassandoObjetoComoArgumentos;

public class CalculadoraIMC {

    //criar uma classe Paciente e colocar como parametro
    IndiceMassaCorporal calcular(Paciente paciente) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }
}
