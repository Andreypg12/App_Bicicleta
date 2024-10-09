package Clases;

public class Caramañola implements IServicio{
    private String nombre;

    public Caramañola() {
        this.nombre = "Caramañola";
    }
    
    @Override
    public int obtenerPrecio() {
        return 1500;
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
