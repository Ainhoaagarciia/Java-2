package personajes;
import armas.Arma;
import armas.Llamarada;

public abstract class Pokemon  implements Arma {
    private String nombre;
    private int nivel;
    private int energia;
    protected Arma arma;

    public Pokemon(String nombre, int nivel, int energia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = energia;
    }
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void atacar(Pokemon pokemonEnemigo){

    }
    public void defender(int daño){
        energia = energia - daño;
        System.out.println("Energía restante: " + energia);
    }


    public void equiparArma(Arma nuevaArma) {
        System.out.println("Arma equipada" + nuevaArma.toString());
    }
    public void usarArma(Pokemon enemigo){

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", energia=" + energia +
                '}';
    }
}

