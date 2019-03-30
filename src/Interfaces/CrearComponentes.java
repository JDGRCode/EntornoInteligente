package Interfaces;

import Modelo.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CrearComponentes extends javax.swing.JFrame {

    Conector cone;
  
    private int id_componente = 0;

    public CrearComponentes() {
        initComponents();
        mensaje.setText("Bienvenido," + InterfazLogin.usu);
        ide.setText("I.D :" + InterfazLogin.id);
        cone = new Conector();
        setLocationRelativeTo(null);
        setFocusable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.llenarCombo();
    }

    public void llenarCombo() {
        DefaultComboBoxModel modelo;
        modelo = new DefaultComboBoxModel();

        try {
            ResultSet rs = cone.consultaBD("select NombreComp from componentes");
            while (rs.next()) {
                modelo.addElement(rs.getString("NombreComp"));
            }
            combo_comp.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ide = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        combo_comp = new javax.swing.JComboBox();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Crear Componentes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ide.setText("I.D 1'144.076.881");
        jPanel1.add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));

        mensaje.setText("Bienvenido, Aprendiz Juan Robles");
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        jLabel3.setText("Tipo de componente :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 89, -1, -1));

        crear.setText("Crear Componente");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        jPanel1.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 100, -1));

        jPanel1.add(combo_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 114, 160, -1));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 100, -1));

        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        AtributosTiposComponentes robles = new AtributosTiposComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        TiposdeComponentes robles = new TiposdeComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        id_componente++;
        String tipo_comp = (String) combo_comp.getSelectedItem();
        cone.modificaBD("INSERT INTO componentes VALUES(" + id_componente + ",'','','" + tipo_comp + "','')");
        JOptionPane.showMessageDialog(rootPane, "Componente creado con éxito");
    }//GEN-LAST:event_crearActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     Inicio robles = new Inicio();
     robles.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CrearComponentes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JComboBox combo_comp;
    private javax.swing.JButton continuar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel ide;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
