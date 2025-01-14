public class Pedido {
    private int numProductos;
    private Producto[] lstProductos; //Listas estáticas (arraylist)
                                    // Es lo mismo que = New Producto[5]
    private int contador = 0;
    public Pedido(int numProductos){
        this.numProductos=numProductos;
        lstProductos= new Producto[numProductos]; //Recibe 5 (Podemos comprar max 5)
    }

    //To String - Para poder imprimir los datos luego
    @Override
    public String toString() {
        return "Pedido{" +
                "numProductos=" + this.numProductos +
                '}';
    }

    //Getter/Setter

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    //PASO DE OBJETOS ENTRE CLASES - MAGDALENA
    public void agregarProducto(Producto miProducto, int cantidad){
        if (contador<5){
            this.lstProductos[contador]=miProducto;
            contador++;
        }else {
            contador=0;
        }
    }
    public void imprimirTicket(){
        System.out.println("Su ticket digital!!");
        System.out.println("Fecha ->"+ "14/01/2025");
        System.out.println("Hora ->"+ "12:10");
        for (int i = 0; i < lstProductos.length; i++) { //Recorre la lista con max 5 productos
            Producto miProducto= lstProductos[i];
            if (miProducto!=null){ //Si se encuentra un producto lo imprimirá
                System.out.println(lstProductos[i].toString());
            }else {
                System.out.println("Has llegado al final de la lista.");
            }
        }
    }
}
