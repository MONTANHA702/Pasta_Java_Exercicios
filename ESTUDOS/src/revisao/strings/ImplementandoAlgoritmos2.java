package revisao.strings;

public class ImplementandoAlgoritmos2 {
    public static void main(String[] args) {

        //preencher com zeros ate ficar 10 algarismos
        long codigo = 19999999999933333L;
        String codigoFormatado = preecherComZeros(String.valueOf(codigo), '0', 10);
        System.out.println(codigoFormatado);


    }

    private static String preecherComZeros(String texto, char caracter, int tamanhoTotal) {
        if(texto.length() < 10){
            return String.valueOf(caracter).repeat(tamanhoTotal - texto.length()) + texto;
        } else {
            return texto;
        }

    }

}
