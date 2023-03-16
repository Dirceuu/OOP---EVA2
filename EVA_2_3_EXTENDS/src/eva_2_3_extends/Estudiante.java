/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_3_extends;

/**
 *
 * @author invitado
 */
//Clase derivada extends Clase Base
//Subclase extends Superclase
//Hijo extends Padre
public class Estudiante extends Persona {
        private String nControl;

    public String getnControl() {
        return nControl;
    }

    public void setnControl(String nControl) {
        this.nControl = nControl;
    }
}

