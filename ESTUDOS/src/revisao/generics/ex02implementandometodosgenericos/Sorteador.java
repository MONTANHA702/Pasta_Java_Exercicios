package revisao.generics.ex02implementandometodosgenericos;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();

    //tipo parametrizado, tornando o metodo generico
    //pode colocar quantos parametros quiser dentro do <>
    public static <T> T sortear(T[] objetos) {
        if(objetos.length == 0) {
            throw new IllegalArgumentException("Minimo 1 objeto requerido");
        }
         int posicao = RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }
}
