/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */
public class Libro {
    String titulo;
    String name;
    int numeroPaginas;
    
  public Libro(){
      titulo = ": El sueño de una noche de verano ";
      name = ": William Shakespeare ";
      numeroPaginas = 450;
  }  
    
  public Libro(String titulo, String name){
      this.titulo = titulo;
      this.name = name;
  }
  
  public Libro (String titulo, String name, int numeroPaginas){
      this.titulo = titulo;
      this.name = name;
      this.numeroPaginas = numeroPaginas;
  }
  
  //GETTERS
  public String gettitulo(){
    
        return titulo;
    }
  
  public String getname (){
      return name;
  }
  
  public int getnumeroPaginas(){
      return numeroPaginas;
  }
  //SETTERS
  
  public void settitulo(String titulo){
      this.titulo = titulo;
  }
  
  public void setname(String name){
      this.name = name;
  }
  
  public void setnumeroPaginas(int numeroPaginas){
      this.numeroPaginas = numeroPaginas;
  }
  
  @Override
  public String toString(){
      return "\n Titulo" + titulo +  "\n Nombre " + name + "\n Numero de paginas: " + numeroPaginas;
  }
}

