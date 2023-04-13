/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_11_override_figuras;

/**
 *
 * @author Alan
 */
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo() {
        this.altura = 0;
        this.base = 0;
    }
    

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    

    @Override
    public double calcularPeri(){
        return base + altura + Math.sqrt((base*base) + (altura*altura));
    }

    
    
}
