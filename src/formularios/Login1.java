/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Animacion.Fade;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import clases.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author steven
 */
public class Login1 extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login1() {
        //Test github version 2.1
        //JASJAS k chido
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/logo2.png")).getImage( ));
        setLocationRelativeTo(null);
       ImageIcon foto = new ImageIcon (getClass().getResource("/images/logo2.png"));
       ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(Logo.getWidth(),Logo.getHeight(),Image.SCALE_DEFAULT));
       Logo.setIcon(icono);
       Fade.JFrameFadeIn(0f, 1f, 0.1f,100,this );
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFContraseña = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Innovasys");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 36));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Iniciar sesion");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 36));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 36));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("E-Mail:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 36));

        jTFCorreo.setBackground(new java.awt.Color(51, 51, 51));
        jTFCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jTFCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTFCorreo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseMoved(evt);
            }
        });
        jTFCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseExited(evt);
            }
        });
        jPanel1.add(jTFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar2.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar2.png"))); // NOI18N
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Registrate como Cliente");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jTFContraseña.setBackground(new java.awt.Color(51, 51, 51));
        jTFContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTFContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jTFContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTFContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTFContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTFContraseñaMouseExited(evt);
            }
        });
        jTFContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jTFContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 30));
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 80, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordOFF.png"))); // NOI18N
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 32, 32));

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario1OFF.png"))); // NOI18N
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 32, 32));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("¿Olvidaste tu constraseña?");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Ingresar como Invitado");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("o");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCorreoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseMoved
        // TODO add your handling code here:
        jTFCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/usuario1ON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(usuario.getWidth(),usuario.getHeight(),Image.SCALE_DEFAULT));
        usuario.setIcon(icono);
    }//GEN-LAST:event_jTFCorreoMouseMoved

    private void jTFCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTFCorreoMouseClicked

    private void jTFCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseEntered
        // TODO add your handling code here:
        jTFCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/usuario1ON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(usuario.getWidth(),usuario.getHeight(),Image.SCALE_DEFAULT));
        usuario.setIcon(icono);
    }//GEN-LAST:event_jTFCorreoMouseEntered

    private void jTFCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseExited
        // TODO add your handling code here:
        jTFCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/usuario1OFF.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(usuario.getWidth(),usuario.getHeight(),Image.SCALE_DEFAULT));
        usuario.setIcon(icono);
    }//GEN-LAST:event_jTFCorreoMouseExited

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mtoUsuarios objeto = new mtoUsuarios();
        objeto.setCorreo(jTFCorreo.getText());
        if (jTFCorreo.getText().isEmpty() || jTFContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error Campos Vacios");
        } else {
            if (objeto.consultarContraseña()) {
                if (objeto.getContraseña().equals(jTFContraseña.getText())) {
                    JOptionPane.showMessageDialog(this, "Bienvenido");
                    VentanaPrincipal2 ventana = new VentanaPrincipal2();
                    ventana.show();
                    Fade.JFrameFadeIn(01f, 0f, 0.1f, 50, this);
                    this.hide();
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario inexistente");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        RegistroClientes clientes = new RegistroClientes();
        clientes.show();
        this.hide();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTFContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaMouseClicked
        // TODO add your handling code here:
        jTFContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/passwordON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(contraseña.getWidth(),contraseña.getHeight(),Image.SCALE_DEFAULT));
        contraseña.setIcon(icono);
    }//GEN-LAST:event_jTFContraseñaMouseClicked

    private void jTFContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaMouseEntered
        // TODO add your handling code here:
        jTFContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/passwordON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(contraseña.getWidth(),contraseña.getHeight(),Image.SCALE_DEFAULT));
        contraseña.setIcon(icono);
    }//GEN-LAST:event_jTFContraseñaMouseEntered

    private void jTFContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaMouseExited
        // TODO add your handling code here:
        jTFContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY));

        ImageIcon foto = new ImageIcon (getClass().getResource("/images/passwordOFF.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(contraseña.getWidth(),contraseña.getHeight(),Image.SCALE_DEFAULT));
        contraseña.setIcon(icono);
    }//GEN-LAST:event_jTFContraseñaMouseExited

    private void jTFContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFContraseñaActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(VentanaPrincipal2.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        RecuperarContraseña form = new RecuperarContraseña();
        form.show();
        this.hide();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTFContraseña;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
