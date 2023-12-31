/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab A
 */
public class frmAlmacen extends javax.swing.JFrame {
    ImageIcon Cromo=new ImageIcon();
    ImageIcon Escala=new ImageIcon();
    AutoByteDB you = new AutoByteDB();
    Connection cn = you.conexion();
    DefaultTableModel tabla = new DefaultTableModel();
    
    String []inventario = new String[5];
    
    String sql,tipo, autoi;
    int n,sr,btn,confirm;
    
    public frmAlmacen() {
        initComponents();
        Cromo=new ImageIcon(getClass().getResource("/Imagenes/frmalmacen.jpg"));
        Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblFondo.getWidth(),lblFondo.getHeight(),Image.SCALE_DEFAULT));
        lblFondo.setIcon(Escala);
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        
        tabla.addColumn("ID");
        tabla.addColumn("PRODUCTO");
        tabla.addColumn("MARCA");
        tabla.addColumn("EXISTENCIAS");
        tabla.addColumn("PRECIO");
        this.tblInventario.setModel(tabla);
        
        Inventario("");
        
        
        txtID.setEnabled(false);
        txtProd.setEnabled(false);
        txtMarca.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtExist.setEnabled(false);
        
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
    }
    
    private void Inventario(String Valor)
    {
        int elit = tblInventario.getRowCount();
        for(n=elit-1; n>=0;n--)
            tabla.removeRow(n);
        if(Valor.equals(""))
            sql = "SELECT * FROM almacen";
        
        else
            sql = "SELECT * FROM almacen WHERE type = '"+Valor+"'";
        try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            inventario[0]=rs.getString(1);
            inventario[1]=rs.getString(2);
            inventario[2]=rs.getString(3);
            inventario[3]=rs.getString(4);
            inventario[4]=("$ "+rs.getString(5));
            tabla.addRow(inventario);
            
            
        }
        tblInventario.setModel(tabla);
        }
        catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
                }

    private void Buscar(String Valor)
    {
        int elit = tblInventario.getRowCount();
        for(n=elit-1; n>=0;n--) 
            tabla.removeRow(n);
        
        sql = "SELECT * FROM almacen WHERE nombre LIKE '%"+Valor+"%'" + "OR marca LIKE '%"+Valor+"%'" + "OR idproducto LIKE '%"+Valor+"%'";
        try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            inventario[0]=rs.getString(1);
            inventario[1]=rs.getString(2);
            inventario[2]=rs.getString(3);
            inventario[3]=rs.getString(4);
            inventario[4]=("$ "+rs.getString(5));
            tabla.addRow(inventario);
            
            
        }
        tblInventario.setModel(tabla);
        }
        catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
                }
    
    public void Registro(String Valor){
        try    
            {   
                if (txtID.getText().equals("")){
                    autoi=") VALUES(default,?,?,?,?,?)";
                }
                else{
                    autoi=") VALUES(?,?,?,?,?,?)";
                }
                    
                PreparedStatement pst = cn.prepareStatement("INSERT INTO almacen(idproducto,nombre,marca,stock,costo,type"
                + autoi);
                
                if (txtID.getText().equals("")){
                pst.setString(1,txtProd.getText());
                pst.setString(2,txtMarca.getText());
                pst.setString(3,txtExist.getText());
                pst.setString(4,String.valueOf(txtPrecio.getText().replace("$", "")));
                pst.setString(5,Valor); 
                }
                else{
                pst.setString(1,txtID.getText());
                pst.setString(2,txtProd.getText());
                pst.setString(3,txtMarca.getText());
                pst.setString(4,txtExist.getText());
                pst.setString(5,String.valueOf(txtPrecio.getText().replace("$", "")));
                pst.setString(6,Valor); 
                }
                
            
            
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Se ha creado el registro exitosamente");
            
            }
            catch(SQLException ex)
            {
            JOptionPane.showMessageDialog(null, "[!] NO FUE POSIBLE CREAR EL REGISTRO");
            }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLema = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        panModif = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        txtExist = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        cboFiltro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLema.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblLema.setForeground(new java.awt.Color(255, 255, 255));
        lblLema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLema.setText("\"Comprometidos con la seguridad, \ndedicados a tu satisfaccion\"");
        lblLema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 490, 30));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo mini.jpg"))); // NOI18N
        lblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 100, 50));

        panModif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panModif.setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnconfirmar.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncancelar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 51, 51));
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        txtMarca.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(0, 51, 51));
        txtMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "MARCA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        txtProd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtProd.setForeground(new java.awt.Color(0, 51, 51));
        txtProd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        txtExist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtExist.setForeground(new java.awt.Color(0, 51, 51));
        txtExist.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EXISTENCIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 51, 51));
        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PRECIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        javax.swing.GroupLayout panModifLayout = new javax.swing.GroupLayout(panModif);
        panModif.setLayout(panModifLayout);
        panModifLayout.setHorizontalGroup(
            panModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModifLayout.createSequentialGroup()
                .addGroup(panModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panModifLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtExist, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panModifLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panModifLayout.setVerticalGroup(
            panModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panModifLayout.createSequentialGroup()
                .addGroup(panModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panModifLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panModifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExist, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panModifLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(panModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 150));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setOpaque(false);

        tblInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblInventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblInventario.setForeground(new java.awt.Color(0, 102, 153));
        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInventario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 630, 200));

        cboFiltro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboFiltro.setForeground(new java.awt.Color(0, 102, 255));
        cboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VER TODO", "PARTES", "AUTOS" }));
        cboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(cboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 40));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnbuscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnagregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 60, 60));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnvolver.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 20, 60, 60));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnapagar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 80, 80));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btneliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 60, 60));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnmodificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 60, 60));

        lblFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroActionPerformed
        switch (cboFiltro.getSelectedIndex()) {
           case 0:
               Inventario("");
               cboFiltro.removeItem("BUSQUEDA");
               break;
           case 1:
               Inventario("1");
               cboFiltro.removeItem("BUSQUEDA");
               break;
           case 2:
               Inventario("0");
               cboFiltro.removeItem("BUSQUEDA");
               break;
            
       }
        
        
    }//GEN-LAST:event_cboFiltroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Buscar(String.valueOf(JOptionPane.showInputDialog("Buscar:\n[MARCA/NOMBRE/ID]")));
        cboFiltro.addItem("BUSQUEDA");
        cboFiltro.setSelectedItem("BUSQUEDA");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtID.setText("");
        txtProd.setText("");
        txtMarca.setText("");
        txtExist.setText("");
        txtPrecio.setText("");
            
        txtID.setEnabled(false);
        txtProd.setEnabled(false);
        txtMarca.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtExist.setEnabled(false);
        
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        
        tblInventario.clearSelection();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        btn=1;
        sr = tblInventario.getSelectedRow();
        if(sr >= 0)
        {
            txtID.setText(tblInventario.getValueAt(sr, 0).toString());
            txtProd.setText(tblInventario.getValueAt(sr, 1).toString());
            txtMarca.setText(tblInventario.getValueAt(sr, 2).toString());
            txtExist.setText(tblInventario.getValueAt(sr, 3).toString());
            txtPrecio.setText(tblInventario.getValueAt(sr, 4).toString());
             
            txtID.setEnabled(true);
            txtID.setEditable(false);
            txtProd.setEnabled(true);
            txtMarca.setEnabled(true);
            txtPrecio.setEnabled(true);
            txtExist.setEnabled(true);
        
            btnConfirmar.setEnabled(true);
            btnCancelar.setEnabled(true);
            
            btnModificar.setEnabled(false);
            btnAgregar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
        else {
        JOptionPane.showMessageDialog(null, "[!] PRIMERO SELECCIONA UN REGISTRO");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        btn=2;
        txtID.setEnabled(true);
        txtID.setEditable(true);
        txtProd.setEnabled(true);
        txtMarca.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtExist.setEnabled(true);
        
        btnConfirmar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        btnModificar.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (btn==1){
            try
        {
            PreparedStatement pst = cn.prepareStatement("UPDATE almacen set nombre='" + txtProd.getText()
                + "',marca='" + txtMarca.getText() + "',stock='" + txtExist.getText()
                + "',costo='" + txtPrecio.getText().replace("$", "") + "'WHERE idproducto = '" + txtID.getText() + "'");
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "EL REGISTRO FUE ACTUALIZADO");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
            
        }
        else if (btn==2){
            
            tipo = String.valueOf(JOptionPane.showInputDialog(null,
                    "SELECCIONE EL TIPO DE PRODUCTO","SELECCIONE",
                    JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SELECCIONE","AUTO","PIEZA"},"SELECCIONE"));
            
            while (tipo.equals("SELECCIONE")){
                JOptionPane.showMessageDialog(null,"[!] NO HA SELECCIONADO UN TIPO DE PRODUCTO");
                tipo = String.valueOf(JOptionPane.showInputDialog(null,
         "SELECCIONE EL TIPO DE PRODUCTO","SELECCIONE",
      JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SELECCIONE","AUTO","PIEZA"},"SELECCIONE"));
                }
            
        switch (tipo){
            case "AUTO":
                Registro("0");
                break;
            case "PIEZA":
                Registro("1");
                break;
                }
                
        }
            txtID.setText("");
            txtProd.setText("");
            txtMarca.setText("");
            txtExist.setText("");
            txtPrecio.setText("");
            
            txtID.setEnabled(false);
            txtProd.setEnabled(false);
            txtMarca.setEnabled(false);
            txtPrecio.setEnabled(false);
            txtExist.setEnabled(false);
        
            btnConfirmar.setEnabled(false);
            btnCancelar.setEnabled(false);
            
            btnAgregar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);
        
            tblInventario.clearSelection();
            Inventario("");
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        sr=tblInventario.getSelectedRow();
        if(tblInventario.getSelectedRow() >= 0)
        {   
            confirm = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres borrar este registro?\n(Esta acción no se puede deshacer)", "CONFIRMAR",
				JOptionPane.YES_NO_OPTION);
            if (confirm==0) {
            PreparedStatement pst;
            try
            {
                pst = cn.prepareStatement("DELETE FROM almacen WHERE idproducto ='" + tblInventario.getValueAt(sr, 0).toString() + "'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "El registro se ha elimindado correctamente");
            }
            catch(HeadlessException | SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "EL REGISTRO NO EXISTE");
            }
            }
            
            tblInventario.clearSelection();
            Inventario("");
            
        }
        else {
        JOptionPane.showMessageDialog(null, "[!] PRIMERO SELECCIONA UN REGISTRO");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        new frmVentas().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panModif;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtExist;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProd;
    // End of variables declaration//GEN-END:variables
}
