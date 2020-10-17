/**
 * Un ejemplo que modela un Reloj simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class RelojEjecutable
{
  private RelojEjecutable(){}

    /**
     * Metodo main
     */
    public static void main(String args[]) {
        Reloj reloj = new Reloj();
        GUIReloj v = new GUIReloj(reloj);
    }
    
}//fin class RelojEjecutable
