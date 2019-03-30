/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class Simulador extends javax.swing.JFrame {
    static DefaultTableModel modelo;
    static Conector cone;
    private Dimension dim;
        
    public Simulador() {
        initComponents();
        cone= new Conector();
        setResizable(false);

        dim = super.getToolkit().getScreenSize();
        super.setSize(dim);        
        

        ImageIcon logo1=new ImageIcon(getClass().getResource("/Imagenes/fondoT.png"));
        ImageIcon tamaño=new ImageIcon(logo1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(tamaño);       
        
        ImageIcon logo=new ImageIcon(getClass().getResource("/Imagenes/puerta.png"));
        ImageIcon tamaño1=new ImageIcon(logo.getImage().getScaledInstance(puerta.getWidth(), puerta.getHeight(), Image.SCALE_DEFAULT));
        puerta.setIcon(tamaño1);  
        
        ImageIcon logo2=new ImageIcon(getClass().getResource("/Imagenes/LuzApagada.png"));
        ImageIcon tamaño2=new ImageIcon(logo2.getImage().getScaledInstance(luz1.getWidth(), luz1.getHeight(), Image.SCALE_DEFAULT));
        luz1.setIcon(tamaño2);
        
        ImageIcon logo3=new ImageIcon(getClass().getResource("/Imagenes/LuzApagada.png"));
        ImageIcon tamaño3=new ImageIcon(logo3.getImage().getScaledInstance(luz2.getWidth(), luz2.getHeight(), Image.SCALE_DEFAULT));
        luz2.setIcon(tamaño3);
        
        ImageIcon logo4=new ImageIcon(getClass().getResource("/Imagenes/LuzApagada.png"));
        ImageIcon tamaño4=new ImageIcon(logo4.getImage().getScaledInstance(luz3.getWidth(), luz3.getHeight(), Image.SCALE_DEFAULT));
        luz3.setIcon(tamaño4);
        
        /*ImageIcon logo5=new ImageIcon(getClass().getResource("/simulador/on.png"));
        ImageIcon tamaño5=new ImageIcon(logo5.getImage().getScaledInstance(on.getWidth(), on.getHeight(), Image.SCALE_DEFAULT));
        on.setIcon(tamaño5);*/
        
       
        
        setTitle("Simulador");
        
               
    }
public static void llenarTabla(){
    
        try {
            String titulos[]= {"Nombre","Cédula","Rol","Teléfono"};
            modelo=new DefaultTableModel(null, titulos);
            String datos[]= new String[4];
            
            ResultSet rs=cone.consultaBD("SELECT * FROM usuarios");
            while(rs.next()){
                datos[0]=rs.getString("NomUsuario");
                datos[1]=rs.getString("IdUsuario");
                datos[2]=rs.getString("IdRol");
                datos[3]=rs.getString("Telefono");
                modelo.addRow(datos);
            }
            
            //tabla.setModel(modelo);
        
        } catch (SQLException ex) {
            Logger.getLogger(Simulador.class.getName()).log(Level.SEVERE, null, ex);
        }
}
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
        Simulador = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        Componentes = new javax.swing.JButton();
        Estados = new javax.swing.JButton();
        Perfiles = new javax.swing.JButton();
        Horarios = new javax.swing.JButton();
        camon = new javax.swing.JLabel();
        onaire = new javax.swing.JLabel();
        on = new javax.swing.JLabel();
        off = new javax.swing.JLabel();
        luz1 = new javax.swing.JLabel();
        luz2 = new javax.swing.JLabel();
        luz3 = new javax.swing.JLabel();
        abierta = new javax.swing.JLabel();
        puerta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LADO = new javax.swing.JLabel();
        USER = new javax.swing.JLabel();
        SUPERIOR = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        luzbaja = new javax.swing.JButton();
        luzalta = new javax.swing.JButton();
        luzmedia = new javax.swing.JButton();
        luzapagada1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        abiertaa = new javax.swing.JButton();
        cerrada = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        aireoff = new javax.swing.JButton();
        aireon = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        camoff = new javax.swing.JButton();
        camonn = new javax.swing.JButton();
        Clientes1 = new javax.swing.JButton();

        Editar.setText("Editar");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Simulador.setBackground(new java.awt.Color(0, 0, 255));
        Simulador.setForeground(new java.awt.Color(255, 255, 255));
        Simulador.setText("Simulador");
        Simulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimuladorActionPerformed(evt);
            }
        });
        jPanel1.add(Simulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 140, -1));

        Usuarios.setBackground(new java.awt.Color(51, 51, 255));
        Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, -1));

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
        jPanel1.add(camon, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 155, 42, 37));
        jPanel1.add(onaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 122, 13, 13));
        jPanel1.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 248, 17, 27));
        on.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(off, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 248, 17, 27));
        jPanel1.add(luz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 100, 30));
        jPanel1.add(luz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 100, 30));
        jPanel1.add(luz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 100, 30));
        jPanel1.add(abierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 204, 68, 150));
        jPanel1.add(puerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 205, 68, 150));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoT.png"))); // NOI18N
        fondo.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 1090, 590));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LUCES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luzbaja.setText("Baja");
        luzbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzbajaActionPerformed(evt);
            }
        });
        jPanel2.add(luzbaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));

        luzalta.setText("Alta");
        luzalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzaltaActionPerformed(evt);
            }
        });
        jPanel2.add(luzalta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        luzmedia.setText("Media");
        luzmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzmediaActionPerformed(evt);
            }
        });
        jPanel2.add(luzmedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        luzapagada1.setText("Apagar ");
        luzapagada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzapagada1ActionPerformed(evt);
            }
        });
        jPanel2.add(luzapagada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 50, 100, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PUERTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abiertaa.setText("Abierta");
        abiertaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abiertaaActionPerformed(evt);
            }
        });
        jPanel4.add(abiertaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        cerrada.setText("Cerrada");
        cerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerradaActionPerformed(evt);
            }
        });
        jPanel4.add(cerrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 250, 100, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AIRE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aireoff.setText("Apagado");
        aireoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aireoffActionPerformed(evt);
            }
        });
        jPanel5.add(aireoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        aireon.setText("Encendido");
        aireon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aireonActionPerformed(evt);
            }
        });
        jPanel5.add(aireon, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 360, 100, 110));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAMARA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 12))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camoff.setText("Apagada");
        camoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camoffActionPerformed(evt);
            }
        });
        jPanel6.add(camoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        camonn.setText("Encendida");
        camonn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camonnActionPerformed(evt);
            }
        });
        jPanel6.add(camonn, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 480, 100, 110));

        Clientes1.setBackground(new java.awt.Color(0, 0, 255));
        Clientes1.setForeground(new java.awt.Color(255, 255, 255));
        Clientes1.setText("Simulador");
        Clientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes1ActionPerformed(evt);
            }
        });
        jPanel1.add(Clientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SimuladorActionPerformed

    private void ComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComponentesActionPerformed
        EstadosActualesComponentes gComp = new EstadosActualesComponentes();
        gComp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComponentesActionPerformed

    private void EstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadosActionPerformed

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
              
    }//GEN-LAST:event_AnularActionPerformed

    private void luzbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzbajaActionPerformed
        
        ImageIcon logo4=new ImageIcon(getClass().getResource("/Imagenes/luz1.png"));
        ImageIcon tamaño4=new ImageIcon(logo4.getImage().getScaledInstance(luz3.getWidth(), luz3.getHeight(), Image.SCALE_DEFAULT));
        luz3.setIcon(tamaño4);
        
        ImageIcon logo3=new ImageIcon(getClass().getResource("/Imagenes/luz1.png"));
        ImageIcon tamaño3=new ImageIcon(logo3.getImage().getScaledInstance(luz2.getWidth(), luz2.getHeight(), Image.SCALE_DEFAULT));
        luz2.setIcon(tamaño3);
        
        ImageIcon logo2=new ImageIcon(getClass().getResource("/Imagenes/luz1.png"));
        ImageIcon tamaño2=new ImageIcon(logo2.getImage().getScaledInstance(luz1.getWidth(), luz1.getHeight(), Image.SCALE_DEFAULT));
        luz1.setIcon(tamaño2);
        
    }//GEN-LAST:event_luzbajaActionPerformed

    private void luzapagada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzapagada1ActionPerformed
        ImageIcon logo4=new ImageIcon(getClass().getResource("/Imagenes/LuzApagada.png"));
        ImageIcon tamaño4=new ImageIcon(logo4.getImage().getScaledInstance(luz3.getWidth(), luz3.getHeight(), Image.SCALE_DEFAULT));
        luz3.setIcon(tamaño4);
        
        ImageIcon logo3=new ImageIcon(getClass().getResource("/Imagenes/LuzApagada.png"));
        ImageIcon tamaño3=new ImageIcon(logo3.getImage().getScaledInstance(luz2.getWidth(), luz2.getHeight(), Image.SCALE_DEFAULT));
        luz2.setIcon(tamaño3);
        
        ImageIcon logo2=new ImageIcon(getClass().getResource("/Imagenes/LuzApagada.png"));
        ImageIcon tamaño2=new ImageIcon(logo2.getImage().getScaledInstance(luz1.getWidth(), luz1.getHeight(), Image.SCALE_DEFAULT));
        luz1.setIcon(tamaño2);
    }//GEN-LAST:event_luzapagada1ActionPerformed

    private void luzaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzaltaActionPerformed
        ImageIcon logo4=new ImageIcon(getClass().getResource("/Imagenes/luz7.png"));
        ImageIcon tamaño4=new ImageIcon(logo4.getImage().getScaledInstance(luz3.getWidth(), luz3.getHeight(), Image.SCALE_DEFAULT));
        luz3.setIcon(tamaño4);
        
        ImageIcon logo3=new ImageIcon(getClass().getResource("/Imagenes/luz7.png"));
        ImageIcon tamaño3=new ImageIcon(logo3.getImage().getScaledInstance(luz2.getWidth(), luz2.getHeight(), Image.SCALE_DEFAULT));
        luz2.setIcon(tamaño3);
        
        ImageIcon logo2=new ImageIcon(getClass().getResource("/Imagenes/luz7.png"));
        ImageIcon tamaño2=new ImageIcon(logo2.getImage().getScaledInstance(luz1.getWidth(), luz1.getHeight(), Image.SCALE_DEFAULT));
        luz1.setIcon(tamaño2);
    }//GEN-LAST:event_luzaltaActionPerformed

    private void luzmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzmediaActionPerformed
        ImageIcon logo4=new ImageIcon(getClass().getResource("/Imagenes/luz4.png"));
        ImageIcon tamaño4=new ImageIcon(logo4.getImage().getScaledInstance(luz3.getWidth(), luz3.getHeight(), Image.SCALE_DEFAULT));
        luz3.setIcon(tamaño4);
        
        ImageIcon logo3=new ImageIcon(getClass().getResource("/Imagenes/luz4.png"));
        ImageIcon tamaño3=new ImageIcon(logo3.getImage().getScaledInstance(luz2.getWidth(), luz2.getHeight(), Image.SCALE_DEFAULT));
        luz2.setIcon(tamaño3);
        
        ImageIcon logo2=new ImageIcon(getClass().getResource("/Imagenes/luz4.png"));
        ImageIcon tamaño2=new ImageIcon(logo2.getImage().getScaledInstance(luz1.getWidth(), luz1.getHeight(), Image.SCALE_DEFAULT));
        luz1.setIcon(tamaño2);
    }//GEN-LAST:event_luzmediaActionPerformed

    private void abiertaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abiertaaActionPerformed
        ImageIcon logo5=new ImageIcon(getClass().getResource("/Imagenes/on.png"));
        ImageIcon tamaño5=new ImageIcon(logo5.getImage().getScaledInstance(on.getWidth(), on.getHeight(), Image.SCALE_DEFAULT));
        on.setIcon(tamaño5);
        
        ImageIcon logo2=new ImageIcon(getClass().getResource("/Imagenes/puerta.png"));
        ImageIcon tamaño2=new ImageIcon(logo2.getImage().getScaledInstance(abierta.getWidth(), abierta.getHeight(), Image.SCALE_DEFAULT));
        abierta.setIcon(tamaño2);
        
        ImageIcon logo1=new ImageIcon(getClass().getResource("/Imagenes/negro.png"));
        ImageIcon tamaño1=new ImageIcon(logo1.getImage().getScaledInstance(puerta.getWidth(), puerta.getHeight(), Image.SCALE_DEFAULT));
        puerta.setIcon(tamaño1);
        
        abierta.setVisible(true);
    }//GEN-LAST:event_abiertaaActionPerformed

    private void cerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerradaActionPerformed
        ImageIcon logo5=new ImageIcon(getClass().getResource("/Imagenes/off.png"));
        ImageIcon tamaño5=new ImageIcon(logo5.getImage().getScaledInstance(on.getWidth(), on.getHeight(), Image.SCALE_DEFAULT));
        on.setIcon(tamaño5);
        
        abierta.setVisible(false);
        
        ImageIcon logo1=new ImageIcon(getClass().getResource("/Imagenes/puerta.png"));
        ImageIcon tamaño1=new ImageIcon(logo1.getImage().getScaledInstance(puerta.getWidth(), puerta.getHeight(), Image.SCALE_DEFAULT));
        puerta.setIcon(tamaño1);
    }//GEN-LAST:event_cerradaActionPerformed

    private void aireoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aireoffActionPerformed
        
        onaire.setVisible(false);
        
    }//GEN-LAST:event_aireoffActionPerformed

    private void aireonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aireonActionPerformed
        ImageIcon logo5=new ImageIcon(getClass().getResource("/Imagenes/aireon.png"));
        ImageIcon tamaño5=new ImageIcon(logo5.getImage().getScaledInstance(onaire.getWidth(), onaire.getHeight(), Image.SCALE_DEFAULT));
        onaire.setIcon(tamaño5);
        
        onaire.setVisible(true);
    }//GEN-LAST:event_aireonActionPerformed

    private void camoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camoffActionPerformed
        camon.setVisible(false);
    }//GEN-LAST:event_camoffActionPerformed

    private void camonnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camonnActionPerformed
        ImageIcon logo5=new ImageIcon(getClass().getResource("/Imagenes/camon.png"));
        ImageIcon tamaño5=new ImageIcon(logo5.getImage().getScaledInstance(camon.getWidth(), camon.getHeight(), Image.SCALE_DEFAULT));
        camon.setIcon(tamaño5);
        
        camon.setVisible(true);
    }//GEN-LAST:event_camonnActionPerformed

    private void Clientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Clientes1ActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMINISTRADOR;
    private javax.swing.JMenuItem Anular;
    private javax.swing.JButton Clientes1;
    private javax.swing.JButton Componentes;
    private javax.swing.JMenuItem Editar;
    private javax.swing.JButton Estados;
    private javax.swing.JButton Horarios;
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel LADO;
    private javax.swing.JButton Perfiles;
    private javax.swing.JLabel SUPERIOR;
    private javax.swing.JButton Simulador;
    private javax.swing.JLabel USER;
    private javax.swing.JButton Usuarios;
    private javax.swing.JLabel abierta;
    private javax.swing.JButton abiertaa;
    private javax.swing.JButton aireoff;
    private javax.swing.JButton aireon;
    private javax.swing.JButton camoff;
    private javax.swing.JLabel camon;
    private javax.swing.JButton camonn;
    private javax.swing.JButton cerrada;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel luz1;
    private javax.swing.JLabel luz2;
    private javax.swing.JLabel luz3;
    private javax.swing.JButton luzalta;
    private javax.swing.JButton luzapagada1;
    private javax.swing.JButton luzbaja;
    private javax.swing.JButton luzmedia;
    private javax.swing.JLabel off;
    private javax.swing.JLabel on;
    private javax.swing.JLabel onaire;
    private javax.swing.JLabel puerta;
    private javax.swing.JLabel txt_administrador;
    // End of variables declaration//GEN-END:variables
}
