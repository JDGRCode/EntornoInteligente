package Interfaces;

import Modelo.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class EstadosTiposComponentes extends javax.swing.JFrame {

    Conector cone;
    private int id_estados = 0;
    InterfazLogin robles = new InterfazLogin();

    public EstadosTiposComponentes() {
        initComponents();
        mensaje.setText("Bienvenido," + robles.usu);
        ide.setText("I.D :" + robles.id);
        cone = new Conector();
        setLocationRelativeTo(null);
        setFocusable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.llenarCombo1();
        this.llenarCombo2();
    }

    public void llenarCombo1() {
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

    public void llenarCombo2() {
        DefaultComboBoxModel modelo;
        modelo = new DefaultComboBoxModel();

        try {
            ResultSet rs = cone.consultaBD("select Estado from estadosxatri");
            while (rs.next()) {
                modelo.addElement(rs.getString("Estado"));
            }
            combo_atri.setModel(modelo);
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
        anadir = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        combo_comp = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        combo_atri = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        estado_comp = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Estado de los Atributos de Componentes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ide.setText("I.D 1'144.076.881");
        jPanel1.add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, -1));

        mensaje.setText("Bienvenido, Aprendiz Juan Robles");
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        jLabel3.setText("Tipo de componente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        anadir.setText("Añadir Estado");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });
        jPanel1.add(anadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 260, -1, -1));

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        jPanel1.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, -1));

        jPanel1.add(combo_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        jLabel4.setText("Atributos Componente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 201, -1));

        jPanel1.add(combo_atri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        jLabel5.setText("Estado atributo Componente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 211, -1));

        estado_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_compActionPerformed(evt);
            }
        });
        jPanel1.add(estado_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 201, -1));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 100, -1));

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

    private void estado_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_compActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        EstadosActualesComponentes robles = new EstadosActualesComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        AtributosTiposComponentes robles = new AtributosTiposComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        id_estados++;
        String tipo_comp = (String) combo_comp.getSelectedItem();
        String atri_comp = (String) combo_atri.getSelectedItem();
        String estado = estado_comp.getText();
        String id_atri = "";

        DefaultComboBoxModel modelo;
        modelo = new DefaultComboBoxModel();

        try {
            ResultSet rs = cone.consultaBD("select IdEstadoAtri from estadosxatri where Estado = '" + atri_comp + "'");
            while (rs.next()) {
                id_atri = rs.getString("IdEstadoAtri");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        cone.modificaBD("INSERT INTO estadoactcomp VALUES(" + id_estados + ",'" + tipo_comp + "','" + atri_comp + "','" + estado + "')");
        cone.modificaBD("UPDATE componentes SET EstadoComp = " + id_estados + " WHERE NombreComp = '" + tipo_comp + "' AND AtriComp ='" + id_atri + "')");
        JOptionPane.showMessageDialog(rootPane, "Estado del atributo creado con éxito");
        estado_comp.setText("");
    }//GEN-LAST:event_anadirActionPerformed

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
            java.util.logging.Logger.getLogger(EstadosTiposComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadosTiposComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadosTiposComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadosTiposComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EstadosTiposComponentes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JButton atras;
    private javax.swing.JComboBox combo_atri;
    private javax.swing.JComboBox combo_comp;
    private javax.swing.JButton continuar;
    private javax.swing.JTextField estado_comp;
    private javax.swing.JLabel ide;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
