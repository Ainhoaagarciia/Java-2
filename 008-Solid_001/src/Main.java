import herencia.Reporte;
import printers.PrintToHTML;
import printers.PrintToJSON;
import printers.PrintToXML;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Reporte printToHTML = new PrintToHTML("HTML");
        Reporte printToJSON = new PrintToJSON("JSON");
        Reporte printToXML = new PrintToXML("XML");

        ArrayList<Reporte> lst = new ArrayList<>();
        lst.add(printToJSON);
        lst.add(printToXML);
        lst.add(printToHTML);

        for (Reporte reporte:lst
        ) {
            reporte.imprimirCadena();
        }
    }
}