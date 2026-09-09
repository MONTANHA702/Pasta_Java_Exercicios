package revisao.poo.ex18varargs;

public class Main {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_234_200.43;


       ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
        //criando um array
       //String[] emailsCobranca = {"jaja@gmail.com", "mama@gmail.com"};

        //instanciando direto
        //servicoDeCobranca.pagar(fatura, new String[]{"jaja@gmail.com", "mama@gmail.com"});

        //sem emails
        //servicoDeCobranca.pagar(fatura, new String[]{});
        //servicoDeCobranca.pagar(fatura, new String[0]);

        //varargs
        //no varargs pode colocar zero ou varios emails, sem instanciar o array
        //
        servicoDeCobranca.pagar(fatura, "jaja@gmail.com");




    }
}
