public class Externa {

    private String texto = "Texto Externo";

    public class Interna {
        private String texto = "Texto Interno";
        public void verTexto() {
            System.out.println(texto);
            System.out.println(Externa.this.texto);
        }
    }

    public static void main(String[] args) {
         Externa ex = new Externa();
         Interna interna = ex.new Interna();

         interna.verTexto();
    }

}
