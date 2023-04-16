
package eva_2_15_tienda;

/**
 *
 * @author Alan
 */
public class EVA_2_15_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Computadora compu = new Computadora();
        System.out.println(compu);
        Computadora compu2 = new Computadora(32, "Intel Core i7-10700K", "512GB",
                12.23, "MSI", "GDS", 5, 10, "DRAGON", 3);
        System.out.println(compu2);
        
        Playera playera = new Playera ();
        System.out.println(playera);
        Playera playera2 = new Playera("S", "Manga larga",
                "GIVENCHY", "VERDE FANGO", 8000, "Playera exclusiva", 12);
        System.out.println(playera2);
    
    
    }
}
