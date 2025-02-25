package pojo;

public class Woody1 extends Toy{
    private String complementos;
    @Override
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println(this.complementos);
    }

    public Woody1(String nombre) {
        super(nombre);
        this.complementos = "Gorro";
    }

    @Override
    public void fly() {
        System.out.println("volar");
    }

    @Override
    public void move() {
        System.out.println("moverse");
    }

    @Override
    public void imprimirInfo() {
        System.out.println("imprimir");
    }

    @Override
    public void talk() {
        System.out.println("hablar");
    }

    @Override
    public void eat() {
        System.out.println("comer");
    }

    public Woody1(){
        super();
    }
}
