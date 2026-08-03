import java.util.Arrays;

public class Ex02Metodos {
    public static void main(String[] args) {

        String java = "Java";


        //.charAt() percorre toda a string elemento por elemento
        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        //.getChars() pega os chars da string
        char[] jav = new char[3];
        //inicio, fim(exclui), a string, onde começa
        java.getChars(0, 3, jav, 0);
        System.out.println(jav);

        // .getBytes() escreve as char no código ascii
        byte[] javBytes = new byte[3];
        java.getBytes(0, 3, javBytes, 0);
        System.out.println(Arrays.toString(javBytes));

        //.toCharArray() retorna a string como um conjunto de chars
        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);


    }
}
