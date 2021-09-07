
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainReto3 {
    
    
    public static void main(String[] args) throws ParseException{
  
        // Instancia # 1 
        
        String fechaCompra = "07/21/2021";
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha = date.parse(fechaCompra);
        
        Destino destino = new Destino(0,"Santa Marta","Caribe");
        Pasajero p0 = new Pasajero(0,"Juan Sebastián Zuluaga",29);
        /*Pasajero p1 = new Pasajero(1,"Helena Gonzales",27);
        Pasajero p2 = new Pasajero(2,"Johan Hernandez",7);*/
        // Vector con los pasajeros 
        Pasajero pasajeros[] = {p0};
        
        PasajeAvion pja = new PasajeAvion(0, destino,pasajeros,fecha); 
    
        pja.mostrarDatos();
        System.out.println("El total por el plan familiar es: "+pja.calcularTotal());
        
        System.out.println(pja.calcularDevuelta(pja.calcularTotal(), 640000));
        
              
       /* // Instancia # 2
        
        String fechaCompra1 = "07/21/2021";
        SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha1 = date1.parse(fechaCompra1);
        
        Destino destino1 = new Destino(1,"Armenia","Eje Cafetero");
        Pasajero p10 = new Pasajero(0,"Juan Sebastián Zuluaga",22);
        Pasajero p11 = new Pasajero(1,"Helena Gonzales",11);
        Pasajero p12 = new Pasajero(2,"Johan Hernandez",7);
        // Vector con los pasajeros 
        Pasajero pasajeros1[] = {p10, p11, p12};
        
        PasajeAvion pja1 = new PasajeAvion(0, destino1, pasajeros1, fecha1); 
    
        pja1.mostrarDatos();
        System.out.println("El total por el plan familiar es: "+pja1.calcularTotal());
        
        // Instancia # 3
        
        String fechaCompra2 = "07/21/2021";
        SimpleDateFormat date2 = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha2 = date2.parse(fechaCompra2);
        
        Destino destino2 = new Destino(1,"Nuquí","Pacífico");
        Pasajero p20 = new Pasajero(0,"Juan Sebastián Zuluaga",24);
        Pasajero p21 = new Pasajero(1,"Helena Gonzales",30);
        Pasajero p22 = new Pasajero(2,"Johan Hernandez",12);
        // Vector con los pasajeros 
        Pasajero pasajeros2[] = {p20, p21, p22};
        
        PasajeAvion pja2 = new PasajeAvion(0, destino2, pasajeros2, fecha2); 
    
        pja2.mostrarDatos();
        System.out.println("El total por el plan familiar es: "+pja2.calcularTotal());
        
        
        // Instancia # 4
        
        String fechaCompra3 = "07/21/2021";
        SimpleDateFormat date3 = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha3 = date3.parse(fechaCompra3);
        
        Destino destino3 = new Destino(1,"Nuquí","Pacíficoo");
        Pasajero p30 = new Pasajero(0,"Juan Sebastián Zuluaga",24);
        Pasajero p31 = new Pasajero(1,"Helena Gonzales",30);
        Pasajero p32 = new Pasajero(2,"Johan Hernandez",12);
        // Vector con los pasajeros 
        Pasajero pasajeros3[] = {p30, p31, p32};
        
        PasajeAvion pja3 = new PasajeAvion(0, destino3, pasajeros3, fecha3); 
    
        pja3.mostrarDatos();
        System.out.println("El total por el plan familiar es: "+pja3.calcularTotal());*/
        
    }
    
    
}
