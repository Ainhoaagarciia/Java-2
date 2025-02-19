package pojo;
import pojo.interfaces.Fly;
import pojo.interfaces.Move;
import pojo.interfaces.Talk;

public abstract class Toy implements Talk, Fly, Move {
    protected String nombre;

    public Toy(){

    }

    public Toy(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirAtributos(){
        System.out.println(this.nombre);
    }

    @Override
    public abstract void fly();

    @Override
    public abstract void move();

    @Override
    public abstract void talk();

    public  abstract void eat();
}
