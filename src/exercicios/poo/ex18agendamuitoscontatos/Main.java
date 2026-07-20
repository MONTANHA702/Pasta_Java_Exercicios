package exercicios.poo.ex18agendamuitoscontatos;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato contato = new Contato();
        contato.setNome("Maria");
        contato.setTelefone("55555-4444");
        contato.setEmail("maria@gmail.com");


        Contato contato2 = new Contato();
        contato2.setNome("Joao");
        contato2.setTelefone("55555-2222");
        contato2.setEmail("joao@gmail.com");

        Contato contato3 = new Contato();
        contato3.setNome("Jaja");
        contato3.setTelefone("55555-1111");
        contato3.setEmail("jaja@gmail.com");

       Contato[] contatos = new Contato[3];
        contatos[0] = contato;
        contatos[1] = contato2;
        contatos[2] = contato3;

        agenda.setContatos(contatos);

        if (contatos != null && agenda.getContatos() != null ) {
            for (Contato c : agenda.getContatos()) {
                System.out.println(c.getNome()+" "+c.getTelefone()+" "+c.getEmail());
            }
        }

    }
}
