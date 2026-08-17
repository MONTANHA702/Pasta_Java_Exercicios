public class Ex09stringbuffer {
    public static void main(String[] args) {

        //jeito antigo usando loop for
        //esse método consome muita memória pois cada iteração cria um novo espaco de memoria
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        String alfabeto = "";
        /*for(String letra : letras){
            alfabeto += letra;
        }
        System.out.println(alfabeto);
*/
        System.out.println("===");

        //usando StringBuffer() ele cria um espaço temporário para guardar dados
        //dessa forma usa-se para grande quantidade de dados ex um vetor com 10000 elementos
        StringBuffer sb = new StringBuffer();
        for(String letra : letras){
            sb.append(letra);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);

        //o buffer sb serve para muitas coisas
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.capacity());


        //StringBuilder faz a mesma coisa
        //A diferença entre eles que que StringBuffer é THREAD SAFER, isto é nao dá problema com
        //threads


    }

}
