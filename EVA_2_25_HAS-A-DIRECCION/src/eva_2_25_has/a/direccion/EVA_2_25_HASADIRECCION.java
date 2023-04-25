
package eva_2_25_has.a.direccion;

/**
 *
 * @author Alan
 */
public class EVA_2_25_HASADIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personas person = new Personas();
            person.setNombre("Ad");
            person.setApellido("Rivas");
            person.setEdad(18);
            
            
            
            Direccion dir = new Direccion();
            dir.setCalle("Industrias");
            dir.setNumero(11101);
            dir.setColonia("Complejo industrial chihuahua");
            dir.setCp("31135");
            dir.setCiudad("Chihuahua");
            dir.setEstado("Chihuahua");
            person.setDireccion(dir);
            person.imprmirDatos();
            
        

    }
    
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "--";
        this.numero = 0;
        this.colonia = "---";
        this.cp = "---";
        this.ciudad = "---";
        this.estado = "---";
        
    }

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }
    
    
            
            

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("Dirección: " );
        System.out.println(calle + " #" + numero + ", " + colonia + ", C.P:" + cp + ", " + estado +", " + ciudad);
}
    
}

class Personas{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion; //Persona HAS A (Tiene una ) Direccion

    public Personas() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
        this.direccion = null; //no existe el objeto dirreción.
      
    }

    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprmirDatos(){
        System.out.println("Persona: ");
        System.out.println("nombre " + nombre + "Apellido: " + apellido + "Edad: " + edad);
        if (direccion == null){
            System.out.println("Sin direccion.");
        } else {
           direccion.imprimirDatos();
        }
    }
}
    
class Sucursal {
    private String nombreSucursal;
    private Direccion direccion;
    
}