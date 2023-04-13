package eva_2_8_super;

/**
 *
 * @author Alan
 */
public class EVA_2_8_SUPER {

    
    public static void main(String[] args) {
        
        Animal animal = new Animal ("uwu", 12);
        Mamifero mamifero = new Mamifero("MArron", "bigT", 123);
        System.out.println("--------------");
        Canes can = new Canes();
    }
    
}

class Animal{
    private String nombre;
    private int Peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    
    
    
    public Animal (){
        System.out.println("IT'S ALIVE");
    }

    public Animal(String nombre, int Peso) {
        this.nombre = nombre;
        this.Peso = Peso;
        System.out.println("IT'S ALIVE, constructor 2!!");

    }
    
    public void Respirar(){
        System.out.println("IT'S ALIVE");
    }

}

class Mamifero extends Animal{
    private String colorPelo;
    public Mamifero(){
        //Super --> referenciador constructores y a métodos, super clase
        //lo primero a llamar en un constructor es llamar al constructor de la super clase
        super();//llamada al constructor default
        System.out.println("I'M MAMIFERO");
        
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Mamifero(String colorPelo, String nombre, int Peso) {
        super(nombre, Peso);//llamada al constructor de la super clase
        this.colorPelo = colorPelo;
        System.out.println("soy un mamifero constructor 2");

    }

}

class Canes extends Mamifero{

        public Canes() {
            super ();
            System.out.println("Soy un can");
        }
    
    
}
