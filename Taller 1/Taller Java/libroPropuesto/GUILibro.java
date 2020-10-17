import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
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
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Un ejemplo que modela un único Libro simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class GUILibro extends JFrame 
{

    /**La vista referencia un objeto del modelo*/
    private Libro libro;    
    
    //A continuación los elementos de la GUI
    
    private  JPanel panelBotones;
    private JPanel panelImagen;
    private  JButton cmdGuardarCambios;
    private  JButton cmdRegistrarDevolucion;
    private  JButton cmdRegistrarPrestamo;
    private  JButton cmdRefrescar;
    private  JPanel panelDatos;
    private  JLabel lblAñoEdicion;
    private  JLabel lblEditorial;
    private  JLabel lblTitulo;
    private  JLabel lblAutores;
    private  JLabel lblPrecio;
    private  JLabel lblNumeroDePaginas;
    private  JLabel lblNumeroDeCopias;
    private  JLabel lblNumeroDeCopiasDisponibles;
    private  JLabel lblNumeroDeCopiasPrestadas;
    private  JTextField txtAñoEdicion;
    private  JTextField txtEditorial;
    private  JTextField txtTitulo;
    private  JTextField txtAutores;
    private  JTextField txtPrecio;
    private  JTextField txtNumeroDePaginas;
    private  JTextField txtNumeroDeCopias;
    private  JTextField txtNumeroDeCopiasDisponibles;
    private  JTextField txtNumeroDeCopiasPrestadas;
    private  JLabel lblAviso;
    private  JLabel lblImagen;
    
    /** El constructor de la vista recibe un Libro*/
    public GUILibro(Libro libro) {
       initComponents();//se acostumbra invocar un método privado que inicialice la GUI
       this.libro = libro;
       this.actualizarGUI();//Inicializa la GUI con los datos del libro recibido
       this.center();
    }//fin constructor
    
    /** 
     * Inicializa la GUI, se encarga de crear los botones
     * y las etiquetas de texto y definir la apariencia de la ventana
     */
    private void initComponents() {
        panelDatos = new  JPanel();
        lblAñoEdicion = new  JLabel();
        txtAñoEdicion = new  JTextField();
        lblEditorial = new  JLabel();
        txtEditorial = new  JTextField();
        lblTitulo = new  JLabel();
        txtTitulo = new  JTextField();
        lblAutores = new  JLabel();
        txtAutores = new  JTextField();
        lblPrecio = new  JLabel();
        txtPrecio = new  JTextField();
        lblNumeroDePaginas = new  JLabel();
        txtNumeroDePaginas = new  JTextField();
        lblNumeroDeCopias = new  JLabel();
        txtNumeroDeCopias = new  JTextField();
        lblNumeroDeCopiasDisponibles = new  JLabel();
        txtNumeroDeCopiasDisponibles = new  JTextField();
        lblNumeroDeCopiasPrestadas = new  JLabel();
        txtNumeroDeCopiasPrestadas = new  JTextField();
        panelBotones = new  JPanel();
        cmdGuardarCambios = new  JButton();
        cmdRegistrarPrestamo = new  JButton();
        cmdRegistrarDevolucion = new  JButton();
        cmdRefrescar = new  JButton();
        lblAviso = new  JLabel();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        panelDatos.setLayout(new java.awt.GridLayout(9, 2, 2,2));

        lblTitulo.setText("T\u00edtulo");
        lblTitulo.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblTitulo);

        txtTitulo.setText("??");
        txtTitulo.setColumns(20);
        panelDatos.add(txtTitulo);

        lblAutores.setText("Autores");
        lblAutores.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblAutores);

        txtAutores.setText("??");
        panelDatos.add(txtAutores);

        lblAñoEdicion.setText("A\u00f1o de Edici\u00f3n");
        lblAñoEdicion.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblAñoEdicion);

        txtAñoEdicion.setText("0");
        panelDatos.add(txtAñoEdicion);
        
        lblEditorial.setText("Editorial");
        lblEditorial.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblEditorial);

        txtEditorial.setText("??");
        panelDatos.add(txtEditorial);

        lblPrecio.setText("Precio");
        lblPrecio.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblPrecio);

        txtPrecio.setHorizontalAlignment( JTextField.CENTER);
        txtPrecio.setText("0");
        panelDatos.add(txtPrecio);

        lblNumeroDePaginas.setText("N\u00famero de Paginas");
        lblNumeroDePaginas.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblNumeroDePaginas);

        txtNumeroDePaginas.setHorizontalAlignment( JTextField.CENTER);
        txtNumeroDePaginas.setText("0");
        panelDatos.add(txtNumeroDePaginas);

        lblNumeroDeCopias.setText("N\u00famero de Copias");
        lblNumeroDeCopias.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblNumeroDeCopias);

        txtNumeroDeCopias.setHorizontalAlignment( JTextField.CENTER);
        txtNumeroDeCopias.setText("0");
        panelDatos.add(txtNumeroDeCopias);

        lblNumeroDeCopiasDisponibles.setText("N\u00famero de Copias Disponibles");
        lblNumeroDeCopiasDisponibles.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblNumeroDeCopiasDisponibles);

        txtNumeroDeCopiasDisponibles.setEditable(false);
        txtNumeroDeCopiasDisponibles.setFont(new java.awt.Font("Times New Roman", 1, 11));
        txtNumeroDeCopiasDisponibles.setForeground(new java.awt.Color(0, 0, 255));
        txtNumeroDeCopiasDisponibles.setHorizontalAlignment( JTextField.CENTER);
        txtNumeroDeCopiasDisponibles.setText("0");
        panelDatos.add(txtNumeroDeCopiasDisponibles);

        lblNumeroDeCopiasPrestadas.setText("N\u00famero de Copias Prestadas");
        lblNumeroDeCopiasPrestadas.setBorder( BorderFactory.createTitledBorder(""));
        panelDatos.add(lblNumeroDeCopiasPrestadas);

        txtNumeroDeCopiasPrestadas.setEditable(false);
        txtNumeroDeCopiasPrestadas.setFont(new java.awt.Font("Times New Roman", 1, 11));
        txtNumeroDeCopiasPrestadas.setForeground(new java.awt.Color(255, 0, 0));
        txtNumeroDeCopiasPrestadas.setHorizontalAlignment( JTextField.CENTER);
        txtNumeroDeCopiasPrestadas.setText("0");
        panelDatos.add(txtNumeroDeCopiasPrestadas);

        getContentPane().add(panelDatos, BorderLayout.CENTER);

        panelBotones.setLayout(new java.awt.GridLayout(1, 4));

        cmdGuardarCambios.setText("Guardar Cambios");
        panelBotones.add(cmdGuardarCambios);
        
        cmdRefrescar.setText("Actualizar Pantalla");
        panelBotones.add(cmdRefrescar);

        cmdRegistrarPrestamo.setText("Registrar Pr\u00e9stamo");
        panelBotones.add(cmdRegistrarPrestamo);

        cmdRegistrarDevolucion.setText("Registrar Devoluci\u00f3n");
        panelBotones.add(cmdRegistrarDevolucion);

        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        lblAviso.setFont(new java.awt.Font("Times New Roman", 1, 11));
        lblAviso.setHorizontalAlignment( SwingConstants.CENTER);
        lblAviso.setText("Registro de Pr\u00e9stamos y Devoluciones del Libro");
        lblAviso.setFont(new java.awt.Font("Times New Roman", 1, 25));
        getContentPane().add(lblAviso, BorderLayout.NORTH);
        
        lblImagen = new  JLabel();
        lblImagen.setIcon(new ImageIcon("libro.jpg"));
        
        panelImagen = new JPanel();
        panelImagen.setLayout(new BorderLayout());
        panelImagen.add(lblImagen,java.awt.BorderLayout.CENTER);
        panelImagen.add(new JLabel("   "),BorderLayout.EAST);
        panelImagen.add(new JLabel("   "),BorderLayout.WEST);
        getContentPane().add(panelImagen, BorderLayout.EAST);
        
        //clase anónima para eventos de boton cmdGuardarCambios, esto genera VistaLibro$1.class
        cmdGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarCambiosActionPerformed(evt);
            }
        });        
        
        //clase anónima para eventos de boton cmdRegistrarPrestamo, esto genera VistaLibro$2.class
        cmdRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistrarPrestamoActionPerformed(evt);
            }
        });
        
        //clase anónima para eventos de boton cmdRegistrarDevolucion, esto genera VistaLibro$3.class
        cmdRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistrarDevolucionActionPerformed(evt);
            }
        });
        
         //clase anónima para eventos de boton cmdRefrescar, esto genera VistaLibro$4.class
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarGUI();
            }
        });
        
        setTitle("Registro de Pr\u00e9stamos y Devoluciones del Libro");
        pack();
        setVisible(true);//hacer visible la ventana
    }//fin initComponents
    
    /**Evento click botón cmdRegistrarPrestamo*/
    private void cmdRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) 
    {
      if(this.libro.prestar())
       this.actualizarGUI();
      else JOptionPane.showMessageDialog(this, "No se pudo registrar Préstamo","Libro", JOptionPane.ERROR_MESSAGE);
    }//fin cmdRegistrarPrestamoActionPerformed
    
    /**Evento click botón cmdRegistrarDevolucion*/
    private void cmdRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) 
    {
      if(this.libro.devolver())
       this.actualizarGUI();
      else JOptionPane.showMessageDialog(this, "No se pudo registrar Devolución","Libro", JOptionPane.ERROR_MESSAGE);
    }//fin cmdRegistrarDevolucionActionPerformed

   /**Evento click botón cmdGuardarCambios*/
    private void cmdGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) 
    {
      if(this.libro.cambiarNumeroDeCopias(Integer.parseInt(txtNumeroDeCopias.getText()))){
       this.libro.setAnoEdicion(Integer.parseInt(txtAñoEdicion.getText()));
       this.libro.setEditorial(txtEditorial.getText());
       this.libro.setTitulo(txtTitulo.getText());
       this.libro.setAutores(txtAutores.getText());
       this.libro.setPrecio(Integer.parseInt(txtPrecio.getText()));
       this.libro.setNumeroDePaginas(Integer.parseInt(txtNumeroDePaginas.getText()));
       JOptionPane.showMessageDialog(this, "Cambios Guardados Correctamente");
     }
     else
      JOptionPane.showMessageDialog(this, "Cantidad de copias inferior a la cantidad de prestamos","Libro", JOptionPane.ERROR_MESSAGE);
     this.actualizarGUI();
    }//fin cmdGuardarCambiosActionPerformed
    
	/**Un método que actualiza la vista desde el modelo*/
    private void actualizarGUI()
    {
      txtAñoEdicion.setText(String.valueOf(this.libro.getAnoEdicion()));
      txtEditorial.setText(this.libro.getEditorial());
      txtTitulo.setText(this.libro.getTitulo());
      txtAutores.setText(this.libro.getAutores());
      txtPrecio.setText(String.valueOf(this.libro.getPrecio()));
      txtNumeroDePaginas.setText(String.valueOf(this.libro.getNumeroDePaginas()));
      txtNumeroDeCopias.setText(String.valueOf(this.libro.getNumeroDeCopias()));
      txtNumeroDeCopiasDisponibles.setText(String.valueOf(this.libro.getNumeroDeCopiasDisponibles()));
      txtNumeroDeCopiasPrestadas.setText(String.valueOf(this.libro.getNumeroDeCopiasPrestadas()));
    }//fin actualizarGUI
    
    /**Metodo para centrar*/
    private void center() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
    
}//fin clase
