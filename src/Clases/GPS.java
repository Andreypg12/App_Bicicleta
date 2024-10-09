package Clases;

public class GPS implements IServicio{
    private String nombre;

    public GPS() {
        this.nombre = "GPS";
    }
    
    @Override
    public int obtenerPrecio() {
        return 3000;
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
