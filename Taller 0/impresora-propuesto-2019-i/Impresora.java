//import algo.*; Por ahora no importa nada

/**
 * Un ejemplo que modela una Impresora usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version (Double.MIN_VALUE) Agosto 2005 / Septiembre 20007
 */
public class Impresora
{
  /**Cantidad de tinta en mililitros*/
  //COMPLETE
  private int tinta;

  /**Cantidad de hojas*/
  //COMPLETE
  private int hojas;
  
  /**Cantidad de páginas por imprimir*/
  //COMPLETE
  private int paginasPorImprimir;
  
  /**Constructor por defecto*/
  public Impresora()
  {
    //COMPLETE
    tinta=0;
    hojas=0;
    paginasPorImprimir=0;
  }//Fin constructor por defecto
  
  /**Constructor con parámetros*/
  public Impresora(int tinta, int hojas)
  {
    //COMPLETE
    this.tinta = tinta;
    this.hojas=hojas; 
  }//Fin constructor con parámetros
  
  /**Metodo de acceso a la propiedad hojas*/
  public int getHojas()
  {
    //COMPLETE
    return hojas;
  }//fin getHojas
  
  /**Metodo de acceso a la propiedad tinta*/
  public int getTinta()
  {
    //COMPLETE
    return tinta;
  }//fin getTinta  
  
  /**Metodo para modificacion de propiedad tinta*/
  public void recargarTinta(int tinta)
  {
    //COMPLETE
    this.tinta += tinta;
    imprimir(0);
  }//fin setTinta
  
  /**Metodo para modificacion de propiedad hojas*/
  public void recargarHojas(int hojas)
  {
    //COMPLETE
    this.hojas+=hojas;
    imprimir(0);
  }//fin setHojas
  
  /**Imprime una página*/
  private void imprimir()
  {
     //COMPLETE
     if(tienePapel() &&  tieneTinta())
     {
         hojas--;
         tinta -=10;
         paginasPorImprimir--;
     }

     
  }//fin método imprimir
  
  /**Imprime varias páginas*/
  public void imprimir(int paginas)
  {
    //COMPLETE
    this.paginasPorImprimir += paginas;
    while(tienePapel() && tieneTinta() && tienePaginasPendientesPorImprimir())
    {
        imprimir();
    }
  }//fin imprimir
  
  /**Averigua si la impresora tiene papel*/
  public boolean tienePapel()
  {
    //COMPLETE
    return hojas>0;
  }//fin tienePapel
  
  public boolean tieneTinta()
  {
    //COMPLETE
    return tinta >9;
  }//fin tieneTinta
  
  public boolean tienePaginasPendientesPorImprimir()
  {
    //COMPLETE
    return paginasPorImprimir>0;
  }//hayPaginasPendientesPorImprimir
  
  public int getPaginasPendientesPorImprimir()
  {
    //COMPLETE
    return paginasPorImprimir;
  }//hayPaginasPendientesPorImprimir  
  
  public boolean estaAtascadaPorPapel()
  {
    //COMPLETE
    return !tienePapel() && !tienePaginasPendientesPorImprimir();
  }//fin estaAtascadaPorHojas
  
  public boolean estaAtascadaPorTinta()
  {
    //COMPLETE
    return !tieneTinta() && !tienePaginasPendientesPorImprimir();
  }//fin estaAtascadaPorTinta
  
}//fin clase Impresora
