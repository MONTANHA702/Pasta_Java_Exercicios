package revisao.generics.ex02implementandometodosgenericos;

public class Main {
    public static void main(String[] args) {

        String[] nomes = {"Joao", "Maria"};
        //String nomeSorteado = Sorteador.<String>sortear(nomes);
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);


        Cliente[] clientes = {
                new Cliente("Mercado do Joao", 2_000_000),
                new Cliente("Posto J", 1_000_000),
                new Cliente("Javac Ltda", 58_000_000),
        };

        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
