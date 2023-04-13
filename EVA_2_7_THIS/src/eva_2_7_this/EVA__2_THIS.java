/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_7_this;

/**
 *
 * @author Alan
 */
public class EVA__2_THIS {

    /**
     * @param args the command line arguments
     */
    //se tiene que crear un objeto antes para utilizar una instancia
    //no se puede referenciar en un contexto estatico
    //this. solo funciona internamente, no funciona a fuera de los objetos
    public static void main(String[] args) {
        //imprimir();
        //this no se puede usar en un contexto estatico
        
    }
    
    
    public void imprimir (){
        //tambien es visible this.
        
    }
    //this es un referenciador a una instancia de la clase
    //todos los objetos tienen this
    //pueden usar this en cualquier clase
class Persona{
    private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
            //this.nombre es el atributo de la clase
            //nombre es la variable (parametro) declarado en el método
        }
    
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre= nombre; //nombre intercambiado por x permite resolver este problema de colisión.
    
    }
    public void imprimirDatos(){
        System.out.println("El nombre es:" + this.nombre);
    }
  }
}
