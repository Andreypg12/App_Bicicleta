package Clases;

public class Casco implements IServicio{
    private String nombre;

    public Casco() {
        this.nombre = "Casco";
    }
    
    @Override
    public int obtenerPrecio() {
        return 2000;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
