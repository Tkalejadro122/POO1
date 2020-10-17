
/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class TelevisorEjecutable
{

    private TelevisorEjecutable(){}
  
    /**
     * Metodo main
     */
    public static void main(String args[]) {
       Televisor tv = new Televisor();
       GUITelevisor v = new GUITelevisor(tv);
    }

}//fin class TelevisorEjecutable
