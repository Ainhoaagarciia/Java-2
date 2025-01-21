public class Biblioteca {
    private static final int CAPACIDAD = 3;
    private static Libro[] libros= new Libro[CAPACIDAD];
    private static int contadorLibros = 0;

    static void agregarLibro(Libro libro){
        if (contadorLibros< CAPACIDAD) {
            libros[contadorLibros] = libro; //Se añade el libro en el array en la posicion 0
            contadorLibros++;
            System.out.println("CON ESPACIO");
        }else {
            System.out.println("SIN ESPACIO");
        }
    }
    static void listarLibro(){
        //For normal
        //Foreach -> for optimizado para Objetos
        for (Libro libro:libros
            ) {
            System.out.println(libro.toString());
        }
        /*for (int i = 0; i < contadorLibros; i++) {
            Libro libro = libros[i];
        }*/
    }
    public static Libro buscarLibro(String titulo){
        for (Libro libro:libros
             ) {
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }else {
                System.out.println("NO DISPONEMOS DE ESE LIBRO");
            }
        }
        return null;
    }
    public static Libro prestarLibro(String titulo){
        Libro libro = buscarLibro(titulo);
        if (libro.isDisponible()==true){
            libro.setDisponible(false);
            System.out.println("LIBRO PRESTADO CON EXITO");
        }else {
            System.out.println("EL LIBRO NO ESTÁ DISPONIBLE PARA PRESTAR");
        }
        return libro;
    }
    public static Libro devolverLibro(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro.isDisponible() == false) {
            libro.setDisponible(true);
            System.out.println("LIBRO PRESTADO CON EXITO");
        } else {
            System.out.println("EL LIBRO NO ESTÁ DISPONIBLE PARA PRESTAR");
        }
        return libro;
    }
}
