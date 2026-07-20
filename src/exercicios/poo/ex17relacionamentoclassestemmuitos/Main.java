package exercicios.poo.ex17relacionamentoclassestemmuitos;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Jader");
        //contato.setTelefone("22222-3333");

        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("61");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("61");
        telefone2.setNumero("88888-8888");

        //instanciar o array de telefones
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //fazer o set do array telefones
        contato.setTelefones(telefones);




        System.out.println(contato.getNome());

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }

        }

    }
}
