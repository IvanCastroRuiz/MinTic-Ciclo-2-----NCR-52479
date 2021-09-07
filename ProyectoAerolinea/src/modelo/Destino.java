package modelo;

public class Destino {
    
    private int Destino;
    private String nombre;
    private String region;

    
    // Constructor 

    public Destino(int Destino, String nombre, String region) {
        this.Destino = Destino;
        this.nombre = nombre;
        this.region = region;
    }
      
    public int getDestino() {
        return Destino;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegion() {
        return region;
    }

}
