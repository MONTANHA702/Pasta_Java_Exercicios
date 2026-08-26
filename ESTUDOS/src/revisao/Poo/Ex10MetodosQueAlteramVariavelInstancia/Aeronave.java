package revisao.Poo.Ex10MetodosQueAlteramVariavelInstancia;

public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativarVoo() {
        ativo = false;
    }

    void ativarVoo() {
        ativo = true;
    }

    void reservarAssentos(int assentosAReservar) {
        if (ativo) {
            assentosReservados += assentosAReservar;
        } else {
            System.out.println("Aeronave INATIVA. Não foi possivel reservar.");
        }
    }
}
