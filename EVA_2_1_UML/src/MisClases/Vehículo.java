package MisClases;

/**
 *
 * @author Alan
 */
public class Vehículo {
    private String marca;
    private String modelo;
    private int año;

//metodos set
public void setMarca(String marcaVeh){
    marca = marcaVeh;
}
public void setModel(String modelVeh){
    modelo = modelVeh;
}
public void setAño(int añoVeh){
    año = añoVeh;
}
//metodos get
public String getMarca(){
    return marca;
}
public String getModel(){
    return modelo;
}
public int getAño(){
    return año;
}
public void imprimirDatos(){
    System.out.println("Datos: ");
    System.out.println("Marca: "+ marca);
    System.out.println("Modelo "+ modelo);
    System.out.println("Año: "+ año);
}    
}
