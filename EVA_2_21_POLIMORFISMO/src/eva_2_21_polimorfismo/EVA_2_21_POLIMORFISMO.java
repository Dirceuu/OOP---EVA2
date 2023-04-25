package eva_2_21_polimorfismo;

/**
 *
 * @author Alan
 */
public class EVA_2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estu = new Estudiante("C22550143", "Alan", "Rivas", 19);
        estu.imprimirDatos();
        Docentes doce = new Docentes();
        doce.setNombre("Martina");
        doce.setApellido("Cháves");
        doce.setEdad(54);
        doce.setPlaza("Tiempo completo");
        doce.imprimirDatos();

//Puedo tratar a los objetos de las superclases como objetos de la super clase. no al réves.

//Estosy asignando un objeto tipo estudiante a persona
    Persona perso = estu;
    //Estoy generalizando (simplificando).
//perso.

    Persona perso2 = doce;
    
    Persona perso3 = new Persona();
    //Es imposible convertir una persona en un estudiante
    //No podemos agregar cosas, simplmente las ocultamos.
    //propiedades
    //Estudiante estudiante = perso3;
    }
    
}
