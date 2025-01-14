import java.util.Arrays;

public class Almacen {
    private int numProductosAlmacen;
    private Producto[] lstAlmacen;
    private int contador=0;

    public Almacen (int numProductosAlmacen){
        //Inicializamos en el constructor
        lstAlmacen= new Producto[numProductosAlmacen];
    }
    public void agregarProductoAlInventario(Producto producto){
        if (contador<10){
            lstAlmacen[contador]=producto; //Añadimos el producto a la lista, se repite 10 veces
            contador++;
        }else {
            contador=0;
        }
    }
    public void mostrarInventario(){
        System.out.println("Inventario:");
        for (int i = 0; i < lstAlmacen.length; i++) { //Recorre la lista con max 10 productos
            Producto producto= lstAlmacen[i];
            if (producto!=null){ //Si se encuentra un producto lo imprimirá
                System.out.println(lstAlmacen[i].toString());
            }else {
                System.out.println("No hay más productos en el almacen.");
            }
        }
    }
    public Producto buscarProductoPorNombre(String nombre){
        for (int i = 0; i < lstAlmacen.length; i++) { //Recorre la lista con max 10 productos
            Producto producto= lstAlmacen[i];
            if (producto!=null){
                if (nombre.equals(lstAlmacen[i].getNombre())){
                    System.out.println(lstAlmacen[i].toString());
                }
            }else {
                System.out.println("No hay más productos en el almacen.");
            }
        }
        return null;
    }

    public int getNumProductosAlmacen() {
        return numProductosAlmacen;
    }

    public void setNumProductosAlmacen(int numProductosAlmacen) {
        this.numProductosAlmacen = numProductosAlmacen;
    }

    public Producto[] getLstAlmacen() {
        return lstAlmacen;
    }

    public void setLstAlmacen(Producto[] lstAlmacen) {
        this.lstAlmacen = lstAlmacen;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "numProductosAlmacen=" + numProductosAlmacen +
                ", lstAlmacen=" + Arrays.toString(lstAlmacen) +
                ", contador=" + contador +
                '}';
    }
}
