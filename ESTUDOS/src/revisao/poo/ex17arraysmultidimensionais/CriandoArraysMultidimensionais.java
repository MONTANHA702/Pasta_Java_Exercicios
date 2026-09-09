package revisao.poo.ex17arraysmultidimensionais;

import java.util.Arrays;

public class CriandoArraysMultidimensionais {

    public static void main(String[] args) {
        //array de arrays
        String[][] cidades = new String[3][3];
        cidades[0][0] = "Goiânia";
        cidades[1][1] = "Brasília";
        cidades[2][2] = "São Paulo";


        //mostra em formato de matriz
        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j <cidades[i].length ; j++) {
                System.out.printf("%-15s",cidades[i][j]);
            }
            System.out.println();
            
        }

        //forma reduzida
        System.out.println("====================");
        for(String[] nomeCidades : cidades) {
            for(String cidade : nomeCidades) {
                System.out.println(cidade);
            }
        }
        //mostra em linha
        System.out.println("______________________");
        System.out.println(Arrays.deepToString(cidades));

    }

}
