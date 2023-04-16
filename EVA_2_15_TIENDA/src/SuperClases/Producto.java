
package SuperClases;

/**
 *
 * @author Alan
 */
public abstract class Producto {
    protected double Precio; //protected visibilidad entre clases
    private String Nombre;
    private int Unidad;
    
    //CONTRUCTORES:

    public Producto() {
        this.Precio = 0;
        this.Nombre = "---";
        this.Unidad = 0;
    }

    public Producto(double Precio, String Nombre, int Unidad) {
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.Unidad = Unidad;
    }
    
    //METODOS GET AND SET:

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUnidad() {
        return Unidad;
    }

    public void setUnidad(int Unidad) {
        this.Unidad = Unidad;
    }
    
    public abstract double precioVenta ();

    
}
