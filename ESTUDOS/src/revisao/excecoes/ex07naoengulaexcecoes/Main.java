package revisao.excecoes.ex07naoengulaexcecoes;

public class Main {
    public static void main(String[] args) {

        ServicoCadastroAnuncio servico = new ServicoCadastroAnuncio();
        servico.cadastrar("teste", "Sucesso");
        servico.cadastrar("cursoJava", "Olá, estudioso de Java!");

        System.out.println("Fim do programa");
    }
}
