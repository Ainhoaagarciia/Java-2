package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class PielVerde extends WarhammerPersonaje{
    //private String nombre;
    private String puebloNacimiento;
    protected int nivel;
    private static int contPielesVerdes;

    public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento= puebloNacimiento;
    }

    public static int getContPielesVerdes() {
        return 0;
    }
    public void addArmaAtaque(ArmaAtaque arma){

    }
    public void addArmaDefensa(ArmaDefensa arma){

    }
    public String imprimirArmas(){
        //Recorrer HASH MAP, y preparar cadena
        return "";
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public String toString() {
        return "PielVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
