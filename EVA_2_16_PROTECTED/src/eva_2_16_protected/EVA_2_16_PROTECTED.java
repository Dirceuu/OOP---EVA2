/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_16_protected;

/**
 *
 * @author Alan
 */
public class EVA_2_16_PROTECTED {

 

    public static void main(String[] args) {
        SuperClase objS = new SuperClase();
        objS.dato = 100;
    }
}
    class SuperClase{
        protected int dato;
        
        /*
        public int getDato(){
        return dato;
        
        public void setDato(int dato){
        this.dato=dato;
        }
        */
        
    }
    
    class SubClase extends SuperClase{
        public void imprimirDato () {
            System.out.println("");
        }
    }
    
