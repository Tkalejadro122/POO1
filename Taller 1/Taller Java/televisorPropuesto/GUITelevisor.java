import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
 public class GUITelevisor extends JFrame {
 	
    /**Una referencia al objeto del modelo*/
    private Televisor televisor;
    
    //A continuación los elementos de la GUI
    
    private JButton cmdAvanzarCanal;
    private JButton cmdBajarVolumen;
    private JButton cmdCambiarTipoEntrada;
    private JButton cmdRetrocederCanal;
    private JButton cmdSubirVolumen;
    private JLabel lblAviso;
    private JLabel lblCanal;
    private JLabel lblImagen;
    private JLabel lblAvisoCanal;    
    private JLabel lblTipoEntrada;
    private JLabel lblVolumen;
    private JPanel panelBotones;
    private JPanel panelDatos;
    private JPanel panelImagen;
    private JTextField txtCanal;
    private JTextField txtTipoEntrada;
    private JTextField txtVolumen; 	
    
    /** La vista recibe un objeto del modelo */
    public GUITelevisor(Televisor tv) {
        this.televisor = tv;
        initComponents();
    }
    
    /** 
     * Inicializa la GUI, se encarga de crear los botones
     * y las etiquetas de texto y definir la apariencia de la ventana
     */
    private void initComponents() {

        panelBotones = new JPanel();
        cmdSubirVolumen = new JButton();
        cmdBajarVolumen = new JButton();
        cmdAvanzarCanal = new JButton();
        cmdRetrocederCanal = new JButton();
        cmdCambiarTipoEntrada = new JButton();
        panelImagen = new JPanel();
        lblImagen = new JLabel();
        lblAvisoCanal = new JLabel();        
        panelDatos = new JPanel();
        lblVolumen = new JLabel();
        txtVolumen = new JTextField();
        lblCanal = new JLabel();
        txtCanal = new JTextField();
        lblTipoEntrada = new JLabel();
        txtTipoEntrada = new JTextField();
        lblAviso = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout(2, 0));

        panelBotones.setLayout(new GridLayout(1, 5, 2, 2));


        cmdSubirVolumen.setText("Subir Volumen");        
        panelBotones.add(cmdSubirVolumen);

        cmdBajarVolumen.setText("Bajar Volumen");
        panelBotones.add(cmdBajarVolumen);

        cmdAvanzarCanal.setText("Avanzar Canal");
        panelBotones.add(cmdAvanzarCanal);

        cmdRetrocederCanal.setText("Retroceder Canal");
        panelBotones.add(cmdRetrocederCanal);

        cmdCambiarTipoEntrada.setText("Cambiar Entrada");
        panelBotones.add(cmdCambiarTipoEntrada);

        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        panelImagen.setLayout(new BorderLayout());

        lblImagen.setIcon(new ImageIcon("televisor.jpg"));
        panelImagen.add(lblImagen, BorderLayout.CENTER);

        panelImagen.add(lblAvisoCanal, BorderLayout.SOUTH);
        lblAvisoCanal.setHorizontalAlignment(SwingConstants.CENTER);

        getContentPane().add(panelImagen, BorderLayout.EAST);

        panelDatos.setLayout(new GridLayout(3, 2, 2, 0));

        lblVolumen.setFont(new Font("Verdana", 0, 12));
        lblVolumen.setHorizontalAlignment(SwingConstants.CENTER);
        lblVolumen.setText("Volumen");
        lblVolumen.setBorder(BorderFactory.createTitledBorder(""));
        panelDatos.add(lblVolumen);

        txtVolumen.setFont(new Font("Verdana", 1, 24));
        txtVolumen.setHorizontalAlignment(JTextField.CENTER);
        txtVolumen.setText("0");
        txtVolumen.setDisabledTextColor(new Color(0, 0, 255));
        txtVolumen.setEnabled(false);
        panelDatos.add(txtVolumen);

        lblCanal.setFont(new Font("Verdana", 0, 12));
        lblCanal.setHorizontalAlignment(SwingConstants.CENTER);
        lblCanal.setText("Canal");
        lblCanal.setBorder(BorderFactory.createTitledBorder(""));
        panelDatos.add(lblCanal);

        txtCanal.setFont(new Font("Verdana", 1, 24));
        txtCanal.setHorizontalAlignment(JTextField.CENTER);
        txtCanal.setText("0");
        txtCanal.setDisabledTextColor(new Color(0, 0, 255));
        txtCanal.setEnabled(false);
        panelDatos.add(txtCanal);

        lblTipoEntrada.setFont(new Font("Verdana", 0, 12));
        lblTipoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
        lblTipoEntrada.setText("Entrada");
        lblTipoEntrada.setBorder(BorderFactory.createTitledBorder(""));
        panelDatos.add(lblTipoEntrada);

        txtTipoEntrada.setFont(new Font("Verdana", 1, 24));
        txtTipoEntrada.setHorizontalAlignment(JTextField.CENTER);
        txtTipoEntrada.setText("Apagado");
        txtTipoEntrada.setDisabledTextColor(new Color(0, 0, 255));
        txtTipoEntrada.setEnabled(false);
        panelDatos.add(txtTipoEntrada);

        getContentPane().add(panelDatos, BorderLayout.CENTER);

        lblAviso.setFont(new Font("Verdana", 1, 24));
        lblAviso.setText("Control del Televisor");
        getContentPane().add(lblAviso, BorderLayout.NORTH);
        
        //clase anónima para eventos de boton cmdSubirVolumen, esto genera VistaTelevisor$1.class
        cmdSubirVolumen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdSubirVolumenActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdBajarVolumen, esto genera VistaTelevisor$2.class
        cmdBajarVolumen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdBajarVolumenActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdAvanzarCanal, esto genera VistaTelevisor$3.class
        cmdAvanzarCanal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdAvanzarCanalActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdRetrocederCanal, esto genera VistaTelevisor$4.class
        cmdRetrocederCanal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdRetrocederCanalActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdCambiarTipoEntrada, esto genera VistaTelevisor$5.class        
        cmdCambiarTipoEntrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdCambiarTipoEntradaActionPerformed(evt);
            }
        });

        setTitle("Televisor");
        pack();
        setVisible(true);
    }//fin initComponents

    /**Evento click cmdCambiarTipoEntradaActionPerformed*/
    private void cmdCambiarTipoEntradaActionPerformed(ActionEvent evt) {
      String opcion = (String)JOptionPane.showInputDialog(
                    null,
                    "Tipo de Entrada TV",
                    "Seleccione el tipo de entrada y pulse aceptar",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    Televisor.tiposDeEntrada,
                    Televisor.tiposDeEntrada[1]);
     for(int i=0; i<Televisor.tiposDeEntrada.length; i++)
      if(Televisor.tiposDeEntrada[i].equals(opcion))
        televisor.setTipoDeEntrada(i);
     actualizarGUI();
    }//fin cmdCambiarTipoEntradaActionPerformed

    /**Evento click cmdRetrocederCanalActionPerformed*/
    private void cmdRetrocederCanalActionPerformed(ActionEvent evt) {    
     televisor.retrocederCanal();
     actualizarGUI();
    }//fin cmdRetrocederCanalActionPerformed

    /**Evento click cmdAvanzarCanalActionPerformed*/
    private void cmdAvanzarCanalActionPerformed(ActionEvent evt) {
     televisor.avanzarCanal();
     actualizarGUI();
    }//fin cmdAvanzarCanalActionPerformed

    /**Evento click cmdBajarVolumenActionPerformed*/
    private void cmdBajarVolumenActionPerformed(ActionEvent evt) {
      if(!televisor.bajarVolumen())
       JOptionPane.showMessageDialog(this, "Mínimo");
      else actualizarGUI();
    }//fin cmdBajarVolumenActionPerformed

    /**Evento click cmdSubirVolumenActionPerformed*/
    private void cmdSubirVolumenActionPerformed(ActionEvent evt) {
      if(!televisor.subirVolumen())
       JOptionPane.showMessageDialog(this, "Máximo");
      else actualizarGUI();
    }//fin cmdSubirVolumenActionPerformed
    
    /**Un método que actualiza la vista desde el modelo*/
    private void actualizarGUI()
    {
      txtVolumen.setText(String.valueOf(televisor.getVolumen()));
      txtCanal.setText(String.valueOf(televisor.getCanal()));
      txtTipoEntrada.setText(String.valueOf(televisor.getTipoDeEntrada()));      
    }
    
}//fin clase