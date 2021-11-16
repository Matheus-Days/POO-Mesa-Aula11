package Aula11;

public class Principal {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("Applejack", 7);
        Cachorro cachorro = new Cachorro("Rex", 2);
        Preguica preguica = new Preguica("Sleepy", 12);

        System.out.println(cavalo.toString());
        System.out.println(cachorro.toString());
        System.out.println(preguica.toString());
    }
}
