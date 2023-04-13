/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_13_figuras_abstractas;

/**
 *
 * @author Alan
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 6;
        this.altura = 8;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(double base, double base2, double altura) {
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

    public void setAltura(double altura) {
        this.altura = altura;
    }
            
            @Override
    public double calcularArea(){
            return (base * altura)/2;
    }
    
        @Override
    public double calcularPeri(){
            double lado = ((Math.pow(base, 2))+(Math.pow(altura, 2)));
            return (lado + lado + lado);
    }
            @Override
    public String toString(){
            String resu = "Datos del triangulo: \n" + "Area: " + this.calcularArea() + "\n" + "Perimetro: " + this.calcularPeri() + "\n";
            return resu;
    }
    
}
