/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.HeadlessException;


/**
 *
 * @author Lab A
 */
public class frmInicio extends javax.swing.JFrame {
    
    ImageIcon Cromo=new ImageIcon();
    ImageIcon Escala=new ImageIcon();
    AutoByteDB you = new AutoByteDB();
    Connection cn = you.conexion();
    
    String user,usuario,pass,contra,newuser,newpass,sql;
    int i;

     frmInicio() {
        initComponents();
        
     Cromo=new ImageIcon(getClass().getResource("/Imagenes/lblinicio.png"));
     Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblFondo.getWidth(),lblFondo.getHeight(),Image.SCALE_DEFAULT));
     lblFondo.setIcon(Escala);
     
     Cromo=new ImageIcon(getClass().getResource("/Imagenes/lblLogin.jpg"));
     Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblLogin.getWidth(),lblLogin.getHeight(),Image.SCALE_DEFAULT));
     lblLogin.setIcon(Escala);
     
     panRegister.setVisible(false);
     
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panRegister = new javax.swing.JPanel();
        txtNUsuario = new javax.swing.JTextField();
        txtpNContra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnHaveAcc = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        txtNCorreo = new javax.swing.JTextField();
        panLogin = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtpContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnNoAcc = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        panRegister.setOpaque(false);

        txtNUsuario.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtNUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVO USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        txtpNContra.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtpNContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpNContra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVA CONTRASEÑA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("¿Ya tienes cuenta?");

        btnHaveAcc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        btnHaveAcc.setForeground(new java.awt.Color(0, 0, 100));
        btnHaveAcc.setText("Click Aquí");
        btnHaveAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaveAccActionPerformed(evt);
            }
        });

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnLogin.jpg"))); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtNCorreo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtNCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        javax.swing.GroupLayout panRegisterLayout = new javax.swing.GroupLayout(panRegister);
        panRegister.setLayout(panRegisterLayout);
        panRegisterLayout.setHorizontalGroup(
            panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHaveAcc))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpNContra, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(txtNUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNCorreo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39))
        );
        panRegisterLayout.setVerticalGroup(
            panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegisterLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtNUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpNContra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnHaveAcc))
                .addContainerGap())
        );

        getContentPane().add(panRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 340, 430));

        panLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INICIAR SESION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        panLogin.setOpaque(false);

        txtUsuario.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        txtpContra.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtpContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpContra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("¿No tienes cuenta?");

        btnNoAcc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        btnNoAcc.setForeground(new java.awt.Color(0, 0, 100));
        btnNoAcc.setText("Click Aquí");
        btnNoAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoAccActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnLogin.jpg"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
        panLogin.setLayout(panLoginLayout);
        panLoginLayout.setHorizontalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoAcc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLoginLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpContra, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        panLoginLayout.setVerticalGroup(
            panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLoginLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(txtpContra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNoAcc))
                .addContainerGap())
        );

        getContentPane().add(panLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 340, 430));
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 340, 430));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoAccActionPerformed
       panRegister.setVisible(true);
       panLogin.setVisible(false);
       
    }//GEN-LAST:event_btnNoAccActionPerformed

    private void btnHaveAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaveAccActionPerformed
        panRegister.setVisible(false);
        panLogin.setVisible(true);

    }//GEN-LAST:event_btnHaveAccActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            user=txtUsuario.getText();
            pass=txtpContra.getText();
            String query="SELECT * FROM cuentas WHERE user='"+user+"' and pass='"+pass+"'";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(query);
            if (rs.next()){
                dispose();
                new frmVentas().setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRAEÑA INVALIDOS");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
           try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO cuentas(user,pass,email"
                + ") VALUES(?,?,?)");
            pst.setString(1,txtNUsuario.getText());
            pst.setString(2,txtpNContra.getText());
            pst.setString(3,txtNCorreo.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se ha creado el registro exitosamente");
            panRegister.setVisible(false);
            panLogin.setVisible(true);
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "El usuario no se puede registrar");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHaveAcc;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNoAcc;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel panLogin;
    private javax.swing.JPanel panRegister;
    private javax.swing.JTextField txtNCorreo;
    private javax.swing.JTextField txtNUsuario;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpContra;
    private javax.swing.JPasswordField txtpNContra;
    // End of variables declaration//GEN-END:variables
}