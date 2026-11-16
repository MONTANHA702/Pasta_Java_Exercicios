package revisao.streamsapi.ex01stringapi;

import java.util.List;

public class Main08TransformandoComMap {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        for (Produto produto : produtos) {
//            if (produto.temEstoque()) {
//                Fabricante fabricante = produto.getFabricante();
//                System.out.println(fabricante);
//            }
//        }

//        produtos.forEach(produto -> {
//            if (produto.temEstoque()) {
//                System.out.println(produto.getNome().toUpperCase());
//            }
//        });

        //vamos filtrar com stream.filter e transformar em
        //um stream de Fabricante com stream.map
//        Stream<Fabricante> stream = produtos.stream()
//                .filter(Produto::temEstoque)
//                .map(Produto::getFabricante);
//        stream.forEach(System.out::println);

        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .forEach(System.out::println);



    }
}
