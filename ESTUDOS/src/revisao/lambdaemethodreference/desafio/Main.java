package revisao.lambdaemethodreference.desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));


        Predicate<Funcionario> funcionarioPredicate = Funcionario::isInativo;
        funcionarios.removeIf(funcionarioPredicate);

        Function<Funcionario, BigDecimal> funcion = Funcionario::getSalario;
        funcionarios.sort(Comparator.comparing(funcion));


        Consumer<Funcionario> funcionarioConsumer = funcionario -> imprimir(funcionario);
        funcionarios.forEach(funcionarioConsumer);
    }

    private static void imprimir(Funcionario funcionario) {
        BigDecimal impostoCalculado = caluladoraDeImposto(funcionario);
        System.out.printf("Nome: %S - Salário: R$%.2f - Imposto a pagar: R$%.2f%n",
                funcionario.getNome(), funcionario.getSalario(), impostoCalculado);
    }

    private static BigDecimal caluladoraDeImposto(Funcionario funcionario) {
        return funcionario.getSalario().multiply(BigDecimal.valueOf(0.2));
    }
}
