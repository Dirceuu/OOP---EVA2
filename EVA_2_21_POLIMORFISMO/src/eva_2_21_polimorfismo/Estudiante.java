/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_21_polimorfismo;

/**
 *
 * @author invitado
 */
//Clase derivada extends Clase Base
//Subclase extends Superclase
//Hijo extends Padre
public class Estudiante extends Persona {
        private String nControl;
        
    public Estudiante(){
        super();
        this.nControl = "-----";
    }

    public Estudiante(String nControl, String Nombre, String Apellido, int edad) {
        
        super(Nombre, Apellido, edad); //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE.
        this.nControl = nControl;
    }
    
    //OVERRIDE: RERMPLAZA AL METÓDO DE PERSONA
    //SUPER CLASE, ENE STE CASI, OCULTAMOS A; imprimirDatos() de
    //Persoba
    public void imprimirDatos(){
        /*System.out.println("Datos");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("#Control: " + getnControl());*/
        
        super.imprimirDatos();
        System.out.println("No de control: " + getnControl());
        
        
    }
            
    
    public Estudiante(String nControl) {
        this.nControl = nControl;
    }
        
    //METODOS GET Y SET
    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
}

