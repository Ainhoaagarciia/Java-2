package printers;

import herencia.Reporte;
import interfaces.Print;

public class PrintToJSON extends Reporte {
    private String cadenaEnHTML;
    public PrintToJSON(String cadena){
        super(cadena);
    }
}
