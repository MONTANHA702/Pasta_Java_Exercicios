package revisao.Poo.DesafioClinicaVeterinaria;

public class MainCachorro {

    public static void main(String[] args) {

        Cachorro cao1 = new Cachorro();
        Cachorro cao2 = new Cachorro();

        cao1.idade = 10;
        //cao1.nome = "Brisa";
        cao1.raca = "RagDoll";
        cao1.sexo = "Feminino";


        cao2.idade = 5;
        //cao2.nome = "Mel";
        cao2.raca = "Bull Terrier";
        cao2.sexo = "Feminino";

        System.out.println("==========");
        System.out.println("FICHA CADASTRO");
        System.out.println("CAO 1");
        System.out.println("Nome: " + cao1.nome);
        System.out.println("Idade: " + cao1.idade);
        System.out.println("Sexo: " + cao1.sexo);
        System.out.println("Raça: " + cao1.raca);

        System.out.println("==========");

        System.out.println("CAO 2");
        System.out.println("Nome: " + cao2.nome);
        System.out.println("Idade: " + cao2.idade);
        System.out.println("Sexo: " + cao2.sexo);
        System.out.println("Raça: " + cao2.raca);

    }
}
