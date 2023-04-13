/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_11_override_figuras;

/**
 *
 * @author Alan
 */
public class Círculo extends Figura {
    private double radio;

    public Círculo() {
    }

    public Círculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI* (radio*radio);
    }
    
    @Override
    public double calcularPeri (){
        return radio*2;
        
    }
    
    
}
