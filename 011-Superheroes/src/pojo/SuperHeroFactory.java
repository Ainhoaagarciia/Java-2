package pojo;

public class SuperHeroFactory {

    public static SuperHero createHero(String héroe, String nombre) {
        switch (héroe) {
            case "IronMan":
                return new IronMan(nombre);
            case "SpiderMan":
                return new Spiderman(nombre);
            case "Hulk":
                return new Hulk(nombre);
            default:
                throw new IllegalArgumentException("Unknown hero type");
        }
    }
}
