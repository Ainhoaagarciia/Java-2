package personajes;

import ataques.EstrategiaAtaque;

public abstract class Pokemon implements EstrategiaAtaque {
    private String nombre;
    private int nivel;
    private int energia;
    public static final int MAX_NIVEL = 100;
    protected EstrategiaAtaque estrategiaAtaque;

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

    public void setEstrategiaAtaque(EstrategiaAtaque estrategia) {
        this.estrategiaAtaque = estrategia;
    }

    public void atacar(Pokemon pokemonEnemigo){

    }
    public void defender(int daño){
        energia = energia - daño;
        System.out.println("Energía restante: " + energia);
    }
    public void subirNivel(){
        if (nivel<MAX_NIVEL){
            nivel+=1;
            System.out.println("El Pokemon ha subido de nivel" + nivel);
        }else {
            System.out.println("No puede subir más de nivel");
        }
    }
    public Pokemon evolucionar(){
        System.out.println("El pokemon está evolucionando");
        return null;
    }
    public  Pokemon involucionar(){
        System.out.println("El pokemon está involucionando");
        return null;
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
