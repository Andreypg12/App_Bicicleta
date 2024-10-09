package Clases;

public class Banana extends Bicicleta{
    
    public Banana() {
        
    }
    
    @Override
    public double calcularCostos(int horas) {
        if(horas > 0 & horas <= 12){
            return (horas <= 4) 
                    ? horas * 600 
                    : (horas <= 8) 
                    ? 2400 + ((horas - 4) * 500) 
                    : 4400 + ((horas - 8) * 400);
        }
        return 0;
    }
}
