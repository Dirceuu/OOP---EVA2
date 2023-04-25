/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class EVA_2_22_POLIMORFISMO_FIGURAS {
 
    
    public static void main(String[] args) {
        
        /*Círculo[] círculos = new Círculo[10];
        // un arreglo en java de la posición 0 a la N-1
        //N es la cantidad de elementos del arreglo
        
        for (int i = 0; i < círculos.length; i++) {
            círculos[i] = new Círculo(i);// Creamos ubo de los objetos
            círculos[i].imprmirDatos(); */
        
        FIGURAS[] figuras;// declarando un arreglo pero no lo hemos creado
        
        // Con el scanner capturamos por el teclado la cantidad de figruas a utilizar
        Scanner input = new Scanner (System.in);
        System.out.println("¿Cuantas figuras quieres capturar");
        int cant = input.nextInt();
        figuras = new FIGURAS[cant]; //creamos el arreglo con la cantidad de figuras que quiere el usuario
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1. Círculo, 2. Triangulo. ");
            int figu = input.nextInt();
            if (figu == 1){//Círculo
                Círculo circu = new Círculo();
                System.out.println("Introduce el radio: ");
                circu.setRadio(input.nextInt());
                
                figuras[i] = circu;
            }else{//Triangulo
                Triangulo tri = new Triangulo();
                System.out.println("Introduce la base y la altura: ");
                tri.setBase(input.nextInt());
                tri.setAltura(input.nextInt());
                figuras[i] = tri;
            }
            //imprimir datos:
            for (int j = 0; j < 10; j++) {
                if (figuras[j] instanceof Círculo){
                    System.out.println("Círculo");
                    Círculo cir = (Círculo)figuras[1]; //casting
                    cir.imprmirDatos();
                }else{ System.out.println("Triangulo");
                Triangulo trian = (Triangulo)figuras[j];
                trian.imprmirDatos();
                }
            //System.out.println("Figura: " + i);
            //System.out.println("Area: " + figuras[i].calcularArea());
            //System.out.println("Figura: " + figuras[i].calcularPeri());
    
            //Casting: convertir un tipo de dato en otro
            }
        
        }
                
        
    }
    
}
