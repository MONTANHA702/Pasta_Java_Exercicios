package exercicios.poo.ex14juroscompostosrecursivo;

public class JurosCompostos {

   public static double montante(double capital, double taxa, int periodo){

       if (periodo == 0){
           return capital;
       }
       return montante(capital, taxa, periodo-1)*(1+taxa);
   }
}
