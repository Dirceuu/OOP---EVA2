/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva_2_19_interfaces_figuras;

/**
 *
 * @author Alan
 */

//No se pueden instanciar las interfaces.
//Son como un contrato: Rdtoy obligado a implementar.
//Solo métodos abstractos y constantes.
public interface FIGURAS {
    public abstract double calcularArea();
    double calcularPeri();
}
