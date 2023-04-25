/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_20_vehiculo;

/**
 *
 * @author Alan
 */
public class Bicicleta extends Vehículo implements Control_De_Velocidad {
    private String tipo;
    private String talla;
    
    //CONSTRUCTORES

    public Bicicleta() {
        this.tipo = "---";
        this.talla = "---";
    }

    public Bicicleta(String tipo, String talla, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.talla = talla;
    }
    
    //MÉTODOS GETTER AND SETTER

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int acelerar() {
        if(velocidad == 100)
            return velocidad;
        else if(velocidad<=100){
          return velocidad + 10;
        }
        else{
            return 0;
        }
    }

    @Override
    public int detener() {
         if(velocidad == 100)
            return velocidad;
        else if(velocidad<=100){
          return velocidad - 10;
        }
        else{
            return 0;
        }
    }

    @Override
    public void imprmirVelocidad() {
    System.out.println("\n" + "Velocidad total: "+ (acelerar()-detener()));
    }
    
    @Override
    public String toString(){
    String cade = "Datos de la bici: \n"+
                            "Marca: "+ this.getMarca() + "\n"+
                            "Tipo: "+ this.getTipo() + "\n"+
                            "Talla: "+ this.getTalla() + "\n";
        return cade;
    }
    
    
}
