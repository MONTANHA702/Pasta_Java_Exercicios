package revisao.excecoes.ex07naoengulaexcecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String texto) {


        Path arquivo = Path.of("/Users/jadersantos/Desktop/pastaJava", codigo + ".txt");

        try {
            Files.writeString(arquivo, texto);
            System.out.printf("Arquivo %s foi criado com sucesso!\n", codigo);
        } catch (IOException e) {
            //tente nunca deixar a captura vazia
            //crie uma excecao com mensagem e rastro
            throw new ErroGravacaoException("Falha ao tentar executar a gravação", e);
        }
    }

}
