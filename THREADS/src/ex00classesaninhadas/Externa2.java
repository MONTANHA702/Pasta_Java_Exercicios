package ex00classesaninhadas;

public class Externa2 {
    //classe local é aquela que está dentro de um método

    public void metodoQualquer(){

        class ClasseLocal{
            private String texto = "Texto da classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }
        //instancio e chamo o método da classe local no método qualquer da classe Externa2
        ClasseLocal local = new ClasseLocal();
        local.imprimeTexto();
    }

    public static void main(String[] args) {
        //quando eu instanciar a classe Externa2 e chamar o métodoQualquer ele imprime o texto local
        Externa2 externa2 = new Externa2();
        externa2.metodoQualquer();
    }

}
