package Clases;

public class Ruta extends Bicicleta{
    
    public Ruta() {
        
    }
    
    @Override
    public double calcularCostos(int horas) {
        if(horas > 0 & horas <= 12){
            return (horas <= 4) ? horas * 1000 
                    : (horas <= 8) ? 4000 + ((horas - 4) * 900) 
                    : 7600 + ((horas - 8) * 800);
        }
        return 0;
    }
}
