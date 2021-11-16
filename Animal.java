package Aula11;

public abstract class Animal {
    private String nome;
    private int idade;
    protected String tipoAnimal;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emitirSom();

    public abstract String locomover();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + this.nome + '\'' +
                ", animal=" + this.tipoAnimal +
                ", idade=" + this.idade +
                ", som=" + this.emitirSom() +
                ", locomoção=" + this.locomover() +
                '}';
    }
}
