
package SuperClases;

/**
 *
 * @author Alan
 */
public abstract class Electronica extends Producto {
    
    private String Fabricante;
    private String Modelo;
    private int Garantia; //DIAS DE GARANTIA
    
    public Electronica (){
        
        super();
        this.Fabricante = "---";
        this.Modelo = "---";
        this.Garantia = 0;
        
    }

    public Electronica(String Fabricante, String Modelo, int Garantia, double Precio, String Nombre, int Unidad) {
        
        super(Precio, Nombre, Unidad);
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.Garantia = Garantia;
    
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }
        
        
        
}
