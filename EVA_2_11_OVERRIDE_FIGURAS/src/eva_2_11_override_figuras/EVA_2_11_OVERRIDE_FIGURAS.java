package eva_2_11_override_figuras;

/**
 *
 * @author Alan
 */
public class EVA_2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ÁREA Y PERIMETRO DE UN CÍRCULO:");
        Círculo cir = new Círculo(2);
        System.out.println("Área: " + 
            String.format("%.4f", cir.calcularArea()) );
        System.out.println("Perimetro: " + 
            String.format("%.4f", cir.calcularPeri()) + "\n");
        
        System.out.println("ÁREA Y PERIMETRO DE UN TRIÁNGULO RECTANGULO:");
        Triangulo tri = new Triangulo (2, 2);
        System.out.println("ÁREA: " + 
                String.format("%.4f", tri.calcularArea()) );
        System.out.println("Perimetro: " + 
                String.format("%.4f", tri.calcularPeri()) + "\n");
        
        
        
    }
    
}
