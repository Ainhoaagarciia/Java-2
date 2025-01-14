
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Código 09-01-2025
        Magdalena magdalena1 = new Magdalena("Chocolate", "Marrón");
        Magdalena magdalena2 = new Magdalena("Vainilla", "Crema");
        Magdalena magdalena3 = new Magdalena("Fresa", "Rosa");
        Magdalena magdalena4 = new Magdalena("Limón", "Amarilla");

        MagdalenaFactory magdalenaFactory = new MagdalenaFactory();

        magdalenaFactory.addMagdalena(magdalena1);
        magdalenaFactory.addMagdalena(magdalena2);
        magdalenaFactory.addMagdalena(magdalena3);
        magdalenaFactory.addMagdalena(magdalena4);
        System.out.println(" ");
        magdalenaFactory.printMagdalena();

        //Código 14/01/2025
        Producto magdalena= new Producto("Magdalena de Chocolate",1.70,10);
        Producto croissant= new Producto("Croissant de Chocolate",1.80,10);
        Producto galleta= new Producto("Galleta de Chocolate",1.50,10);
        System.out.println("");

        System.out.println(magdalena.getNombre());
        magdalena.setStock(25);
        System.out.println(magdalena.toString());
        System.out.println(croissant.toString());
        System.out.println(galleta.toString());


        //Crear un pedido con capacidad para 5 productos
        Pedido pedido = new Pedido(5);
            pedido.agregarProducto(magdalena,3);
            pedido.agregarProducto(croissant,5);
            pedido.agregarProducto(galleta,6);
            pedido.agregarProducto(magdalena,12);
            pedido.agregarProducto(croissant,5);
            System.out.println("");
            pedido.imprimirTicket();

        //Crear almacen para capacidad de 10 productos
        Almacen almacen = new Almacen(10);
        almacen.agregarProductoAlInventario(new Producto("Magdalena",1.70,10));
        almacen.agregarProductoAlInventario(new Producto("Croissant",1.80,10));
        almacen.agregarProductoAlInventario(new Producto("Galleta",1.50,10));
        almacen.agregarProductoAlInventario(new Producto("Helado",1.70,10));
        almacen.agregarProductoAlInventario(new Producto("Muffin",1.80,10));
        almacen.agregarProductoAlInventario(new Producto("Bizcocho",1.50,10));
        almacen.agregarProductoAlInventario(new Producto("Tarta",1.70,10));
        almacen.agregarProductoAlInventario(new Producto("Pan",1.80,10));
        almacen.agregarProductoAlInventario(new Producto("Cookies",1.50,10));
        almacen.agregarProductoAlInventario(new Producto("Pastel",1.70,10));
        System.out.println("");

        almacen.mostrarInventario();
        System.out.println("");
        System.out.println("Dime el producto que quieras buscar");
        Scanner lector= new Scanner(System.in);
        String producto = lector.nextLine();
        almacen.buscarProductoPorNombre(producto);
    }
}