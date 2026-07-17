package exercicios.poo.ex15juroscompostosformula;

public class JurosCompostosF {

    public static double montante(double capital, double taxa, int periodo){

         return capital*Math.pow(1+taxa, periodo);
    }
}
