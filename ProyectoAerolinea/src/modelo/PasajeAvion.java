package modelo;

import java.util.Date;


public class PasajeAvion {
    
    private int idPasaje;
    private  Destino destino;
    private Pasajero[] pasajeros;
    private Date fechaCompra;
    private String nombrePersona;
    
    // metodos constructores
    // Reto 1 y 2 (No tocar)
    public PasajeAvion(int idPasaje, String nombrePersona, Date fechaCompra) {
        this.idPasaje = idPasaje;
        this.nombrePersona = nombrePersona;
        this.fechaCompra = fechaCompra;
    }

    // Reto 3 

    public PasajeAvion(int idPasaje, Destino destino, Pasajero[] pasajeros, Date fechaCompra) {
        this.idPasaje = idPasaje;
        this.destino = destino;
        this.pasajeros = pasajeros;
        this.fechaCompra = fechaCompra;
    }

     public PasajeAvion() {
    }
     
     
   
    // metodos get y set 
    
    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public Destino getDestino() {
        return destino;
    }
       
    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    // Implementacion del metodo calcularTotal()
    public double calcularTotal(){
        double total = 0;
        for (Pasajero pasajero : pasajeros){
        
            if (destino.getRegion().equals("Caribe")){
                if (pasajero.getEdad() > 15){
                    total = total + 500000;
                }else{
                    total = total + 420000;
                 }                
            }else  if (destino.getRegion().equals("Eje Cafetero")){
                if (pasajero.getEdad() > 13){
                    total = total + 340000;
                }else{
                    total = total + 250000;
                 }                
            } else if (destino.getRegion().equals("Pacífico")){
                if (pasajero.getEdad() > 17){
                    total = total + 720000;
                }else{
                    total = total + 620000;
                 }                
            } else{                
                    total = total + 400000;
                }
        }
        return total;
    }
    
    
    // Implementacion del metodo calcularDevuelta()
    public String calcularDevuelta(double valorTotal, double valorCancelado){
        String mensaje = "";
        
        if (valorCancelado > valorTotal){
   
            double vuelto = valorCancelado - valorTotal;
            double billetesCincuenta = Math.floor((vuelto/50000));
            double monedasQuinientos = (vuelto - (50000*(Math.floor(billetesCincuenta))))/500;
                        
            return mensaje = "Se debe devolver al usuario con "+Math.round(billetesCincuenta)+
                             " billetes de 50000 y "+Math.round(monedasQuinientos)+" monedas de 500.";
        }
        return mensaje = "Operacion invalida";
    }
       
    
    public void mostrarDatos(){
        
        System.out.println("\n**Pasaje de Avion**\n"+
                           "\n ID Pasaje: "+idPasaje+
                           "\n Destino: "+ destino.getNombre()+
                           "\n Fecha Compra: "+fechaCompra+
                           "\n\n**Destino**\n"+
                           "\nID Destino: "+destino.getDestino()+
                           "\nNombre Destino:  "+destino.getNombre()+
                           "\nRegion: "+destino.getRegion()+"\n");
        
        for (Pasajero pasajero : pasajeros){
             System.out.println("\nID Pasajero: "+pasajero.getIdPasajero()+
                               "\nNombre pasajero: "+pasajero.getNombrePasajero()+
                               "\nEdad: "+pasajero.getEdad()+"\n");
        }
        
    }
  
}
