/**
 * Ejecuta un ejemplo de Impresora
 * 
 * @author (Milton Jes�s Vera Contreras - mjvera@bari.ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class ImpresoraEjecutable
{

   private ImpresoraEjecutable(){}

    /**
     * M�todo main
     */
    public static void main(String args[]) {
    	Impresora modelo = new Impresora();
    	VistaImpresora vista = new VistaImpresora();
        ControlImpresora control = new ControlImpresora(vista, modelo);
        vista.setControl(control);
    }

}//fin class ImpresoraEjecutable
