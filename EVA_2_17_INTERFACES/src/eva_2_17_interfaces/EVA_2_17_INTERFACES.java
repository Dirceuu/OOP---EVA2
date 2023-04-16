/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_17_interfaces;

/**
 *
 * @author Alan
 */
public class EVA_2_17_INTERFACES {
//CLASE 100% ABSTRACTA
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona perso = new Persona ("Alan", 19);
        perso.imprimirDAtos();
        Computadora compu = new Computadora ("Intel i7", 12, 25000, "Computadora para procesos gamer");
        compu.imprimirDAtos();
    }
    
}
