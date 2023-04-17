/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_19_interfaces_figuras;

/**
 *
 * @author Alan
 */
public class EVA_2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//No se puede instanciar objetos de FIGURAS.
    Triangulo tri = new Triangulo (20,20);
    tri.imprmirDatos();
    
    Círculo cir = new Círculo (2);
    cir.imprmirDatos();
    }
    
    
}
