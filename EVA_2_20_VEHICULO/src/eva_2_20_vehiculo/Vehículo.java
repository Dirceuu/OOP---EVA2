/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_20_vehiculo;

/**
 *
 * @author Alan
 */
public abstract class Vehículo {
    protected int velocidad;
    protected String marca;

    public Vehículo() {
        this.velocidad = 0;
        this.marca = "---";
    }

    public Vehículo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

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
