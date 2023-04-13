/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_13_figuras_abstractas;

/**
 *
 * @author Alan
 */
public class EVA_2_13_FIGURAS_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Figura fig = new Figura(); //NO SE PUEDEN CREAR OBJETOS DE FIGURA
        Circulo cir = new Circulo(12);
        System.out.println(cir);
        Circulo cir2 = new Circulo(3);
        System.out.println(cir2);
        
        Triangulo tri = new Triangulo(12,3);
        System.out.println(tri);
        Triangulo tri2 = new Triangulo(3,2);
        System.out.println(tri2);
        
    }
    
}