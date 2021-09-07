
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FechaAerolinea {

   
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        // Instancia 1
        String fechaCompra = "03/12/2021";
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha = date.parse(fechaCompra);
        PasajeAvion pasajeAvion = new PasajeAvion(0, "Juan Manuel Zuluaga", fecha);
        Aerolinea aerolinea = new Aerolinea(1, pasajeAvion);
        
        aerolinea.mostrarDatos();
        
        System.out.println("\n"+aerolinea.validarFecha());
        
        
        // Instancia 2
        
        String fechaCompra1 = "06/12/2021";
        SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha1 = date.parse(fechaCompra1);
        PasajeAvion pasajeAvion1 = new PasajeAvion(0, "Lida Patricia Henao", fecha1);
        Aerolinea aerolinea1 = new Aerolinea(1, pasajeAvion1);
        
        aerolinea1.mostrarDatos();
        System.out.println("\n"+aerolinea1.validarFecha());
        
        // Instancia 3
        
        String fechaCompra2 = "07/17/2021";
        SimpleDateFormat date2 = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha2 = date.parse(fechaCompra2);
        PasajeAvion pasajeAvion2 = new PasajeAvion(2, "Neider Gaviria", fecha2);
        Aerolinea aerolinea2 = new Aerolinea(1, pasajeAvion2);
        
        aerolinea1.mostrarDatos();
        System.out.println("\n"+aerolinea2.validarFecha());
        
        
        
        
    }
    
}
