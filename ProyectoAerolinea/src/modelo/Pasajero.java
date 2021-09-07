package modelo;

public class Pasajero {
    
    private int idPasajero;
    private String nombrePasajero;
    private int edad;
    private int valorCancelado;
    
    // Constructor
    public Pasajero(int idPasajero, String nombrePasajero, int edad) {
        this.idPasajero = idPasajero;
        this.nombrePasajero = nombrePasajero;
        this.edad = edad;
    }
    
    public int getIdPasajero() {
        return idPasajero;
    }

    public Pasajero(int idPasajero, String nombrePasajero, int edad, int valorCancelado) {
        this.idPasajero = idPasajero;
        this.nombrePasajero = nombrePasajero;
        this.edad = edad;
        this.valorCancelado = valorCancelado;
    }

    // get y set 
    
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public int getEdad() {
        return edad;
    }

    public int getValorCancelado() {
        return valorCancelado;
    }

    public void setValorCancelado(int valorCancelado) {
        this.valorCancelado = valorCancelado;
    }
}
