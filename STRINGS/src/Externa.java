public class Externa {

    private String texto = "Texto Externo";

    public  static class Interna {
        private String texto = "Texto Interno";
        public void verTexto() {
            System.out.println(texto);
            System.out.println(this.texto); //se nao fosse estatic seria Externa.this.texto
        }
    }

    public static void main(String[] args) {
         Externa ex = new Externa();

         //se a classe Interna nao fosse estatic seria a sintaxe
        //Interna interna = ex.new Interna()
         Interna interna = new Interna();

         interna.verTexto();
    }

}
