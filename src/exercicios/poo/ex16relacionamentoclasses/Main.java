package exercicios.poo.ex16relacionamentoclasses;

public class Main {
    public static void main(String[] args) {

       Contato c1 = new Contato();
       c1.setNome("Joao");
       //c1.setTelefone("99999-9999");
       //c1.setEndereco("Brasilia"); //tipo String

        //Criar objeto endereco (relacionamento tem um)
        Endereco end = new Endereco();
        end.setEstado("DF");
        end.setCidade("Brasilia");
        end.setCep("72000-000");

        //trazer para o contato
        c1.setEndereco(end);


        //Criar objeto telefone (relacionamento tem um)
        Telefone telefone = new Telefone();
        telefone.setNumero("99999-999");
        telefone.setDdd("61");
        telefone.setTipo("Celular");

        c1.setTelefone(telefone);



        System.out.println(c1.getNome());
        //se o dev não tiver instanciado a classe Endereco vai dar erro daí proteger com if()
        if (c1 != null && c1.getEndereco() != null) {
            System.out.println(c1.getEndereco().getCidade());
        }
        if (c1 != null && c1.getTelefone() != null) {
            System.out.println(c1.getTelefone().getNumero());
        }


    }
}
