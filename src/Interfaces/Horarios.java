
package Interfaces;

import Modelo.Conector;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Horarios extends javax.swing.JFrame {
   static DefaultTableModel modelo; 
   static Conector cone;
   private Dimension dim;
    
    public Horarios() {
        initComponents();
        cone= new Conector();
        setResizable(false);
        
        dim=super.getToolkit().getScreenSize();
        super.setSize(dim);
        
        ImageIcon logo1= new ImageIcon(getClass().getResource("/Imagenes/crear.png"));
        ImageIcon tamaño = new ImageIcon(logo1.getImage().getScaledInstance(Crear.getWidth(),Crear.getHeight(),Image.SCALE_DEFAULT));
        Crear.setIcon(tamaño);
        
        setTitle("Horarios");
        
      
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ADMINISTRADOR = new javax.swing.JLabel();
        txt_administrador = new javax.swing.JLabel();
        Clientes = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        Componentes = new javax.swing.JButton();
        Estados = new javax.swing.JButton();
        Perfiles = new javax.swing.JButton();
        Horarios = new javax.swing.JButton();
        LADO = new javax.swing.JLabel();
        SUPERIOR = new javax.swing.JLabel();
        B_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablah = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1380, 800));
        setPreferredSize(new java.awt.Dimension(1380, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1380, 800));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADMINISTRADOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrador.png"))); // NOI18N
        jPanel1.add(ADMINISTRADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        txt_administrador.setFont(new java.awt.Font("Swis721 Cn BT", 0, 24)); // NOI18N
        txt_administrador.setText("Administrador");
        jPanel1.add(txt_administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Clientes.setBackground(new java.awt.Color(0, 0, 255));
        Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 140, -1));

        Inicio.setBackground(new java.awt.Color(51, 51, 255));
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, -1));

        Componentes.setBackground(new java.awt.Color(51, 51, 255));
        Componentes.setForeground(new java.awt.Color(255, 255, 255));
        Componentes.setText("Componentes");
        Componentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComponentesActionPerformed(evt);
            }
        });
        jPanel1.add(Componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, -1));

        Estados.setBackground(new java.awt.Color(51, 51, 255));
        Estados.setForeground(new java.awt.Color(255, 255, 255));
        Estados.setText("Estados");
        Estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadosActionPerformed(evt);
            }
        });
        jPanel1.add(Estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 140, -1));

        Perfiles.setBackground(new java.awt.Color(51, 51, 255));
        Perfiles.setForeground(new java.awt.Color(255, 255, 255));
        Perfiles.setText("Perfiles");
        jPanel1.add(Perfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 140, -1));

        Horarios.setBackground(new java.awt.Color(51, 51, 255));
        Horarios.setForeground(new java.awt.Color(255, 255, 255));
        Horarios.setText("Horarios");
        jPanel1.add(Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 140, -1));

        LADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lado.png"))); // NOI18N
        LADO.setText("Perfiles");
        LADO.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(LADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 190, 4460));
        LADO.getAccessibleContext().setAccessibleParent(jPanel1);

        SUPERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/superior.png"))); // NOI18N
        SUPERIOR.setText("jLabel1");
        jPanel1.add(SUPERIOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        B_buscar.setBackground(new java.awt.Color(0, 102, 255));
        B_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loop.png"))); // NOI18N
        B_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(B_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 30, 30));

        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 130, 30));

        tablah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablah);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Horarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, 140));

        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientesActionPerformed

    private void ComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComponentesActionPerformed
        GestionComponentes gComp = new GestionComponentes();
        gComp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComponentesActionPerformed

    private void EstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadosActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void B_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_buscarActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        CrearUsuarios cliente = new CrearUsuarios();
        cliente.setVisible(true);
    }//GEN-LAST:event_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Horarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMINISTRADOR;
    private javax.swing.JButton B_buscar;
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Componentes;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Estados;
    private javax.swing.JButton Horarios;
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel LADO;
    private javax.swing.JButton Perfiles;
    private javax.swing.JLabel SUPERIOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablah;
    private javax.swing.JLabel txt_administrador;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
