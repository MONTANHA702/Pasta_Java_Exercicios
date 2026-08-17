public class Ex08juntandoseparandostrings {
    public static void main(String[] args) {

        //.join() une strings
        String alfabeto = String.join(", ", "abc", "def", "ghi");
        System.out.println(alfabeto);
        System.out.println("====");
        String alfabeto2 = String.join("-", "abc", "def", "ghi");
        System.out.println(alfabeto2);
        System.out.println("====");
        String alfabeto3 = String.join("", "abc", "def", "ghi");
        System.out.println(alfabeto3);
        System.out.println("====");

        //.split() faz o fatiamento retirando algo
        System.out.println("Usando o split");
        System.out.println(alfabeto2);
        String[] letras = alfabeto2.split("-");
        for (String letra : letras) {
            System.out.print(letra);
        }
        System.out.println();

        String arara = "arara";
        String[] araraSemA = arara.split("a");
        for (String a : araraSemA) {
            System.out.print(a);
        }
    }
}
