/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */

public class InterfazLogin extends javax.swing.JFrame {
    
    public static String id, usu;
    private Dimension dim;
    Conector cone;
    public static PlaceHolder usuario;
    public static PlaceHolder contra;
    
    public InterfazLogin() {
        initComponents();
        
        cone=new Conector();
        
        dim = super.getToolkit().getScreenSize();
        
        super.setSize(dim);
        
        usuario = new PlaceHolder(txt_usuario, "ingrese Usuario");
        usuario.setCursiva(true);
        
        contra = new PlaceHolder(j_contraseña,"ingrese Contraseña");
        contra.setCursiva(true);
        
        ImageIcon logoCliente = new ImageIcon (getClass().getResource("/imagenes/logo.png"));
        ImageIcon usarLogo =new ImageIcon(logoCliente.getImage().getScaledInstance(logo_cliente.getWidth(), logo_cliente.getHeight(),Image.SCALE_DEFAULT));
        logo_cliente.setIcon(usarLogo);
        
        ImageIcon cliente = new ImageIcon(getClass().getResource("/imagenes/icono_cliente.png"));
        ImageIcon icocliente = new ImageIcon(cliente.getImage().getScaledInstance(cliente_icon.getWidth(),cliente_icon.getHeight(),Image.SCALE_DEFAULT));
        cliente_icon.setIcon(icocliente);
        
        ImageIcon barra = new ImageIcon(getClass().getResource("/imagenes/superior.png"));
        ImageIcon usarBarra = new ImageIcon(barra.getImage().getScaledInstance(barra_cliente.getWidth(),barra_cliente.getHeight(),Image.SCALE_DEFAULT));
        barra_cliente.setIcon(usarBarra);
        
        
        setResizable(false);
        setFocusable(true);
        setTitle("Login");
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo_cliente = new javax.swing.JLabel();
        cliente_icon = new javax.swing.JLabel();
        barra_cliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        j_contraseña = new javax.swing.JPasswordField();
        B_inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 80));
        jPanel1.add(cliente_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 120, 110));

        barra_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(barra_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 40));

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 24)); // NOI18N
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 160, 30));

        txt_usuario.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 165, 222), 2));
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 220, 20));

        j_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 165, 222), 2));
        jPanel1.add(j_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 220, 20));

        B_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/INICIO.png"))); // NOI18N
        B_inicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(B_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_inicioActionPerformed
         
        try {
            ResultSet rs = cone.consultaBD("SELECT * FROM usuarios WHERE Email='" + txt_usuario.getText() + "' AND Contraseña='" + j_contraseña.getText() + "'");
            if (rs.next()) {
            try {
            rs = cone.consultaBD("SELECT Nomusuario,Idusuario FROM usuarios where Email='"+ txt_usuario.getText() +"'");
            if (rs.next()) {
                usu = rs.getString("Nomusuario");
                id = rs.getString("Idusuario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
                Inicio gc = new Inicio();
                gc.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_inicioActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_inicio;
    private javax.swing.JLabel barra_cliente;
    private javax.swing.JLabel cliente_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField j_contraseña;
    private javax.swing.JLabel logo_cliente;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
