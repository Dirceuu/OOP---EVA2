
package eva_2_10_override;

/**
 *
 * @author Alan
 */
public class EVA_2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso = new Persona (); //instanciar
        Persona perso2 = new Persona ("ADILENE",21);
        System.out.println(perso);
        System.out.println(perso2);
    }
    
}

class Persona {
private String Nombre;
private int edad;

public Persona() {
    this.Nombre = "----";
    this.edad = 0;
}

    public Persona(String Nombre, int edad) {
        this.edad = edad;
        this.Nombre = Nombre;
    }
    
@Override
    public String toString(){
        //NO ESTAMOS INVOCANDO AL MÉTODO SOBREESCRITO ED LA SIPER CLASE
        // AQUI ESTAMOS REEMPLAZANDO TOTALMENTE A tostring DE LA SUPER CLASE
        String cade = "Datos: " + "\n" +
                "Nombre: " + Nombre + "\n" +
                "Edad: " + edad;
                return cade;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}