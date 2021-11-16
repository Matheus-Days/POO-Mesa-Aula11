package Aula11;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
        this.tipoAnimal = "Preguiça";
    }

    @Override
    public String emitirSom() {
        return "Silêncio...";
    }

    @Override
    public String locomover() {
        return "Sobe em árvores!";
    }
}
