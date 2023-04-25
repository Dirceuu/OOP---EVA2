/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_23_polimorfismo_vehiculos;

/**
 *
 * @author Alan
 */
public class EVA_2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Automovil auto = new Automovil("BENz", 0, "Truck", 2023);
        //auto.acelerar(50);
        //auto.tablero();
        Bicicleta bici = new Bicicleta ("Montaña", "XX", 0, "Harley Davidson");
        //bici.acelerar(10);
        //bici.tablero();
        CambiarVelocidad (bici, 50);
        //Clase Object ---> 
        //Object obj = auto;
    }
    
    public static void CambiarVelocidad (DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
        
        
    }
    
}

interface DatosVehiculo{
    public abstract void acelerar(int cambio);
    public abstract void tablero();
}

class Vehiculo{
    protected int velocidad;
    private String marca;

    public Vehiculo() {
        this.marca = "---";
        this.velocidad = 0;
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
    
    //LA velocidad se modifica con acelerar.
    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}

class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "---";
        this.año = 0;
    }

    public Automovil(String marca, int velocidad, String modelo, int año) {
        super();
        this.modelo = modelo;
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
    int cambioVelo = velocidad + cambio;
        
        if (cambioVelo >= 0) // aceptar solo velocidad positiva o cero.
        velocidad += cambioVelo; //velocidad = velocidad + cambio; <--- acumulador    }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil: " + getVelocidad());    
    }
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo; //montaña
    private String rodada; 
    
    public Bicicleta(){
        super();
        this.tipo = "-----";
        this.rodada = "---";
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVelo = velocidad + cambio;
        
        if (cambioVelo >= 0) // aceptar solo velocidad positiva o cero.
        velocidad += cambioVelo; //velocidad = velocidad + cambio; <--- acumulador
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: " + getVelocidad());    }
    
    
}