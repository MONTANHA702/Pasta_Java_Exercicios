package revisao.Poo.DesafionumeroUtil;

public class NumeroUtil {

    static double descobrirMaiorNumero(double numero1, double numero2) {
        return numero1 > numero2 ? numero1 : numero2;
    }
    
    static double descobrirMaiorNumero(double numero1, double numero2, double numero3) {
       return descobrirMaiorNumero(descobrirMaiorNumero(numero1, numero2), numero3);
    }
}
