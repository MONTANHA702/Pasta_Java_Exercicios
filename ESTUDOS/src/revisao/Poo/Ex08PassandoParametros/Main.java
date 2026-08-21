package revisao.Poo.Ex08PassandoParametros;

public class Main {
    public static void main(String[] args) {

        CalculadoraIMC imc = new CalculadoraIMC();
        double indiceImcPaciente = imc.calcular(94, 1.89);
        System.out.printf("IMC do Paciente: %.2f%n", indiceImcPaciente);
    }
}
