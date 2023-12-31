/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Lab A
 */
public class frmVentas extends javax.swing.JFrame {
    ImageIcon Cromo=new ImageIcon();
    ImageIcon Escala=new ImageIcon();
    AutoByteDB you = new AutoByteDB();
    Connection cn = you.conexion();
    static String nombre, numero,autocompra="";            
    String imgautos,sql;
    static double precio;
    int confirm;
    /**
     * Creates new form frmVentas
     */
    public frmVentas() {
        initComponents();
        
        Cromo=new ImageIcon(getClass().getResource("/Imagenes/frmTodo.jpg"));
        Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblFondo.getWidth(),lblFondo.getHeight(),Image.SCALE_DEFAULT));
        lblFondo.setIcon(Escala);
     
        Cromo=new ImageIcon(getClass().getResource("/Imagenes/lblAutos.jpg"));
        Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblAutos.getWidth(),lblAutos.getHeight(),Image.SCALE_DEFAULT));
        lblAutos.setIcon(Escala);
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        
        panMarcas.setVisible(false);
        
        nombre=GetCompradorInfo("nombre");
        numero=GetCompradorInfo("numero");
        
        txtComprador.setText(nombre);
        txtNumero.setText(numero);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panMarcas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rdbSeguro1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        lbllogo = new javax.swing.JLabel();
        panComprador = new javax.swing.JPanel();
        txtComprador = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        panModelos = new javax.swing.JPanel();
        cboModelos = new javax.swing.JComboBox<>();
        lblAutos = new javax.swing.JLabel();
        btnMasModelos = new javax.swing.JButton();
        btnPartes = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblLema = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        panMarcas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "MARCAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 102, 255))); // NOI18N
        panMarcas.setOpaque(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        buttonGroup1.add(rdbSeguro1);
        rdbSeguro1.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        rdbSeguro1.setForeground(new java.awt.Color(255, 255, 255));
        rdbSeguro1.setText("KIA");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("FORD");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("NISSAN");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("CHEVROLET");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("TOYOTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbSeguro1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(rdbSeguro1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(24, 24, 24)
                .addComponent(jRadioButton4)
                .addGap(38, 38, 38)
                .addComponent(jRadioButton5)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panMarcasLayout = new javax.swing.GroupLayout(panMarcas);
        panMarcas.setLayout(panMarcasLayout);
        panMarcasLayout.setHorizontalGroup(
            panMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMarcasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        panMarcasLayout.setVerticalGroup(
            panMarcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMarcasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTAS");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo mini.jpg"))); // NOI18N
        lbllogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, -1));

        panComprador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Comprador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        panComprador.setOpaque(false);

        txtComprador.setEditable(false);
        txtComprador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComprador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N

        txtNumero.setEditable(false);
        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N

        javax.swing.GroupLayout panCompradorLayout = new javax.swing.GroupLayout(panComprador);
        panComprador.setLayout(panCompradorLayout);
        panCompradorLayout.setHorizontalGroup(
            panCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCompradorLayout.setVerticalGroup(
            panCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCompradorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        panModelos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panModelos.setOpaque(false);

        cboModelos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cboModelos.setForeground(new java.awt.Color(0, 102, 255));
        cboModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODELOS MAS POPULARES:", "Nissan Versa", "Nissan NP300", "KIA Rio", "Chevrolet Aveo", "Nissan Sentra", "MG 5", "Nissan March ", "Mazda3", "Mazda2", "KIA Seltos", "Lamborghini", "Chevrolet Camaro SS", "Chevrolet Corvette", "Pagani Huayra", "Agera Koenigsegg" }));
        cboModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModelosActionPerformed(evt);
            }
        });

        lblAutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panModelosLayout = new javax.swing.GroupLayout(panModelos);
        panModelos.setLayout(panModelosLayout);
        panModelosLayout.setHorizontalGroup(
            panModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModelosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboModelos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAutos, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panModelosLayout.setVerticalGroup(
            panModelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModelosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cboModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(panModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 380, -1));

        btnMasModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnmasmodelos.png"))); // NOI18N
        btnMasModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasModelosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 80, 80));

        btnPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnpartes.png"))); // NOI18N
        btnPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 80, 80));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncomprar.png"))); // NOI18N
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 80, 80));

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnalmacen.png"))); // NOI18N
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 80, 80));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnsalir.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        lblLema.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        lblLema.setForeground(new java.awt.Color(0, 153, 255));
        lblLema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLema.setText("\"Comprometidos con la seguridad,  dedicados a tu satisfaccion\"");
        lblLema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 570, 30));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private String GetCompradorInfo(String Valor){
        sql = "SELECT "+Valor+" FROM cuentas WHERE user='"+frmInicio.user+"'";
        try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
        return(rs.getString(1));
        }
        else{
            return("");
        }
        }
        catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                    return("");
                }
        
    }
    private void cboModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModelosActionPerformed
        
        switch (cboModelos.getSelectedIndex()) {
        
                case 0: imgautos="lblAutos.jpg";    autocompra="";
                break;
                case 1: imgautos="versa.jpg";  autocompra="versa";
                break;
                case 2: imgautos="np300.jpg";   autocompra="NP300";
                break;
                case 3: imgautos="rio.jpg"; autocompra="rio";
                break;
                case 4: imgautos="aveo.jpg";    autocompra="aveo";
                break;
                case 5: imgautos="sentra.jpg"; autocompra="Sentra";
                break;
                case 6: imgautos="mg5.jpg"; autocompra="MG5";
                break;
                case 7: imgautos="march.jpg";   autocompra="march";
                break;
                case 8: imgautos="mazda3.jpg";  autocompra="mazda3";
                break;
                case 9: imgautos="mazda2.jpg"; autocompra="mazda2";
                break;
                case 10: imgautos="seltos.jpg"; autocompra="seltos";
                break;
                case 11: imgautos="lambo.jpg"; autocompra="lambo";
                break;
                case 12: imgautos="camaro.jpg"; autocompra="camaro";
                break;
                case 13: imgautos="corvette.jpg";   autocompra="corvette";
                break;
                case 14: imgautos="huayra.jpg"; autocompra="huayra";
                break;
                case 15: imgautos="koeni.jpg";  autocompra="koeni";
                break;
                
    }
        
     Cromo=new ImageIcon(getClass().getResource("/Imagenes/"+imgautos));
     Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblAutos.getWidth(),lblAutos.getHeight(),Image.SCALE_DEFAULT));
     lblAutos.setIcon(Escala);
    }//GEN-LAST:event_cboModelosActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        
        frmMarcas.modelo="";

        if (autocompra.equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione un auto primero");
        }
        else{
            String query = "SELECT costo FROM almacen WHERE nombre = '"+autocompra+"'";
            try {
                Statement stm = cn.createStatement();
                ResultSet rsm = stm.executeQuery(query);
                if (rsm.next()) {
                    precio=Double.parseDouble(rsm.getString(1));
                    confirm = JOptionPane.showConfirmDialog(null, "¿Desea comprar refacciones?", "CONFIRMAR",
				JOptionPane.YES_NO_OPTION);
                    
                    if (confirm==0) {
                        frmPartes.volver=0;
                        dispose();
                        new frmPartes().setVisible(true);
                        }
                    else {
                       frmTicket.volver=0;
                        dispose();
                        new frmTicket().setVisible(true); 
                    }
                    
                    }
                else {
                    JOptionPane.showMessageDialog(null, "Este auto no está disponible por el momento:(");
                    }
            }
            catch(SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnMasModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasModelosActionPerformed
        dispose();
        new frmMarcas().setVisible(true);
    }//GEN-LAST:event_btnMasModelosActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
         try {
             
            String query="SELECT * FROM cuentas WHERE user='"+frmInicio.user+"' and type='2' OR user=" + "'" + frmInicio.user + "' and type ='1'";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(query);
            if (rs.next()){
                dispose();
                new frmAlmacen().setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "SU CUENTA NO CUENTA CON PERMISOS SUFICIENTES PARA VER EL ALMACEN\n\nInicie sesión con una cuenta diferente e intentelo de nuevo");
            }        
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
            
        }
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartesActionPerformed
        dispose();
        new frmPartes().setVisible(true);
    }//GEN-LAST:event_btnPartesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        new frmInicio().setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    public static javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMasModelos;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPartes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboModelos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JLabel lblAutos;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panComprador;
    private javax.swing.JPanel panMarcas;
    private javax.swing.JPanel panModelos;
    private javax.swing.JRadioButton rdbSeguro1;
    private javax.swing.JTextField txtComprador;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    private void Switch(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
