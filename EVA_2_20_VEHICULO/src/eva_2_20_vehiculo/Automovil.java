/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_20_vehiculo;

/**
 *
 * @author Alan
 */
public class Automovil extends Vehículo implements Control_De_Velocidad{
    
    private String motor;
    private String placas;
    private String modelo;
    private int kilometraje;
    private double Gasolina;
    
    //CONSTRUCTORES

    public Automovil() {
        this.motor = "";
        this.placas = "";
        this.modelo = "";
        this.kilometraje = 0;
        this.Gasolina = 0;
    }

    public Automovil(String motor, String placas, String modelo, int kilometraje, double Gasolina, int velocidad, String marca) {
        super(velocidad, marca);
        this.motor = motor;
        this.placas = placas;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.Gasolina = Gasolina;
    }
    
    //METODOS GETTER AND SETTER

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getGasolina() {
        return Gasolina;
    }

    public void setGasolina(double Gasolina) {
        this.Gasolina = Gasolina;
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
    String cade = "Datos del automovil: \n"+
                            "Marca: "+ this.getMarca() + "\n"+
                            "Motor: "+ this.getMotor() + "\n"+
                            "Placas: "+ this.getPlacas() + "\n"+
                            "Modelo: " + this.getModelo()+ "\n"+
                            "Kimelotraje: "+ this.getKilometraje()+"\n"+
                            "Gasolina: "+ this.getGasolina();
        return cade;
    }
}

    