package Aula11;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
        this.tipoAnimal = "Cavalo";
    }

    @Override
    public String emitirSom() {
        return "Relincha!";
    }

    @Override
    public String locomover() {
        return "Corre!";
    }
}
