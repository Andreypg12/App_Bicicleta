package Clases;

public abstract class Bicicleta {
    private String nombre;

    public Bicicleta() {
        this.nombre = "";
    }
    
    public abstract double calcularCostos(int horas);

    public String getNombre() {
        return nombre;
    }  
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
