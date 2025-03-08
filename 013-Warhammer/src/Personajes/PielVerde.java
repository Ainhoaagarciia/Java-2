package Personajes;

import Armas.Ataque.ArmaAtaque;
import Armas.Defensa.ArmaDefensa;

public abstract class PielVerde extends WarhammerPersonaje {
    protected String puebloNacimiento;
    protected int nivel;
    private static int contPielesVerdes;

    public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
        contPielesVerdes++;
    }
    public static int getContPielesVerdes(){
        return contPielesVerdes;
    }
    public void addArmaAtaque(ArmaAtaque arma){
        armas.put("Ataque",arma);
    }
    public void addArmaDefensa(ArmaDefensa arma){
        armas.put("Defensa",arma);
    }
    public String imprimirArmas(){
        return "";
    }

    public String getPuebloNacimiento() {
        return puebloNacimiento;
    }

    public void setPuebloNacimiento(String puebloNacimiento) {
        this.puebloNacimiento = puebloNacimiento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public static void setContPielesVerdes(int contPielesVerdes) {
        PielVerde.contPielesVerdes = contPielesVerdes;
    }

    @Override
    public String toString() {
        return "PielVerde{" +
                "armas=" + armas +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                '}';
    }
}
