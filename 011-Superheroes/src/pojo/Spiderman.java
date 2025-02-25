package pojo;

public class Spiderman extends SuperHero{

    public Spiderman(String name) {
        super(name);
    }

    @Override
    public void realizarAtaque() {
        System.out.println("Spiderman te está atacando!!");

    }

    @Override
    public void attack() {
        System.out.println("Spiderman te va a atacar!!");

    }

    @Override
    public void defend() {
        System.out.println("Spiderman defensa ");

    }
}
