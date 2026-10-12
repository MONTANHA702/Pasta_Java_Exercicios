package revisao.strings.ex04transformando;

public class Strip {
    public static void main(String[] args) {

        String nome = "\n    Pedro    ";
        System.out.println("<" + nome + ">");

        //System.out.println(nome.strip());//a partir do Java 11
        //System.out.println(nome.trim());//mais antigo, não remove caracteres de outros alfabetos

        //variações
        System.out.println(nome.stripLeading());
        System.out.println(nome.stripTrailing());

    }

}
