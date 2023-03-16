package eva_1_4_formato_apa;


public class Documento {

  private String Autor;
  private String Titulo;
  private int año;
  private String mes;
  private int dia;
  private String Ciudad;

  public Documento(String Autor, String Titulo, int año, String mes, int dia, String Ciudad) {
    this.Autor = Autor;
    this.Titulo = Titulo;
    this.año = año;
    this.mes = mes;
    this.dia = dia;
    this.Ciudad = Ciudad;
  }

    public Documento() {
    }
  
    
  public String getAutor() {
    return Autor;
  }

  public void setAutor(String Autor) {
    this.Autor = Autor;
  }

  public String getTitulo() {
    return Titulo;
  }

  public void setTitulo(String Titulo) {
    this.Titulo = Titulo;
  }

  public int getAño() {
    return año;
  }

  public void setAño(int año) {
    this.año = año;
  }

  public String getMes() {
    return mes;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public String getCiudad() {
    return Ciudad;
  }

  public void setCiudad(String Ciudad) {
    this.Ciudad = Ciudad;
  }
  
}
