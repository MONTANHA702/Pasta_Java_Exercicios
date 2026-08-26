package revisao.Poo.Ex10MetodosQueAlteramVariavelInstancia;

public class Main {
    public static void main(String[] args) {

        Aeronave aeronaveGol = new Aeronave();
        aeronaveGol.totalAssentos = 100;
        aeronaveGol.reservarAssentos(12);

        System.out.printf("GOL (%S): %d assentos disponíveis%n",
                aeronaveGol.ativo ? "Ativo" : "Inativo",
                aeronaveGol.calcularAssentosDisponiveis());

        Aeronave aeronaveLatam = new Aeronave();
        aeronaveLatam.totalAssentos = 120;
        aeronaveLatam.reservarAssentos(45);

        System.out.printf("LATAM (%S): %d assentos disponíveis%n",
                aeronaveLatam.ativo ? "Ativo" : "Inativo",
                aeronaveLatam.calcularAssentosDisponiveis());
    }
}
