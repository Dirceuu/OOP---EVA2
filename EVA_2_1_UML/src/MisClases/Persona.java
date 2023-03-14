/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author Alan
 */
public class Persona {
    private int ID;
    private String Name;
    private int age;
//------------------------------
//Metodos set:

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//------------------------------
//Metodos get:

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }
public void imprimirDatos(){
    System.out.println("Datos: ");
    System.out.println("ID: "+ ID);
    System.out.println("Nombre: "+ Name);
    System.out.println("Edad: "+ age);
}
}

