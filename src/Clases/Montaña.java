package Clases;

public class Montaña extends Bicicleta{
    
    public Montaña() {
        super.setNombre("Montaña");
    }
    
    @Override
    public double calcularCostos(int horas) {
        if(horas > 0 & horas <= 12){
            return (horas <= 4) 
                    ? horas * 800 
                    : (horas <= 8) 
                    ? 3600 + ((horas - 4) * 700) 
                    : 6000 + ((horas - 8) * 600);
        }
        return 0;
    }
}
