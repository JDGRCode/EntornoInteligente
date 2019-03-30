package Interfaces;

import Modelo.Conector;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CrearUsuarios extends javax.swing.JFrame {

    Conector cone;
    GestionUsuarios gu = new GestionUsuarios();
        

    public CrearUsuarios() {
        initComponents();
        cone = new Conector();
        setLocationRelativeTo(null);
        setFocusable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setTitle("Crear Clientes");

        ImageIcon crear = new ImageIcon(getClass().getResource("/Imagenes/crearCliente.png"));
        ImageIcon cliente = new ImageIcon(crear.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_DEFAULT));
        icono.setIcon(cliente);

        ImageIcon superi = new ImageIcon(getClass().getResource("/Imagenes/superior.png"));
        ImageIcon sup = new ImageIcon(superi.getImage().getScaledInstance(superior.getWidth(), superior.getHeight(), Image.SCALE_DEFAULT));
        superior.setIcon(sup);

        ImageIcon inf = new ImageIcon(getClass().getResource("/Imagenes/superior.png"));
        ImageIcon inferio = new ImageIcon(inf.getImage().getScaledInstance(inferior.getWidth(), inferior.getHeight(), Image.SCALE_DEFAULT));
        inferior.setIcon(inferio);

        System.out.println(gu.tipo);
        
        /*if ( gu.tipo == true ) {
            
            PreparedStatement pst;
            try{
                String query = "SELECT id, nombre, apellido, acudiente, telefono, correo_electronico, id_administrador, estado FROM alumno WHERE id = "+ idCliente +"";
                     pst = con.prepareStatement(query);
                     ResultSet rs = pst.executeQuery();

                    if (rs.next() == true){
                        id = rs.getInt("id");
                        nombre = rs.getString("nombre");
                        apellido = rs.getString("apellido");
                        acudiente = rs.getString("acudiente");
                        telefono = rs.getString("telefono");
                        correo_electronico = rs.getString("correo_electronico");
                        estado = rs.getString("estado");
                        idAdmin = Integer.parseInt(rs.getString("id_administrador"));
                    }

            }catch(SQLException m){
                System.out.println("Ingreso restringido"+m);
            }
            
        }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        superior = new javax.swing.JLabel();
        inferior = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creación Usuarios");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 210, 36));

        nombre.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        nombre.setForeground(new java.awt.Color(153, 153, 153));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setText("Nombre cliente");
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        Fondo.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, 20));

        cedula.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        cedula.setForeground(new java.awt.Color(153, 153, 153));
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.setText("N° Cedula");
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaFocusLost(evt);
            }
        });
        Fondo.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 130, 20));

        telefono.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        telefono.setForeground(new java.awt.Color(153, 153, 153));
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setText("N° Telefono");
        telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoFocusLost(evt);
            }
        });
        Fondo.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 20));

        direccion.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        direccion.setForeground(new java.awt.Color(153, 153, 153));
        direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion.setText("Dirección");
        direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionFocusLost(evt);
            }
        });
        Fondo.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 130, 20));

        correo.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        correo.setForeground(new java.awt.Color(153, 153, 153));
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.setText("Correo Electronico");
        correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoFocusLost(evt);
            }
        });
        Fondo.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 130, 20));

        jButton1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        jButton1.setText("Crear - Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 140, 30));
        Fondo.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 130));

        jLabel2.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione Rol");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 140, -1));

        jComboBox1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Instructor", "Aprendiz" }));
        Fondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 130, 20));
        Fondo.add(superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));
        Fondo.add(inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 590, 40));

        apellido.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        apellido.setForeground(new java.awt.Color(153, 153, 153));
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setText("Apellido cliente");
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoFocusLost(evt);
            }
        });
        Fondo.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 130, 20));

        password.setFont(new java.awt.Font("Swis721 Cn BT", 0, 11)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("Contraseña");
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        Fondo.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
        if (nombre.getText().trim().equals("Nombre cliente")) {
            nombre.setText("");
        }
        nombre.setForeground(Color.blue);

    }//GEN-LAST:event_nombreFocusGained

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if (nombre.getText().trim().equals("")) {
            nombre.setText("Nombre cliente");
        }
        nombre.setForeground(Color.gray);
    }//GEN-LAST:event_nombreFocusLost

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        if (cedula.getText().trim().equals("N° Cedula")) {
            cedula.setText("");
        }
        cedula.setForeground(Color.blue);
    }//GEN-LAST:event_cedulaFocusGained

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost
        if (cedula.getText().trim().equals("")) {
            cedula.setText("N° Cedula");
        }
        cedula.setForeground(Color.gray);
    }//GEN-LAST:event_cedulaFocusLost

    private void telefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFocusGained
        if (telefono.getText().trim().equals("N° Telefono")) {
            telefono.setText("");
        }
        telefono.setForeground(Color.blue);
    }//GEN-LAST:event_telefonoFocusGained

    private void telefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFocusLost
        if (telefono.getText().trim().equals("")) {
            telefono.setText("N° Telefono");
        }
        telefono.setForeground(Color.gray);
    }//GEN-LAST:event_telefonoFocusLost

    private void direccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusGained
        if (direccion.getText().trim().equals("Dirección")) {
            direccion.setText("");
        }
        direccion.setForeground(Color.blue);
    }//GEN-LAST:event_direccionFocusGained

    private void direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusLost
        if (direccion.getText().trim().equals("")) {
            direccion.setText("Direccion");
        }
        direccion.setForeground(Color.gray);
    }//GEN-LAST:event_direccionFocusLost

    private void correoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusGained
        if (correo.getText().trim().equals("Correo Electronico")) {
            correo.setText("");
        }
        correo.setForeground(Color.blue);
    }//GEN-LAST:event_correoFocusGained

    private void correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusLost
        if (correo.getText().trim().equals("")) {
            correo.setText("Correo Electronico");
        }
        correo.setForeground(Color.gray);
    }//GEN-LAST:event_correoFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nom = nombre.getText();
        String ape = apellido.getText();
        String ced = cedula.getText();
        String mail = correo.getText();
        String tel = telefono.getText();
        String dir = direccion.getText();
        String pass = password.getText();
        int rol = ((int) jComboBox1.getSelectedIndex()) + 1;

        cone.modificaBD("INSERT INTO usuarios VALUES(" + ced + ",'" + nom + "','"
                + ape + "','" + tel + "','" + pass + "'," + rol + ",'" + mail + "')");
        JOptionPane.showMessageDialog(rootPane, "Usuario creado con éxito");

        GestionUsuarios.llenarTabla();
        
        if ( gu.tipo == true ) {
            cone.modificaBD("INSERT INTO usuarios VALUES('" + nom + "','"
                + ape + "','" + tel + "','" + pass + "'," + rol + ",'" + mail + "') WHERE Idusuario=" + ced + "");
            
            JOptionPane.showMessageDialog(rootPane, "Usuario actializado con éxito");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void apellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFocusGained
        if (apellido.getText().trim().equals("Apellido cliente")) {
            apellido.setText("");
        }
        apellido.setForeground(Color.blue);
    }//GEN-LAST:event_apellidoFocusGained

    private void apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFocusLost
        if (apellido.getText().trim().equals("")) {
            apellido.setText("Apellido cliente");
        }
        apellido.setForeground(Color.gray);
    }//GEN-LAST:event_apellidoFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
       if (password.getText().trim().equals("Contraseña")) {
            password.setText("");
        }
        password.setForeground(Color.blue);
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().trim().equals("")) {
            password.setText("Contraseña");
        }
        password.setForeground(Color.gray);
    }//GEN-LAST:event_passwordFocusLost

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel inferior;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField password;
    private javax.swing.JLabel superior;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
