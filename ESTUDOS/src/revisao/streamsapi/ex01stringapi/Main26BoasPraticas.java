package revisao.streamsapi.ex01stringapi;

import java.util.ArrayList;
import java.util.List;

public class Main26BoasPraticas {
    public static void main(String[] args) {

        CadastroProduto c1 = new CadastroProduto();
        List<Produto> produtos = c1.obterTodos();

//        List<Fabricante> fabricantes = new ArrayList<>();
//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .forEach(produto -> {
//                    if(!fabricantes.contains(produto.getFabricante())) {
//                        fabricantes.add(produto.getFabricante());
//                    }
//                });
//        System.out.println(fabricantes);

        //o processo acima não segue as boas práticas
        //porque traz para dentro do stream dependências externas
        //como o fabricanntes.
        //Deve-se usar somente os recursos internos da API

        List<Fabricante> fabricantes = produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct()
                .toList();
        System.out.println(fabricantes);
    }
}
