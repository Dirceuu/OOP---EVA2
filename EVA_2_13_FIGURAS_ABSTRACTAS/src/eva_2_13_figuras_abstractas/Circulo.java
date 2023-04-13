/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_13_figuras_abstractas;

/**
 *
 * @author Alan
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
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
            return Math.PI * (radio * radio);
    }
    
        @Override
    public double calcularPeri(){
            return Math.PI * (radio * 2);
    }
     @Override
    public String toString(){
            String resu= "Datos del circulo: \n" +
                                   "Area: " + this.calcularArea() + "\n" +
                                   "Perimetro: " + this.calcularPeri() + "\n";
            return resu;
    }
}
    

