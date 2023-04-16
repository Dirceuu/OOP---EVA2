package eva_2_15_tienda;

import SuperClases.Electronica;

/**
 *
 * @author Alan
 */
public class Computadora extends Electronica {
    
    private int memoria;
    private String procesador;
    private String disco;
    private double tamañoP;

    public Computadora() {
    super();
    this.memoria = 0;
    this.procesador = "---";
    this.disco = "---";
    this.tamañoP = 0;
    
    }

    public Computadora(int memoria, String procesador, String disco, double tamañoP, 
            String Fabricante, String Modelo, int Garantia, double Precio, String Nombre, int Unidad) {
        super(Fabricante, Modelo, Garantia, Precio, Nombre, Unidad);
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
        this.tamañoP = tamañoP;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public double getTamañoP() {
        return tamañoP;
    }

    public void setTamañoP(double tamañoP) {
        this.tamañoP = tamañoP;
    }
    

    @Override
    public double precioVenta() {
    int cant = getUnidad();
        if(cant<10)
            return (Precio*2) * cant;
        else
            return((Precio*2) * 0.8) * cant;
    }
    
    @Override
    public String toString(){
        String datos = "Datos del producto: \n"+
            "Nombre: "+ this.getNombre() + "\n" +
            "Modelo: "+ this.getModelo() + "\n" +    
            "Fabricante: "+ this.getFabricante()+ "\n" +
            "Disco: "+ this.getDisco() + "\n" +                       
            "Garantía: "+ this.getGarantia() + "\n" +
            "Unidad: "+ this.getUnidad() + "\n" +
            "Tamaño de la pantalla: "+ this.getTamañoP() + "\n" +
            "Memoria: "+ this.getMemoria() + "\n" +
            "Procesador: "+ this.getProcesador() + "\n" +
            "Precio: "+ this.getPrecio() + "\n" +
            "Precio de venta: "+ this.precioVenta() + "\n";
        return datos;
    }

    
    
}
