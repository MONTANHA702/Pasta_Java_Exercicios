public class Ex05concat {
    public static void main(String[] args) {

        String teste = "Isso é um teste.";
        System.out.println(teste);

        //.substring() retorna parte da string
        //o parametro é um index de início e/ou fim
        System.out.println(teste.substring(10));//teste.
        System.out.println(teste.substring(10, 15));//teste (sem o ponto)

        //.concat() concatena strings, é pouco usado pois concatenar com + é mais prático
        String ola = "Olá";
        String mundo = " mundo!";
        System.out.println(ola + mundo);//mais usual
        System.out.println(ola.concat(mundo));

        //.replace() e replaceAll()
        String espacos = "i s p a c o s";
        String semEspacos = espacos.replace("i", "e");//troca a vogal
        System.out.println(semEspacos);
        String semEspacos2 = semEspacos.replaceAll(" ", "");//retira todos os espacos
        System.out.println(semEspacos2);

        //.trim() remove os espacos adicionais
        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());


    }
}
