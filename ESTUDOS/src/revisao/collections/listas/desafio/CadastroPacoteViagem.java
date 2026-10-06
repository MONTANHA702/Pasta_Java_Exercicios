package revisao.collections.listas.desafio;

import java.util.*;

public class CadastroPacoteViagem {

    //private final List<PacoteViagem> pacotes = new ArrayList<>();
    private final List<PacoteViagem> pacotes = new LinkedList<>();

    public void adicionar(String descricao, double precoDiaria ) {
       PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);
       if(pacotes.contains(pacote)) {
           throw new IllegalArgumentException("Pacote já existente.");
       }
        pacotes.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPreco() {
        pacotes.sort(new PrecoPacoteComparator().reversed());

    }

    public void removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem> pacoteViagemIterator = pacotes.iterator();
        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem pacote = pacoteViagemIterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
                removido = true;
            }

        }
        if(!removido) {
            throw new PacoteNaoEncontradoException("Pacote não encontrado");
        }
    }

//    public void removerPorDescricaoAlternativo(String descricao) {
//        boolean removido = pacotes.removeIf(pacote -> pacote
//                .getDescricao().equals(descricao));
//        if(!removido) {
//            throw new PacoteNaoEncontradoException("Pacote não encontrado");
//        }
//    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }
        throw new PacoteNaoEncontradoException("Pacote não encontrado");
    }


}
