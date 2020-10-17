import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * Write a description of class ControlImpresora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ControlImpresora implements ActionListener
{
    VistaImpresora vista;
    Impresora modelo;

    public ControlImpresora(VistaImpresora vista, Impresora modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void actionPerformed(ActionEvent evt) {
        if("cmdImprimir".equals(evt.getActionCommand()))
         cmdImprimirActionPerformed(evt);
        if("cmdRecargarPapel".equals(evt.getActionCommand()))
         cmdRecargarPapelActionPerformed(evt);
        if("cmdRecargarTinta".equals(evt.getActionCommand()))
         cmdRecargarTintaActionPerformed(evt);
    }

    /**Evento click cmdImprimirActionPerformed*/
    private void cmdImprimirActionPerformed(ActionEvent evt) {
        String paginas = JOptionPane.showInputDialog(vista,"Cu�ntas P�ginas?");
        try{
            modelo.imprimir(Integer.valueOf(paginas));
        }catch(Exception e){
            System.err.println("Datos no v�lidos, error no controlado");
        }
        vista.actualizarGUI(modelo.getTinta(), modelo.getHojas(), modelo.getPaginasPendientesPorImprimir(), 
                            modelo.estaAtascadaPorPapel(), modelo.estaAtascadaPorTinta());
    }//fin cmdImprimirActionPerformed

    /**Evento click cmdRecargarPapelActionPerformed*/
    private void cmdRecargarPapelActionPerformed(ActionEvent evt) {
        String papel = JOptionPane.showInputDialog(vista,"Cu�nto Papel?");
        try{
            modelo.recargarHojas(Integer.valueOf(papel));
        }catch(Exception e){
            System.err.println("Datos no v�lidos, error no controlado");
        }
        vista.actualizarGUI(modelo.getTinta(), modelo.getHojas(), modelo.getPaginasPendientesPorImprimir(), 
                            modelo.estaAtascadaPorPapel(), modelo.estaAtascadaPorTinta());
    }//fin cmdRecargarPapelActionPerformed

    /**Evento click cmdRecargarTintaActionPerformed*/
    private void cmdRecargarTintaActionPerformed(ActionEvent evt) {
        String tinta = JOptionPane.showInputDialog(vista,"Cu�nta Tinta?");
        try{
            modelo.recargarTinta(Integer.valueOf(tinta));
        }catch(Exception e){
            System.err.println("Datos no v�lidos, error no controlado");
        }
        vista.actualizarGUI(modelo.getTinta(), modelo.getHojas(), modelo.getPaginasPendientesPorImprimir(), 
                            modelo.estaAtascadaPorPapel(), modelo.estaAtascadaPorTinta());
    }//fin cmdRecargarTintaActionPerformed
}
