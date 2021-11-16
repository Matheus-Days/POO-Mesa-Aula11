package Aula11;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
        this.tipoAnimal = "Cachorro";
    }

    @Override
    public String emitirSom() {
        return "Latir!";
    }

    @Override
    public String locomover() {
        return "Corre!";
    }
}
