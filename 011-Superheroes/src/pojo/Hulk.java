package pojo;

public class Hulk extends SuperHero{
    public Hulk(String name) {
        super(name);
    }

    @Override
    public void realizarAtaque() {
        System.out.println("Realizando ataque de Hulk");
    }

    @Override
    public void attack() {
        System.out.println("Ataque de Hulk");
    }

    @Override
    public void defend() {
        System.out.println("Defensa de Hulk");
    }
}
