package eva_2_15_tienda;

import SuperClases.Ropa;

/**
 *
 * @author Alan
 */
public final class Playera extends Ropa {
    private String talla;
    private String tipo;

    public Playera(String talla, String tipo, String marca, String color, double Precio, String Nombre, int Unidad) {
        super(marca, color, Precio, Nombre, Unidad);
        this.talla = talla;
        this.tipo = tipo;
    }


    
    
    public Playera() {
        super ();
        this.talla = "---";
        this.tipo = "---";
    }

    
    
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
            "Marca: "+ this.getMarca() + "\n" +
            "Tipo: "+ this.getTipo() + "\n" +
            "Talla: "+ this.getTalla() + "\n" +
            "Color: "+ this.getColor() + "\n" +
            "Unidad: "+ this.getUnidad() + "\n" +
            "Precio: "+ this.getPrecio() + "\n" +
            "Precio de venta: "+ this.precioVenta() + "\n";
        return datos;
    }

}