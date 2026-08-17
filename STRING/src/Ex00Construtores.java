public class Ex00Construtores {
    public static void main(String[] args) {

        String vazia = new String(); //""
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] java2 = {'J', 'A', 'V', 'A'};
        System.out.println(java2);

        char[] abcde = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcde, 0, 3);
        System.out.println(abc);

        byte[] ascii = {65, 66,67,68};
        String abcd = new String(ascii);
        System.out.println(abcd);

        String bcd = new String(ascii, 1, 3);
        System.out.println(bcd);

        String java3 = "JAVA";
        String java4 = "java";
        System.out.println(java3);
        System.out.println(java4);

    }
}
