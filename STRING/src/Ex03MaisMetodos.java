public class Ex03MaisMetodos {
    public static void main(String[] args) {

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";

        //equals() é case sensitive
        System.out.println(ola.equals(ola2));//false
        System.out.println(ola.equals(ola3));//true

        //equalsIgnoreCase() ignora se é maiúsculo ou minúsculo
        System.out.println(ola.equalsIgnoreCase(ola2));//true

        //.endsWith() e .startsWith()
        String banana = "banana";
        System.out.println(banana.endsWith("ana"));//true
        System.out.println(banana.startsWith("ban"));//true

        //.compareTo(): tendo a e b, retorna -1 se a>b, 0 se a==b e 1 se a<b usado em Arraylist


    }
}
