package Clases;

public enum ESeguro {
    BASICO(0.05f, "Básico"),
    ESTANDAR(0.085f, "Estandar"),
    COMPLETO(0.14f, "Completo");
    
    private final float porcentaje;
    private final String nombre;

    private ESeguro(float porcentaje, String nombre) {
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
