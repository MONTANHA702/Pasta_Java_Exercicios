package revisao.Poo.Ex07RefatorandoOexercicioEx06;

public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceCorporal() {
        IndiceMassaCorporal imcMetodo = new IndiceMassaCorporal();
        imcMetodo.resultado = peso / (altura * altura);
        imcMetodo.altura = altura;
        imcMetodo.peso = peso;

        return imcMetodo;
    }
}
