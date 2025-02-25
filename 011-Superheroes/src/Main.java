import pojo.SuperHero;
import pojo.SuperHeroFactory;
public class Main {
    public static void main(String[] args) {

        SuperHero ironMan = SuperHeroFactory.createHero("IronMan", "Tony Stark");
        ironMan.attack();
        ironMan.defend();

        SuperHero spiderMan = SuperHeroFactory.createHero("SpiderMan", "Peter Parker");
        spiderMan.attack();
        spiderMan.defend();

        SuperHero hulk = SuperHeroFactory.createHero("Hulk", "Bruce Banner");
        hulk.attack();
        hulk.defend();
    }
}