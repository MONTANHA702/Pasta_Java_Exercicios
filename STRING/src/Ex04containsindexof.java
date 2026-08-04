public class Ex04containsindexof {
    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";

        //.indexOf() - colocar o parametro que deve procurar
        //se ele não existir retorna -1, se existir retorna o index da PRIMEIRA OCORRENCIA

        System.out.println("Procurando um caracter inexistente em banana");
        System.out.println(banana.indexOf('x'));
        System.out.println("=====");
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));
        System.out.println(banana.indexOf(ana));

        //.lastIndexOf() retorna a ULTIMA OCORRENCIA DA STRING
        System.out.println(banana.lastIndexOf("a"));//5
        System.out.println(banana.lastIndexOf("n"));//4

        //.contains() retorna booleano
        System.out.println(banana.contains("na"));//true
        System.out.println(banana.contains("ceu"));//false




    }
}
