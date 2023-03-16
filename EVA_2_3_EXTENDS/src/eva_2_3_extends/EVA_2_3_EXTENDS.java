
package eva_2_3_extends;

/**
 *
 * @author invitado
 */
public class EVA_2_3_EXTENDS {

  /**
   * @param args the command line arguments
   */
 public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Alan, Dirceu");
        estu.setApellido("Rivas");
        estu.setEdad(19);
        estu.setnControl("C22550142");
        
        System.out.println("IMPRIMIR DATOS");
        System.out.println("Nombre: "+ estu.getNombre());
        System.out.println("Apellido: "+ estu.getApellido());
        System.out.println("Edad: "+ estu.getEdad());
        System.out.println("No. de control: "+ estu.getnControl());
        
        Proveedores prove = new Proveedores();
       prove.setNombre(" ");
       prove.setApellido(" ");
       prove.setEdad(29);
       prove.setRfc("ripa031224");
       
        System.out.println("Nombre: "+ prove.getNombre());
        System.out.println("Apellido: "+ prove.getApellido());
        System.out.println("Edad: "+ prove.getEdad());
        System.out.println("RCF: "+ prove.getRfc());
        
    }
    
}

