/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_2_19_interfaces_figuras;

/**
 *
 * @author Alan
 */
public class Triangulo implements FIGURAS, MostrarDatos{
    int base;
    int altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPeri() {
        double hip = Math.hypot(base, altura);
        return base + altura + hip;
        
    }

    @Override
    public void imprmirDatos() {
        System.out.println("Traingulo: " );
        System.out.println("Base: " + base );
        System.out.println("Altura: " + altura );
        System.out.println("Hipotenusa: " );
        System.out.println("Area: " + calcularArea() );
        System.out.println("Base: " + calcularPeri() );
    }
    
    
    
}
