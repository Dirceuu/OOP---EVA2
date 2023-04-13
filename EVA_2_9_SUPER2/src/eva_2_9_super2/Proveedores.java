/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_9_super2;

/**
 *
 * @author invitado
 */
public class Proveedores extends Persona {
        private String rfc;
        
public Proveedores (){
    super();
    this.rfc = "---";
}

public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("RFC: " + rfc);
}

public Proveedores (String Nombre, String Apellido, int edad, String rfc){
    super (Nombre, Apellido, edad);
    this.rfc = rfc;
    
}

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
        
        
    
}

