/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.GestionUsuarios.modelo;
import Modelo.Conector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarios extends javax.swing.JFrame {

    static DefaultTableModel modelo;
    static Conector cone;
    private Dimension dim;
     DefaultTableModel model;
    public boolean tipo = false;
    
    public GestionUsuarios() {
        initComponents();
        cone = new Conector();
        setResizable(false);
        setFocusable(true);
        dim = super.getToolkit().getScreenSize();
        super.setSize(dim);

        ImageIcon logo1 = new ImageIcon(getClass().getResource("/Imagenes/crear.png"));
        ImageIcon tamaño = new ImageIcon(logo1.getImage().getScaledInstance(Crear.getWidth(), Crear.getHeight(), Image.SCALE_DEFAULT));
        Crear.setIcon(tamaño);

        setTitle("Gestion Clientes");

        llenarTabla();

    }

    public static void llenarTabla() {

        try {
            String titulos[] = {"Nombre", "Cédula", "Rol", "Teléfono"};
            modelo = new DefaultTableModel(null, titulos);
            String datos[] = new String[4];
            tabla.setModel(modelo);


            ResultSet rs = cone.consultaBD("SELECT * FROM usuarios");
            while (rs.next()) {
                datos[0] = rs.getString("Nomusuario");
                datos[1] = rs.getString("Idusuario");
                datos[2] = rs.getString("Idrol");
                datos[3] = rs.getString("Telefono");
                modelo.addRow(datos);
            }
            /*model.addTableModelListener(new TableModelListener() {
                @Override
                public void tableChanged(TableModelEvent e) {
                  if(e.getType() == TableModelEvent.UPDATE){
                      String colname = null;
                      if (e.getColumn() == 0) {
                          colname = "Nomusuario";
                      }
                      int fila = e.getFirstRow();
                      //if (columna == 0){
                          String rs = "UPDATE usuarios SET " +colname+" ='"+tabla.getValueAt(e.getFirstRow(), e.getColumn())+"' WHERE Idusuario='"+tabla.getValueAt(e.getFirstRow(), 0)+"'";
                          cone.modificaBD(rs);
                          
                          //}
                  }  
                }
            });*/
           
        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*public static void Bucar() throws SQLException {
        String titulos[] = {"Nombre", "Cédula", "Rol", "Teléfono"};
        
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[4];
        
        String nombre = txt_buscar.getText();
        
        ResultSet rs = cone.consultaBD("SELECT * FROM usuarios");
        while (rs.next()) {
            datos[0] = rs.getString("Nomusuario");
            datos[1] = rs.getString("Idusuario");
            datos[2] = rs.getString("Idrol");
            datos[3] = rs.getString("Telefono");
            modelo.addRow(datos);
        }

    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Editar = new javax.swing.JMenuItem();
        Anular = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ADMINISTRADOR = new javax.swing.JLabel();
        txt_administrador = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        Componentes = new javax.swing.JButton();
        Estados = new javax.swing.JButton();
        Perfiles = new javax.swing.JButton();
        Horarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LADO = new javax.swing.JLabel();
        USER = new javax.swing.JLabel();
        SUPERIOR = new javax.swing.JLabel();
        GestionClientes = new javax.swing.JLabel();
        Img_gestion = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Editar);

        Anular.setText("Anular");
        Anular.setToolTipText("");
        Anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnularActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Anular);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADMINISTRADOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrador.png"))); // NOI18N
        jPanel1.add(ADMINISTRADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        txt_administrador.setFont(new java.awt.Font("Swis721 Cn BT", 0, 24)); // NOI18N
        txt_administrador.setText("Administrador");
        jPanel1.add(txt_administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Inicio.setBackground(new java.awt.Color(51, 51, 255));
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, -1));

        Clientes.setBackground(new java.awt.Color(0, 0, 255));
        Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, -1));

        Componentes.setBackground(new java.awt.Color(51, 51, 255));
        Componentes.setForeground(new java.awt.Color(255, 255, 255));
        Componentes.setText("Componentes");
        Componentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComponentesActionPerformed(evt);
            }
        });
        jPanel1.add(Componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 140, -1));

        Estados.setBackground(new java.awt.Color(51, 51, 255));
        Estados.setForeground(new java.awt.Color(255, 255, 255));
        Estados.setText("Estados");
        Estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadosActionPerformed(evt);
            }
        });
        jPanel1.add(Estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 140, -1));

        Perfiles.setBackground(new java.awt.Color(51, 51, 255));
        Perfiles.setForeground(new java.awt.Color(255, 255, 255));
        Perfiles.setText("Perfiles");
        jPanel1.add(Perfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 140, -1));

        Horarios.setBackground(new java.awt.Color(51, 51, 255));
        Horarios.setForeground(new java.awt.Color(255, 255, 255));
        Horarios.setText("Horarios");
        jPanel1.add(Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 140, -1));

        jLabel1.setText("Cerrar Sesión");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 90, 20));

        LADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lado.png"))); // NOI18N
        LADO.setText("Perfiles");
        jPanel1.add(LADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 190, 800));

        USER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (1).png"))); // NOI18N
        jPanel1.add(USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 40, 40));

        SUPERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/superior.png"))); // NOI18N
        SUPERIOR.setText("jLabel1");
        jPanel1.add(SUPERIOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1220, 40));

        GestionClientes.setFont(new java.awt.Font("Swis721 Cn BT", 0, 24)); // NOI18N
        GestionClientes.setText("Gestion Clientes");
        jPanel1.add(GestionClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        Img_gestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gestion (2).png"))); // NOI18N
        jPanel1.add(Img_gestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 150, 150));

        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 340, 120, 20));

        txt_buscar.setText("Buscar");
        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_buscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscarFocusLost(evt);
            }
        });
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 160, 30));

        tabla.setBorder(new javax.swing.border.MatteBorder(null));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre-Cliente", "Cedula", "Rol", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setRowHeight(20);
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(200);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(0).setMaxWidth(200);
            tabla.getColumnModel().getColumn(1).setMinWidth(90);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(1).setMaxWidth(90);
            tabla.getColumnModel().getColumn(2).setMinWidth(100);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(2).setMaxWidth(100);
            tabla.getColumnModel().getColumn(3).setMinWidth(110);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(3).setMaxWidth(110);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 510, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientesActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void ComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComponentesActionPerformed
        EstadosActualesComponentes gComp = new EstadosActualesComponentes();
        gComp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComponentesActionPerformed

    private void EstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadosActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        CrearUsuarios cliente = new CrearUsuarios();
        cliente.setVisible(true);
    }//GEN-LAST:event_CrearActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        InterfazLogin login = new InterfazLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void AnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnularActionPerformed

        String id = (String) (modelo.getValueAt(tabla.getSelectedRow(), 1));

        cone.modificaBD("DELETE FROM usuarios WHERE IdUsuario=" + id);

        llenarTabla();
    }//GEN-LAST:event_AnularActionPerformed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        try {
            String titulos[] = {"Nombre", "Cédula", "Rol", "Teléfono"};
            String registro[] =new String[50];
            
            String sql = "SELECT NomUsuario, IdUsuario, IdRol, Telefono FROM usuarios where NomUsuario like'%"+txt_buscar.getText()+"%'";
            model = new DefaultTableModel(null, titulos);
            
            ResultSet rs = cone.consultaBD(sql);
            while (rs.next()) {
                registro[0] = rs.getString("NomUsuario");
                registro[1] = rs.getString("IdUsuario");
                registro[2] = rs.getString("IdRol");
                registro[3] = rs.getString("Telefono");
                model.addRow(registro);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String id = (String) (modelo.getValueAt(tabla.getSelectedRow(), 1));

        /*cone.modificaBD("UPDATE table usuarios SET NomUsuario='"+ id+"'");

        llenarTabla();*/
        tipo = true;
        CrearUsuarios crear = new CrearUsuarios();
        crear.setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void txt_buscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarFocusGained
      if (txt_buscar.getText().trim().equals("Buscar")) {
            txt_buscar.setText("");
        }
        txt_buscar.setForeground(Color.blue);
    }//GEN-LAST:event_txt_buscarFocusGained

    private void txt_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarFocusLost
       if (txt_buscar.getText().trim().equals("")) {
            txt_buscar.setText("Buscar");
        }
        txt_buscar.setForeground(Color.gray);
    }//GEN-LAST:event_txt_buscarFocusLost

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
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMINISTRADOR;
    private javax.swing.JMenuItem Anular;
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Componentes;
    private javax.swing.JButton Crear;
    private javax.swing.JMenuItem Editar;
    private javax.swing.JButton Estados;
    private javax.swing.JLabel GestionClientes;
    private javax.swing.JButton Horarios;
    private javax.swing.JLabel Img_gestion;
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel LADO;
    private javax.swing.JButton Perfiles;
    private javax.swing.JLabel SUPERIOR;
    private javax.swing.JLabel USER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable tabla;
    private javax.swing.JLabel txt_administrador;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
