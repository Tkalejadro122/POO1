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
 * Un ejemplo que modela un Reloj simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class GUIReloj extends JFrame {
	
	/**Una referencia al objeto del modelo*/
	private Reloj reloj;
	
	//A continuación los elementos de la GUI
	
    private JButton cmdMoverHorario;
    private JButton cmdMoverMinutero;
    private JButton cmdMoverSegundero;
    private JLabel lblAviso;
    private JLabel lblImagen;
    private JLabel lblSegundos;
    private JLabel lblMinutos;
    private JLabel lblHoras;
    private JPanel panelBotones;
    private JPanel panelDatos;
    private JPanel panelImagen;
    private JTextField txtSegundos;
    private JTextField txtMinutos;
    private JTextField txtHoras;	
    
    /** La vista recibe un objeto del modelo */
    public GUIReloj(Reloj reloj) {
    	this.reloj = reloj;
        initComponents();
    }
    
    /** 
     * Inicializa la GUI, se encarga de crear los botones
     * y las etiquetas de texto y definir la apariencia de la ventana
     */
    private void initComponents() {

        panelBotones = new JPanel();
        cmdMoverSegundero = new JButton();
        cmdMoverMinutero = new JButton();
        cmdMoverHorario = new JButton();
        panelImagen = new JPanel();
        lblImagen = new JLabel();
        panelDatos = new JPanel();
        lblHoras = new JLabel();
        txtHoras = new JTextField();
        lblMinutos = new JLabel();
        txtMinutos = new JTextField();
        lblSegundos = new JLabel();
        txtSegundos = new JTextField();
        lblAviso = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout(2, 0));

        panelBotones.setLayout(new GridLayout(1, 3, 2, 2));

        cmdMoverSegundero.setText("Mover Segundero");
        panelBotones.add(cmdMoverSegundero);

        cmdMoverMinutero.setText("Mover Minutero");
        panelBotones.add(cmdMoverMinutero);

        cmdMoverHorario.setText("Mover Horario");
        panelBotones.add(cmdMoverHorario);

        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        panelImagen.setLayout(new BorderLayout());

        lblImagen.setIcon(new ImageIcon("reloj.jpg"));
        panelImagen.add(lblImagen, BorderLayout.CENTER);

        getContentPane().add(panelImagen, BorderLayout.EAST);

        panelDatos.setLayout(new GridLayout(3, 2, 2, 0));

        lblHoras.setFont(new Font("Verdana", 0, 12));
        lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
        lblHoras.setText("Horas");
        lblHoras.setBorder(BorderFactory.createTitledBorder(""));
        panelDatos.add(lblHoras);

        txtHoras.setFont(new Font("Verdana", 1, 24));
        txtHoras.setHorizontalAlignment(JTextField.CENTER);
        txtHoras.setText("0");
        txtHoras.setDisabledTextColor(new Color(0, 0, 255));
        txtHoras.setEnabled(false);
        panelDatos.add(txtHoras);

        lblMinutos.setFont(new Font("Verdana", 0, 12));
        lblMinutos.setHorizontalAlignment(SwingConstants.CENTER);
        lblMinutos.setText("Minutos");
        lblMinutos.setBorder(BorderFactory.createTitledBorder(""));
        panelDatos.add(lblMinutos);

        txtMinutos.setFont(new Font("Verdana", 1, 24));
        txtMinutos.setHorizontalAlignment(JTextField.CENTER);
        txtMinutos.setText("0");
        txtMinutos.setDisabledTextColor(new Color(0, 0, 255));
        txtMinutos.setEnabled(false);
        panelDatos.add(txtMinutos);

        lblSegundos.setFont(new Font("Verdana", 0, 12));
        lblSegundos.setHorizontalAlignment(SwingConstants.CENTER);
        lblSegundos.setText("Segundos");
        lblSegundos.setBorder(BorderFactory.createTitledBorder(""));
        panelDatos.add(lblSegundos);

        txtSegundos.setFont(new Font("Verdana", 1, 24));
        txtSegundos.setHorizontalAlignment(JTextField.CENTER);
        txtSegundos.setText("0");
        txtSegundos.setDisabledTextColor(new Color(0, 0, 255));
        txtSegundos.setEnabled(false);
        panelDatos.add(txtSegundos);

        getContentPane().add(panelDatos, BorderLayout.CENTER);

        lblAviso.setFont(new Font("Verdana", 1, 24));
        lblAviso.setText("El Reloj de Matusalén");
        getContentPane().add(lblAviso, BorderLayout.NORTH);
        
        
        //clase anónima para eventos de boton cmdMoverSegundero, esto genera VistaReloj$1.class
        cmdMoverSegundero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdMoverSegunderoActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdMoverMinutero, esto genera VistaReloj$2.class
        cmdMoverMinutero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdMoverMinuteroActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdMoverHorario, esto genera VistaReloj$3.class
        cmdMoverHorario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdMoverHorarioActionPerformed(evt);
            }
        });
        
        setTitle("Reloj");
        pack();
        actualizarGUI();
        setVisible(true);
    }//fin initComponents

    /**Evento click cmdMoverHorarioActionPerformed*/
    private void cmdMoverHorarioActionPerformed(ActionEvent evt) {
     this.reloj.moverHorario();
     this.actualizarGUI();
    }//fin cmdMoverHorarioActionPerformed

    /**Evento click cmdMoverMinuteroActionPerformed*/
    private void cmdMoverMinuteroActionPerformed(ActionEvent evt) {
       this.reloj.moverMinutero();
       this.actualizarGUI();      
    }//fin cmdMoverMinuteroActionPerformed

    /**Evento click cmdMoverSegunderoActionPerformed*/
    private void cmdMoverSegunderoActionPerformed(ActionEvent evt) {
       this.reloj.moverSegundero();
       this.actualizarGUI();      
    }//fin cmdMoverSegunderoActionPerformed
    
	/**Un método que actualiza la vista desde el modelo*/
    private void actualizarGUI()
    {
       this.txtSegundos.setText(String.valueOf(this.reloj.getSegundos()));
       this.txtMinutos.setText(String.valueOf(this.reloj.getMinutos()));
       this.txtHoras.setText(String.valueOf(this.reloj.getHoras()));
    }//fin actualizarGUI    
    
}//fin clase
