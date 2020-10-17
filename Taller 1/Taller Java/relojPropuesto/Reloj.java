/**
 * Un ejemplo que modela un Reloj simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Reloj
{
   protected int segundos;
   protected int minutos;
   protected int horas;   
   
   public Reloj(){

   }
   
   public Reloj(int segundos, int minutos, int horas){
     this.segundos = segundos;
     this.minutos = minutos;
     this.horas = horas;
   }

   /**Metodo de acceso a la propiedad segundos*/
    public int getSegundos(){
        return this.segundos;
    }//end method getSegundos

    /**Metodo de modificación a la propiedad segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }//end method setSegundos

    /**Metodo de acceso a la propiedad minutos*/
    public int getMinutos(){
        return this.minutos;
    }//end method getMinutos

    /**Metodo de modificación a la propiedad minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }//end method setMinutos

    /**Metodo de acceso a la propiedad horas*/
    public int getHoras(){
        return this.horas;
    }//end method getHoras

    /**Metodo de modificación a la propiedad horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }//end method setHoras

   /*De aqui en adelante Ud. debe completar los algoritmos para que el programa funcione*/
   
   /**Metodo para mover le segundero*/ 
   public void moverSegundero(){
     //COMPLETE EL ALGORITMO
     if(getSegundos() >=0  && getSegundos() < 59) segundos++;
     else
     {
         setSegundos(0);
         moverMinutero();
     }
   }

   /**Metodo para mover le minutero*/ 
   public void moverMinutero(){
     //COMPLETE EL ALGORITMO
     if(getMinutos() >=0  && getMinutos() < 59) minutos++;
     else
     {
         setMinutos(0);
         moverHorario();
     }
   }

   /**Metodo para mover le horario*/ 
   public void moverHorario(){
     //COMPLETE EL ALGORITMO
     if(getHoras() >=0  && getHoras() < 12) horas++;
     else setHoras(1);
   }
    

}