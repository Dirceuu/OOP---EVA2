package eva_2_9_super2;

/**
 *
 * @author Alan
 */
public class Docentes extends Persona {
        private String plaza;
        
public Docentes(){
    super();
    this.plaza = "----";
    
}

public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("PLAZA: " + plaza);
}

public Docentes (String Nombre, String Apellido, int edad, String plaza){
        super(Nombre, Apellido, edad);
        this.plaza = plaza;
}
        

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
}

