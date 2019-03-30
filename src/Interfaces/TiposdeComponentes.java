package Interfaces;

import Modelo.Conector;
import javax.swing.JOptionPane;

public class TiposdeComponentes extends javax.swing.JFrame {
    private int id_tipocomp = 0;
    Conector cone;
  
    
    public TiposdeComponentes() {
        initComponents();
        mensaje.setText("Bienvenido," + InterfazLogin.usu);
        ide.setText("I.D :" + InterfazLogin.id);
        cone = new Conector();
        setLocationRelativeTo(null);
        setFocusable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ide = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_comp = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        continuar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tipos de Componentes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        jLabel3.setText("Nombre del componente :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 89, -1, -1));
        jPanel1.add(nom_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 109, 220, -1));

        crear.setText("Crear tipo de Componente");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 90, -1));

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        jPanel1.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 260, 110, -1));

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
        CrearComponentes robles = new CrearComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        EstadosActualesComponentes robles = new EstadosActualesComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        id_tipocomp++;

        String nombre = nom_comp.getText();
        cone.modificaBD("INSERT INTO tipocomp VALUES(" + id_tipocomp + ",'" + nombre + ")");
        JOptionPane.showMessageDialog(rootPane, "Tipo de componente creado con éxito");
        nom_comp.setText("");
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
            java.util.logging.Logger.getLogger(TiposdeComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiposdeComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiposdeComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiposdeComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TiposdeComponentes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton continuar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel ide;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField nom_comp;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
