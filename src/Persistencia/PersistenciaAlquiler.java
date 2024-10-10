package Persistencia;

import Clases.Alquiler;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaAlquiler {
    
    private static final List<Alquiler> arrayAlquileres = new ArrayList<>();

    public PersistenciaAlquiler() {
    }
    
    public static void agregarAlquiler(Alquiler alquiler){
        arrayAlquileres.add(alquiler);
    }

    public static List<Alquiler> getArrayAlquileres() {
        return arrayAlquileres;
    }
}
