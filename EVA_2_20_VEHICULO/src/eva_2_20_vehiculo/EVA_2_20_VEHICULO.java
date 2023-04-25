/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_20_vehiculo;

/**
 *
 * @author Alan
 */
public class EVA_2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //control velocidad inerfaz dos metodos acelerar (CAmbio de velocidad entero int)
        // detener.
        // imprimirVel
        //superclase vehiculo
        //velocidad entero sin metodo get
        //marca
        //Automovil ()
        //velocidad
        //Bicicleta
        //tipo de bici
        //velocidad
        
        Automovil auto = new Automovil ("9 cilindros", "009MEX12", "AMG", 12, 21, 0, "Benz");
        System.out.println(auto);
        auto.acelerar();
        auto.detener();
        auto.imprmirVelocidad();
        
        Bicicleta bici = new Bicicleta();
        System.out.println(bici);
        bici.acelerar();
        bici.imprmirVelocidad();
        
        Bicicleta bici2 = new Bicicleta("Montaña", "Estandar", 20, "Harley DAvidson");
        System.out.println(bici2);
        bici2.imprmirVelocidad();
    }
    
}
