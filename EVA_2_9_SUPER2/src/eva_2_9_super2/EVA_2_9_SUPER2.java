package eva_2_9_super2;

/**
 *
 * @author Alan
 */
public class EVA_2_9_SUPER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante("C22550143", "Alan", "Rivas", 19);
        estudiante.imprimirDatos();
        System.out.println("Número de control: " + estudiante.getnControl());
     
        Proveedores provedores = new Proveedores ("Danna", "Lopez", 20, "LOPE12321");
        provedores.imprimirDatos();
        System.out.println("RFC: " + provedores.getRfc());
        
        Docentes docente = new Docentes ("Adilene", "Ruiz", 22, "IDK");
        provedores.imprimirDatos();
        System.out.println("Plaza: " + docente.getPlaza());
        
        
        
    }
    
}
