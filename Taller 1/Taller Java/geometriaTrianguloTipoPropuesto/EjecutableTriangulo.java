/**
 * Un ejemplo que modela un Triangulo usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class EjecutableTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Triangulo t = new Triangulo();
       FrmTriangulo gui = new FrmTriangulo(t);
       gui.setVisible(true);
    }

}