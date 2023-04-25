/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_22_polimorfismo_figuras;

/**
 *
 * @author Alan
 */
public class Círculo implements FIGURAS, MostrarDatos{
        int radio;

        
    public Círculo() {
        this.radio = 0;
    }

    public Círculo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (radio*2);
        
    }

    @Override
    public void imprmirDatos() {
        System.out.println("´Círculo: ");
        System.out.println("´Radio: " + radio);
        System.out.println("´Area: " + calcularArea());
        System.out.println("´Perimetro: " + calcularPeri());
        

    }
        
        
    
}
