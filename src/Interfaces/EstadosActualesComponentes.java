package Interfaces;

import Modelo.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class EstadosActualesComponentes extends javax.swing.JFrame {

    Conector cone;
    private int id_estadoact = 0;

    public EstadosActualesComponentes() {
        initComponents();
        mensaje.setText("Bienvenido," + InterfazLogin.usu);
        ide.setText("I.D :" + InterfazLogin.id);
        cone = new Conector();
        setLocationRelativeTo(null);
        setFocusable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void llenarTabla() {
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        try {
            String titulos[] = {"ID", "IdComponente", "Atributo", "Estado"};
            modelo = new DefaultTableModel(null, titulos);
            String datos[] = new String[4];

            ResultSet rs = cone.consultaBD("SELECT IdComp,AtriComp,EstadoComp FROM componentes");
            while (rs.next()) {
                datos[0] = "" + id_estadoact;
                datos[1] = rs.getString("IdComp");
                datos[2] = rs.getString("AtriComp");
                datos[3] = rs.getString("EstadoComp");
                modelo.addRow(datos);
            }
            tabla_estado.setModel(modelo);

        } catch (SQLException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ide = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_estado = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Estado actual Componentes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ide.setText("I.D 1'144.076.881");
        jPanel1.add(ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, -1));

        mensaje.setText("Bienvenido, Aprendiz Juan Robles");
        jPanel1.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 20));

        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, -1));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 70, -1));

        tabla_estado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "IdComponente", "Atributo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_estado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, 330, 97));

        salir.setText("x");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 20, 50, -1));

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 90, -1));

        jButton1.setText("Crear Componente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        Inicio robles = new Inicio();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        EstadosTiposComponentes robles = new EstadosTiposComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        id_estadoact++;
        llenarTabla();
    }//GEN-LAST:event_cargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TiposdeComponentes robles = new TiposdeComponentes();
        robles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EstadosActualesComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadosActualesComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadosActualesComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadosActualesComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EstadosActualesComponentes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel ide;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla_estado;
    // End of variables declaration//GEN-END:variables
}
