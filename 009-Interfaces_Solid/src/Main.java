import pojo.Toy;
import pojo.Woody1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Toy toy1 = new Toy("buzz");
        // nunca nunca NUNCA podemos instanciar una clase abstracta
        Toy woody1 = new Woody1("Woody1");
        Toy woody2 = new Woody1("Woody2");
        woody1.imprimirAtributos();
        woody2.imprimirAtributos();
        ArrayList<Toy> lstToys = new ArrayList<>();
        lstToys.add(woody1);
        lstToys.add(woody2);
        //vinculacion dinamica,
        //Polimorfismo
    }
}
