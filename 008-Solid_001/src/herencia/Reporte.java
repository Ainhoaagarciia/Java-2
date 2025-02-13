package herencia;

public class Reporte {
    //ATRIBUTOS
    protected String cadenaATransformar;
    //CONSTRUCTORES

    public Reporte(String cadena) {
        this.cadenaATransformar = cadena;
    }

    //MÉTODOS
    public void imprimirCadena(){
        System.out.println(this.cadenaATransformar);
    }

    //GETTER/SETTER
}
