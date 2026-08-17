package exercicios.poo.ex09sobrecargaconstrutores;

public class Pessoa {
    String nome;
    String cabelo;
    String olhos;
    int idade;
    double altura;
    double peso;

    Pessoa(){
        this.nome = "Não informado";
        this.cabelo = "Não informado";
        this.olhos = "Não informado";
    }
    Pessoa(String nome, String cabelo, String olhos, int idade, double altura, double peso){
        this.nome = nome;
        this.cabelo = cabelo;
        this.olhos = olhos;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    Pessoa(String nome,  int idade, double altura){
        this(nome, "Não informado", "Não informado", idade, altura, 0);
    }
    void apresentarPessoa(){
        System.out.println("=== CARACTERÍSTICAS DA PESSOA ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cabelo: " + this.cabelo);
        System.out.println("Olhos: " + this.olhos);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("===============================");
    }
}
