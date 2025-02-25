package pojo;

public class IronMan extends SuperHero {

    public IronMan(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Iron Man te va a atacar!!");

    }

    @Override
    public void defend() {
        System.out.println("Iron Man se está defendiendo");
    }

    @Override
    public void realizarAtaque() {
        System.out.println("Realizando ataque de IronMan");

    }
}
