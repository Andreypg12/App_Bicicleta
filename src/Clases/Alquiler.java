package Clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alquiler {
    private static int CONTADOR = 1;
    private int numeroAlquiler;
    private Cliente cliente;
    private Bicicleta bicicleta;
    private ESeguro seguro;
    private Date fecha;
    private int horas;
    private List<IServicio> arrayServicios;

    public Alquiler(Cliente cliente, Bicicleta bicicleta, ESeguro seguro, Date fecha, int horas) {
        this.numeroAlquiler = CONTADOR++;
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.seguro = seguro;
        this.fecha = fecha;
        this.horas = horas;
        this.arrayServicios = new ArrayList<>();
    }
    
    public void agregarServicio(IServicio servicio){
        arrayServicios.add(servicio);
    }
    
    public int costoServicios(){
        int costoServicios = 0;
        if(!arrayServicios.isEmpty()){
            for (IServicio servicio : arrayServicios) {
                costoServicios += servicio.obtenerPrecio();
            }
        }
        return costoServicios;
    }
    
    
    public double calcularSubTotal(){
        return bicicleta.calcularCostos(horas) + costoServicios();
    }
    
    public double calcularCostoSeguro(){
        return calcularSubTotal() * seguro.getPorcentaje();
    }
    
    public double calcularTotal(){
        return calcularSubTotal() + calcularCostoSeguro();
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Numero de alquiler: ").append(numeroAlquiler);
        sb.append("\nCliente: ").append(cliente.toString());
        sb.append("\nTipo bicicleta: ").append(bicicleta.getNombre());
        sb.append("\nTipo seguro: ").append(seguro);
        sb.append("\nFecha: ").append(formatoFecha.format(fecha));
        sb.append("\nHoras: ").append(horas);
        sb.append("\nTotal costo por servicios: ").append(costoServicios()).append("₡");
        sb.append("\nSub total: ").append(calcularSubTotal()).append("₡");
        sb.append("\nCosto del seguro: ").append(String.format("%.2f", calcularCostoSeguro())).append("₡");
        sb.append("\nCosto Total: ").append(String.format("%.2f", calcularTotal())).append("₡");
        return sb.toString();
    }
    
    
}
