/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public class EVA_2_24_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //COLLECTION ---> CONTENEDORES
    //
    ArrayList miArreglo = new ArrayList(); //Guardamos objetos
    miArreglo.add(new Persona());
    miArreglo.add(new Automovil());
    miArreglo.add(new Perro());
    
    ArrayList<Integer> miArreglo2 = new ArrayList<Integer>(); //Guardamos 
    miArreglo2.add(100);
    miArreglo2.add(200);
    miArreglo2.add(300);
    miArreglo2.add(400);
        System.out.println(miArreglo2);
    }

    
}

class Persona{

}

class Automovil{
    
}

class Perro{
    
}
