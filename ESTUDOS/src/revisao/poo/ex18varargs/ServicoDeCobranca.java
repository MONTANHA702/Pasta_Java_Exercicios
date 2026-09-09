package revisao.poo.ex18varargs;

import java.util.Objects;

public class ServicoDeCobranca {

    //void pagar(Fatura fatura, String[] emailsAdicionais)
    //void pagar(Fatura fatura, String... emailsAdicionais)
    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        //se for obrigatorio o email, colocar um antes do vararg
        //outra boa pratica é obrigar colocar os argumentos
        Objects.requireNonNull(fatura, "Obrigatório informar fatura.");
        Objects.requireNonNull(emailCobranca, "Obrigatório informar e-mail.");

        System.out.printf("Fatura %d, novalor total de R$ %.2f, foi paga.%n",
                fatura.numero, fatura.valorTotal);
        enviarNotificacao(fatura, emailCobranca);

        for(String email : emailsAdicionais) {
            enviarNotificacao(fatura, email);
        }
    }

    //para tratar o emailCobranca precisamos de um metodo interno
    private void enviarNotificacao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}
