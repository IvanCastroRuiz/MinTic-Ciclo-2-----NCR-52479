
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Aerolinea {
    
    private int idAerolinea;
    private PasajeAvion pasaje;

    // metodos constructores

    public Aerolinea() {
    }

    public Aerolinea(int idAerolinea, PasajeAvion pasaje) {
        this.idAerolinea = idAerolinea;
        this.pasaje = pasaje;
    }

    // metodos set y get
    
    public int getIdAerolinea() {
        return idAerolinea;
    }

    public PasajeAvion getPasaje() {
        return pasaje;
    }

    public void setIdAerolinea(int idAerolinea) {
        this.idAerolinea = idAerolinea;
    }

    public void setPasaje(PasajeAvion pasaje) {
        this.pasaje = pasaje;
    }
    
    // metodos logica del negocio
    
    public String validarFecha(){
        
        String fechaActual = "08/12/2021";
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy"); // se determina el formato con de fecha con el que vamos a trabajar
        Date fecha = null;
            try {
                fecha = date.parse(fechaActual);
            } catch (ParseException ex) {
                Logger.getLogger(Aerolinea.class.getName()).log(Level.SEVERE, null, ex);
            }
        long meses = (diasEntreDosFechas(getPasaje().getFechaCompra(),fecha)/30); // convertimos a meses los dias
        
        System.out.println("Fecha Actual: "+fecha);
        System.out.println("Fecha Compra: "+getPasaje().getFechaCompra());
        System.out.println("Meses: "+meses);
        System.out.println("Numero de dias: "+(diasEntreDosFechas(getPasaje().getFechaCompra(),fecha)));
        
            if (meses > 4){
               return "Señor usuario, su pasaje esta vencido y no puede ser usado en esta ocasión";
            }

            if (meses >= 2 && meses <= 4){
                    return "Señor usuario, su pasaje es válido, pero está próximo a vencer. Debe ser usado antes de que caduque";
            }

            if (meses < 2){
                return "Señor usuario, su pasaje es válido y aún tiene más de dos meses para darle uso";
            }
            return "";
    }

    public long diasEntreDosFechas(Date fechaDesde, Date fechaHasta){
        long startTime = fechaDesde.getTime() ;
        long endTime = fechaHasta.getTime();
        long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora 
        long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora
        long dias = diasHasta - diasDesde;
        return dias;  
    }
    
    public String mostrarDatos(){
        
        return "\nID aerolinea: "+idAerolinea+
                "\nID pasaje: "+getPasaje().getIdPasaje()+
                "\nNombre persona: "+getPasaje().getNombrePersona()+
                "\nFecha compra: "+getPasaje().getFechaCompra()+"\n";
        
        /*System.out.println("\nID aerolinea: "+idAerolinea+
                "\nID pasaje: "+getPasaje().getIdPasaje()+
                "\nNombre persona: "+getPasaje().getNombrePersona()+
                "\nFecha compra: "+getPasaje().getFechaCompra()+"\n");*/
    }
    
}
