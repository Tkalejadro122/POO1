import javax.swing.JOptionPane;

/**
 * GUI de un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class FrmCasaDeCambio extends javax.swing.JFrame {

    private CasaDeCambio casaDeCambio;

    /** Creates new form FrmCasaDeCambio */
    public FrmCasaDeCambio(CasaDeCambio casaDeCambio) {
        initComponents();
        this.casaDeCambio = casaDeCambio;
        actualizarGUI();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        cmdCambiarTasaDeCambio = new javax.swing.JButton();
        cmdComprarBolivares = new javax.swing.JButton();
        cmdVenderBolivares = new javax.swing.JButton();
        cmdInyectarPesos = new javax.swing.JButton();
        cmdInyectarBolivares = new javax.swing.JButton();
        cmdAyuda = new javax.swing.JButton();
        panelAdorno = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelTasas = new javax.swing.JPanel();
        lblPrecioDeCompra = new javax.swing.JLabel();
        lblPrecioDeVenta = new javax.swing.JLabel();
        lblGananciaUnBolivar = new javax.swing.JLabel();
        txtPrecioDeCompra = new javax.swing.JTextField();
        txtPrecioDeVenta = new javax.swing.JTextField();
        txtGananciaUnBolivar = new javax.swing.JTextField();
        panelBolivares = new javax.swing.JPanel();
        lblBolivaresComprados = new javax.swing.JLabel();
        lblBolivaresVendidos = new javax.swing.JLabel();
        lblBolivaresEnCaja = new javax.swing.JLabel();
        txtBolivaresComprados = new javax.swing.JTextField();
        txtBolivaresVendidos = new javax.swing.JTextField();
        txtBolivaresEnCaja = new javax.swing.JTextField();
        panelPesos = new javax.swing.JPanel();
        lblImpuestos = new javax.swing.JLabel();
        lblGanancias = new javax.swing.JLabel();
        lblPesosEnCaja = new javax.swing.JLabel();
        txtImpuestos = new javax.swing.JTextField();
        txtGanancias = new javax.swing.JTextField();
        txtPesosEnCaja = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casa de Cambio Tio Rico");
        setResizable(false);

        panelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        lblTitulo.setText("Casa de Cambio Tio Rico");
        panelTitulo.add(lblTitulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.NORTH);

        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelBotones.setLayout(new java.awt.GridLayout(2, 3));

        cmdCambiarTasaDeCambio.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        cmdCambiarTasaDeCambio.setText("Cambiar Precio del Bolivar");
        cmdCambiarTasaDeCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarTasaDeCambioActionPerformed(evt);
            }
        });
        panelBotones.add(cmdCambiarTasaDeCambio);

        cmdComprarBolivares.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        cmdComprarBolivares.setText("Comprar Bolivares");
        cmdComprarBolivares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdComprarBolivaresActionPerformed(evt);
            }
        });
        panelBotones.add(cmdComprarBolivares);

        cmdVenderBolivares.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        cmdVenderBolivares.setText("Vender Bolivares");
        cmdVenderBolivares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVenderBolivaresActionPerformed(evt);
            }
        });
        panelBotones.add(cmdVenderBolivares);

        cmdInyectarPesos.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        cmdInyectarPesos.setText("Inyectar  Pesos $");
        cmdInyectarPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInyectarPesosActionPerformed(evt);
            }
        });
        panelBotones.add(cmdInyectarPesos);

        cmdInyectarBolivares.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        cmdInyectarBolivares.setText("Inyectar Bolivares Bs");
        cmdInyectarBolivares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInyectarBolivaresActionPerformed(evt);
            }
        });
        panelBotones.add(cmdInyectarBolivares);

        cmdAyuda.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        cmdAyuda.setText("Ayuda");
        cmdAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAyudaActionPerformed(evt);
            }
        });
        panelBotones.add(cmdAyuda);

        getContentPane().add(panelBotones, java.awt.BorderLayout.SOUTH);

        panelAdorno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelAdorno.setLayout(new java.awt.BorderLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("tioRicoDonaldYSobrinos.jpg"))); // NOI18N
        panelAdorno.add(lblImagen, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelAdorno, java.awt.BorderLayout.EAST);

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelDatos.setLayout(new java.awt.GridLayout(3, 1));

        panelTasas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelTasas.setLayout(new java.awt.GridLayout(2, 3));

        lblPrecioDeCompra.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblPrecioDeCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioDeCompra.setText("Precio Bs Compra");
        panelTasas.add(lblPrecioDeCompra);

        lblPrecioDeVenta.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblPrecioDeVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioDeVenta.setText("Precio Bs Venta");
        panelTasas.add(lblPrecioDeVenta);

        lblGananciaUnBolivar.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblGananciaUnBolivar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGananciaUnBolivar.setText("Ganancia por Bs");
        panelTasas.add(lblGananciaUnBolivar);

        txtPrecioDeCompra.setEditable(false);
        txtPrecioDeCompra.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtPrecioDeCompra.setForeground(new java.awt.Color(0, 0, 255));
        txtPrecioDeCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioDeCompra.setText("0");
        panelTasas.add(txtPrecioDeCompra);

        txtPrecioDeVenta.setEditable(false);
        txtPrecioDeVenta.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtPrecioDeVenta.setForeground(new java.awt.Color(0, 0, 255));
        txtPrecioDeVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioDeVenta.setText("0");
        panelTasas.add(txtPrecioDeVenta);

        txtGananciaUnBolivar.setEditable(false);
        txtGananciaUnBolivar.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtGananciaUnBolivar.setForeground(new java.awt.Color(0, 0, 255));
        txtGananciaUnBolivar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGananciaUnBolivar.setText("0");
        panelTasas.add(txtGananciaUnBolivar);

        panelDatos.add(panelTasas);

        panelBolivares.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelBolivares.setLayout(new java.awt.GridLayout(2, 3));

        lblBolivaresComprados.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblBolivaresComprados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBolivaresComprados.setText("Bolivares Comprados");
        panelBolivares.add(lblBolivaresComprados);

        lblBolivaresVendidos.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblBolivaresVendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBolivaresVendidos.setText("Bolivares Vendidos");
        panelBolivares.add(lblBolivaresVendidos);

        lblBolivaresEnCaja.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblBolivaresEnCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBolivaresEnCaja.setText("Bolivares en Caja");
        panelBolivares.add(lblBolivaresEnCaja);

        txtBolivaresComprados.setEditable(false);
        txtBolivaresComprados.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtBolivaresComprados.setForeground(new java.awt.Color(0, 0, 255));
        txtBolivaresComprados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBolivaresComprados.setText("0");
        panelBolivares.add(txtBolivaresComprados);

        txtBolivaresVendidos.setEditable(false);
        txtBolivaresVendidos.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtBolivaresVendidos.setForeground(new java.awt.Color(0, 0, 255));
        txtBolivaresVendidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBolivaresVendidos.setText("0");
        panelBolivares.add(txtBolivaresVendidos);

        txtBolivaresEnCaja.setEditable(false);
        txtBolivaresEnCaja.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtBolivaresEnCaja.setForeground(new java.awt.Color(0, 0, 255));
        txtBolivaresEnCaja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBolivaresEnCaja.setText("0");
        panelBolivares.add(txtBolivaresEnCaja);

        panelDatos.add(panelBolivares);

        panelPesos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelPesos.setLayout(new java.awt.GridLayout(2, 3));

        lblImpuestos.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblImpuestos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImpuestos.setText("Impuestos");
        panelPesos.add(lblImpuestos);

        lblGanancias.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblGanancias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGanancias.setText("Ganancias");
        panelPesos.add(lblGanancias);

        lblPesosEnCaja.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblPesosEnCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesosEnCaja.setText("Pesos $ en Caja");
        panelPesos.add(lblPesosEnCaja);

        txtImpuestos.setEditable(false);
        txtImpuestos.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtImpuestos.setForeground(new java.awt.Color(0, 0, 255));
        txtImpuestos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpuestos.setText("0");
        panelPesos.add(txtImpuestos);

        txtGanancias.setEditable(false);
        txtGanancias.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtGanancias.setForeground(new java.awt.Color(0, 0, 255));
        txtGanancias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGanancias.setText("0");
        panelPesos.add(txtGanancias);

        txtPesosEnCaja.setEditable(false);
        txtPesosEnCaja.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        txtPesosEnCaja.setForeground(new java.awt.Color(0, 0, 255));
        txtPesosEnCaja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesosEnCaja.setText("0");
        panelPesos.add(txtPesosEnCaja);

        panelDatos.add(panelPesos);

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cmdCambiarTasaDeCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarTasaDeCambioActionPerformed
        int compra, venta;
        compra = Integer.parseInt(JOptionPane.showInputDialog(this, "Precio de Compra", "Precio Compra", JOptionPane.QUESTION_MESSAGE));
        venta = Integer.parseInt(JOptionPane.showInputDialog(this, "Precio de Venta", "PrecioVenta", JOptionPane.QUESTION_MESSAGE));
        if (this.casaDeCambio.cambiarPrecioDelBolivar(compra, venta)) {
            JOptionPane.showMessageDialog(this, "Registrado el cambio de Precio", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            this.actualizarGUI();
        } else {
            JOptionPane.showMessageDialog(this, "Hay un error en el Precio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdCambiarTasaDeCambioActionPerformed

    private void cmdComprarBolivaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdComprarBolivaresActionPerformed
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Cuantos Bolivares tiene?", "Comprar", JOptionPane.QUESTION_MESSAGE));
        if (this.casaDeCambio.comprarBolivares(cantidad)) {
            JOptionPane.showMessageDialog(this, "Registrada compra", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            this.actualizarGUI();
        } else {
            JOptionPane.showMessageDialog(this, "Hay un error en la compra", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdComprarBolivaresActionPerformed

    private void cmdVenderBolivaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVenderBolivaresActionPerformed
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Cuantos Bolivares quiere?", "Vender", JOptionPane.QUESTION_MESSAGE));
        if (this.casaDeCambio.venderBolivares(cantidad)) {
            JOptionPane.showMessageDialog(this, "Registrada venta", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            this.actualizarGUI();
        } else {
            JOptionPane.showMessageDialog(this, "Hay un error en la venta", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_cmdVenderBolivaresActionPerformed

    private void cmdInyectarPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInyectarPesosActionPerformed
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Cuantos Pesos tiene?", "Comprar", JOptionPane.QUESTION_MESSAGE));
        this.casaDeCambio.inyectarPesos(cantidad);
        this.actualizarGUI();
    }//GEN-LAST:event_cmdInyectarPesosActionPerformed

    private void cmdInyectarBolivaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInyectarBolivaresActionPerformed
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Cuantos Bolivares tiene?", "Comprar", JOptionPane.QUESTION_MESSAGE));
        this.casaDeCambio.inyectarBolivares(cantidad);
        this.actualizarGUI();
    }//GEN-LAST:event_cmdInyectarBolivaresActionPerformed

    private void cmdAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAyudaActionPerformed
      JOptionPane.showMessageDialog(this, "Un antiguo ejercicio... miltonjesusvc@ufps.edu.co", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cmdAyudaActionPerformed

    private void actualizarGUI() {
        this.txtGanancias.setText(String.valueOf(this.casaDeCambio.getGanancias()));
        this.txtImpuestos.setText(String.valueOf(this.casaDeCambio.getImpuestos()));
        this.txtPesosEnCaja.setText(String.valueOf(this.casaDeCambio.getPesosEnCaja()));
        this.txtBolivaresComprados.setText(String.valueOf(this.casaDeCambio.getBolivaresComprados()));
        this.txtBolivaresVendidos.setText(String.valueOf(this.casaDeCambio.getBolivaresVendidos()));
        this.txtBolivaresEnCaja.setText(String.valueOf(this.casaDeCambio.getBolivaresEnCaja()));
        this.txtPrecioDeCompra.setText(String.valueOf(this.casaDeCambio.getPrecioDeCompra()));
        this.txtPrecioDeVenta.setText(String.valueOf(this.casaDeCambio.getPrecioDeVenta()));
        this.txtGananciaUnBolivar.setText(String.valueOf(this.casaDeCambio.getGananciaEnUnBolivar()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAyuda;
    private javax.swing.JButton cmdCambiarTasaDeCambio;
    private javax.swing.JButton cmdComprarBolivares;
    private javax.swing.JButton cmdInyectarBolivares;
    private javax.swing.JButton cmdInyectarPesos;
    private javax.swing.JButton cmdVenderBolivares;
    private javax.swing.JLabel lblBolivaresComprados;
    private javax.swing.JLabel lblBolivaresEnCaja;
    private javax.swing.JLabel lblBolivaresVendidos;
    private javax.swing.JLabel lblGananciaUnBolivar;
    private javax.swing.JLabel lblGanancias;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblPesosEnCaja;
    private javax.swing.JLabel lblPrecioDeCompra;
    private javax.swing.JLabel lblPrecioDeVenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAdorno;
    private javax.swing.JPanel panelBolivares;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelPesos;
    private javax.swing.JPanel panelTasas;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtBolivaresComprados;
    private javax.swing.JTextField txtBolivaresEnCaja;
    private javax.swing.JTextField txtBolivaresVendidos;
    private javax.swing.JTextField txtGananciaUnBolivar;
    private javax.swing.JTextField txtGanancias;
    private javax.swing.JTextField txtImpuestos;
    private javax.swing.JTextField txtPesosEnCaja;
    private javax.swing.JTextField txtPrecioDeCompra;
    private javax.swing.JTextField txtPrecioDeVenta;
    // End of variables declaration//GEN-END:variables
}