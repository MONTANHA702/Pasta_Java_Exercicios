package revisao.strings.ex05regex;

public class ValidadorEmail {

    public  static boolean validar(String email) {
        return email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");
        //[\w.-]+ lista de letras e numeros minusculos um ou mais (+) mais . e -
        // @ caractere @
        // [a-z\d.-]+ lista de letras minusculas e numeros(\d) mais . e -
        // \. ponto
        // [a-z]{2,3} lista de letras minusculas min 2 max 3
    }
}
