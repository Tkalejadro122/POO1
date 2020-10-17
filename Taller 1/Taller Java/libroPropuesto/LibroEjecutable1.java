
/**
 * Un ejemplo que modela un único Libro simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class LibroEjecutable1
{
  private LibroEjecutable1(){}

  public static void main(String [] args)
  {
     Libro libro = new Libro(2016,100,0,"Libro Texto de Programación Orientada a Objetos","UFPS","Milton Jesús Vera Contreras",5);
     GUILibro v = new GUILibro(libro);
  }//fin main

}//fin class LibroEjecutable1
